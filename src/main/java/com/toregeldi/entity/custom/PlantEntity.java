package com.toregeldi.entity.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.HashSet;
import java.util.List;

public abstract class PlantEntity extends GolemEntity {
    private int ticksOnWrongBlock = 0;

    public static final HashSet<Block> ALLOWED_BLOCKS = new HashSet<>(List.of(
            Blocks.GRASS_BLOCK,
            Blocks.DIRT,
            Blocks.LILY_PAD
    ));

    protected PlantEntity(EntityType<? extends GolemEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void travel(Vec3d movementInput) {
        if(this.isOnGround()) {
            this.setVelocity(this.getVelocity().multiply(0, 1, 0));
        }
        super.travel(movementInput);
    }

    @Override
    public boolean isCollidable() {
        return true;
    }

    @Override
    public boolean isPushedByFluids() {
        return false;
    }

    @Override
    public boolean hurtByWater() {
        return false;
    }

    @Override
    public boolean damage(DamageSource source, float amount) {
        if((source.getSource() instanceof PlantEntity)) {
            return false;
        }

        return super.damage(source, amount);
    }

    @Override
    public void tick() {
        if(!ALLOWED_BLOCKS.contains(this.getSteppingBlockState().getBlock())) {
            ++this.ticksOnWrongBlock;
            if(ticksOnWrongBlock >= 100) {
                this.damage(this.getDamageSources().dryOut(), 0.5f);
            }
        } else {
            this.ticksOnWrongBlock = 0;
        }

        super.tick();
    }

    @Override
    public ActionResult interactAt(PlayerEntity player, Vec3d hitPos, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);
        if(itemStack.getItem() instanceof ShovelItem) {
            this.playSound(SoundEvents.BLOCK_GRASS_BREAK);
            itemStack.damage(1, player, getSlotForHand(hand));
            this.discard();
        }
        return ActionResult.PASS;
    }

    @Override
    public int getMaxHeadRotation() {
        return 0;
    }

    public static DefaultAttributeContainer.Builder createPlantAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_EXPLOSION_KNOCKBACK_RESISTANCE, 1.0f)
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 1.0f)
                .add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, 0.0f);
    }
}
