package com.toregeldi.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class WallNutEntity extends PlantEntity {
    public WallNutEntity(EntityType<? extends GolemEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new LookAtEntityGoal(this, HostileEntity.class, 20.0f));
        this.goalSelector.add(2, new LookAtEntityGoal(this, PlayerEntity.class, 20.0f));
        this.goalSelector.add(3, new LookAroundGoal(this));
        super.initGoals();
    }
}
