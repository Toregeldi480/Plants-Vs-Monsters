package com.toregeldi.entity.custom;

import com.toregeldi.entity.ai.goal.ProduceSunGoal;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class SunflowerEntity extends PlantEntity implements SunProducerMob {
    private int sunValue = 25;

    public SunflowerEntity(EntityType<? extends GolemEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new ProduceSunGoal(this, 400));
        this.goalSelector.add(2, new LookAtEntityGoal(this, HostileEntity.class, 20.0f));
        this.goalSelector.add(3, new LookAtEntityGoal(this, PlayerEntity.class, 20.0f));
        this.goalSelector.add(4, new LookAroundGoal(this));
        super.initGoals();
    }

    @Override
    public void produceSun() {
        SunOrbEntity sunOrb = new SunOrbEntity(this.getWorld(), sunValue);
        sunOrb.setPosition(this.getX(), this.getY() + 1, this.getZ());
        this.playSound(SoundEvents.ENTITY_SNIFFER_DROP_SEED, 1.0f, 0.4f);
        this.getWorld().spawnEntity(sunOrb);
    }
}
