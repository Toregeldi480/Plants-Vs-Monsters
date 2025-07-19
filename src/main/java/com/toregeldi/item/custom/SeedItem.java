package com.toregeldi.item.custom;

import com.toregeldi.entity.custom.PlantEntity;
import com.toregeldi.entity.data.SunDataAccessor;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

import java.util.Objects;

public class SeedItem extends SpawnEggItem {
    private int cooldown;
    private int cost;

    public SeedItem(EntityType<? extends MobEntity> type, int primaryColor, int secondaryColor, Settings settings) {
        super(type, primaryColor, secondaryColor, settings);
    }

    public SeedItem(EntityType<? extends MobEntity> type, Settings settings, int cooldown, int cost) {
        super(type, 0xfffffff, 0xff000000, settings);
        this.cooldown = cooldown;
        this.cost = cost;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();

        if(!(world instanceof ServerWorld)) {
            return ActionResult.SUCCESS;
        } else {
            ItemStack itemStack = context.getStack();
            BlockPos blockPos = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            BlockState blockState = world.getBlockState(blockPos);

            if(!(PlantEntity.ALLOWED_BLOCKS.contains(blockState.getBlock()))) {
                return ActionResult.FAIL;
            }

            EntityType<?> entityType = this.getEntityType(itemStack);
            SunDataAccessor sunAccessor = ((SunDataAccessor)player);
            if(!(player.isCreative()) && sunAccessor.getSunValue() < cost) {
                return ActionResult.FAIL;
            }
            if(entityType.spawnFromItemStack((ServerWorld)world, itemStack, context.getPlayer(), blockPos, SpawnReason.SPAWN_EGG, true, false) != null) {
                world.emitGameEvent(context.getPlayer(), GameEvent.ENTITY_PLACE, blockPos);
                world.playSound(null, blockPos, SoundEvents.BLOCK_GRASS_BREAK, SoundCategory.NEUTRAL);
                if(!(player.isCreative())) {
                    player.getItemCooldownManager().set(this, cooldown);
                    sunAccessor.subtractSunValue(cost);
                }
            }

            return ActionResult.CONSUME;
        }
    }
}
