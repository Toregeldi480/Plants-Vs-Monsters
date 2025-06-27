package com.toregeldi.entity.custom;

import com.toregeldi.entity.ai.goal.ShootPeaGoal;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.RangedAttackMob;
import net.minecraft.world.World;

public class RepeaterEntity extends PeashooterEntity implements RangedAttackMob {
    public RepeaterEntity(EntityType<? extends PeashooterEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new ShootPeaGoal(this, 2, 30, 10, 30.0f));
        super.initGoals();
    }
}
