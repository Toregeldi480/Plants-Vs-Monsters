package com.toregeldi.entity.custom.projectile;

import com.toregeldi.entity.ModEntities;
import com.toregeldi.entity.custom.PeashooterEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

public class SnowPeaBulletEntity extends PeaBulletEntity {
    private int timeTraveled = 0;

    public SnowPeaBulletEntity(EntityType<? extends SnowballEntity> entityType, World world) {
        super(entityType, world);
        this.setNoGravity(true);
    }

    public SnowPeaBulletEntity(World world, LivingEntity owner) {
        super(ModEntities.SNOW_PEA_BULLET, world);
        this.setOwner(owner);
        this.setNoGravity(true);

        Vec3d spawnPos = owner.getEyePos();
        this.setPosition(spawnPos);

        this.setYaw(owner.getYaw());
        this.setPitch(owner.getPitch());
    }

    @Override
    public void handleStatus(byte status) {
        if (status == 3) {
            for(int i = 0; i < 8; ++i) {
                this.getWorld().addParticle(ParticleTypes.SNOWFLAKE, this.getX(), this.getY(), this.getZ(),0, 0, 0);
            }
        }
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        LivingEntity entity = (LivingEntity) entityHitResult.getEntity();
        if (entity instanceof PeashooterEntity) {
            return;
        }
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 60));
        super.onEntityHit(entityHitResult);
    }

    @Override
    public void tick() {
        super.tick();
        this.getWorld().addParticle(ParticleTypes.SNOWFLAKE, this.getX(), this.getY(), this.getZ(), 0, 0, 0);
    }
}
