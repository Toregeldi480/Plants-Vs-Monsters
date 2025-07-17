package com.toregeldi.entity.custom;

import com.toregeldi.entity.ai.goal.ChompGoal;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class ChomperEntity extends PlantEntity {
    public ChomperEntity(EntityType<? extends GolemEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new ChompGoal(this, 840));
        super.initGoals();
    }

    public void chomp(LivingEntity target) {
        target.damage(this.getDamageSources().mobAttack(this), 10.0f);
        this.playSound(SoundEvents.ENTITY_GENERIC_EAT, 1.0f, 0.4f);
    }
}
