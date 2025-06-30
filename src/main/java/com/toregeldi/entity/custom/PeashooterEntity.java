package com.toregeldi.entity.custom;

import com.toregeldi.entity.ai.goal.ShootPeaGoal;
import com.toregeldi.entity.custom.projectile.PeaBulletEntity;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.RangedAttackMob;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.mob.GhastEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class PeashooterEntity extends PlantEntity implements RangedAttackMob {
    public PeashooterEntity(EntityType<? extends PlantEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new ShootPeaGoal(this, 1, 30, 0, 30.0f));
        this.goalSelector.add(2, new LookAtEntityGoal(this, HostileEntity.class, 30.0f, 100.0f, true));
        this.goalSelector.add(3, new LookAtEntityGoal(this, PlayerEntity.class, 15.0f));
        this.goalSelector.add(4, new LookAroundGoal(this));
        this.targetSelector.add(1, new RevengeGoal(this));
        this.targetSelector.add(2, new ActiveTargetGoal(this, MobEntity.class, 10, true, false, (entity) -> entity instanceof Monster));
        this.targetSelector.add(3, new UniversalAngerGoal(this, true));
    }

    @Override
    public void shootAt(LivingEntity target, float pullProgress) {
        PeaBulletEntity bullet = new PeaBulletEntity(this.getWorld(), this);
        double d = target.getEyeY() - this.getEyeY();
        double e = target.getX() - this.getX();
        double g = target.getZ() - this.getZ();
        bullet.setVelocity(e, d, g, 1.0f, 0);
        this.playSound(SoundEvents.ENTITY_SNOW_GOLEM_SHOOT, 1.0F, 0.4F / (this.getRandom().nextFloat() * 0.4F + 0.8F));
        this.getWorld().spawnEntity(bullet);
    }
}