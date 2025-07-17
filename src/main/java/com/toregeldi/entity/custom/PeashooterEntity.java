package com.toregeldi.entity.custom;

import com.toregeldi.entity.ai.goal.ShootPeaGoal;
import com.toregeldi.entity.custom.projectile.PeaBulletEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.RangedAttackMob;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class PeashooterEntity extends PlantEntity implements RangedAttackMob {
    public PeashooterEntity(EntityType<? extends PlantEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new ShootPeaGoal(this, 1, 30, 0, 30.0f));
        super.initGoals();
    }

    @Override
    public void shootAt(LivingEntity target, float pullProgress) {
        PeaBulletEntity bullet = new PeaBulletEntity(this.getWorld(), this);
        double d = target.getEyeY() - this.getEyeY();
        double e = target.getX() - this.getX();
        double g = target.getZ() - this.getZ();
        bullet.setVelocity(e, d, g, 1.0f, 0);
        this.playSound(SoundEvents.ENTITY_SNOW_GOLEM_SHOOT, 1.0f, 0.4f / (this.getRandom().nextFloat() * 0.4f + 0.8f));
        this.getWorld().spawnEntity(bullet);
    }
}