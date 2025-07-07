package com.toregeldi.entity.custom.projectile;

import com.toregeldi.entity.ModEntities;
import com.toregeldi.entity.custom.PlantEntity;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

public class PeaBulletEntity extends SnowballEntity {
    public PeaBulletEntity(EntityType<? extends SnowballEntity> entityType, World world) {
        super(entityType, world);
        this.setNoGravity(true);
    }

    public PeaBulletEntity(World world, LivingEntity owner) {
        super(ModEntities.PEA_BULLET, world);
        this.setOwner(owner);
        this.setNoGravity(true);

        Vec3d spawnPos = owner.getEyePos();
        this.setPosition(spawnPos);

        this.setYaw(owner.getYaw());
        this.setPitch(owner.getPitch());
    }

    @Override
    public void handleStatus(byte status) {
        if(status == 3) {
            for(int i = 0; i < 8; ++i) {
                this.getWorld().addParticle(ParticleTypes.ITEM_SLIME, this.getX(), this.getY(), this.getZ(), 0, 0, 0);
            }
        }
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        Entity entity = entityHitResult.getEntity();
        entity.damage(this.getDamageSources().thrown(this, this.getOwner()), 3.0f);
        super.onEntityHit(entityHitResult);
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        if(hitResult.getType() == HitResult.Type.ENTITY) {
            EntityHitResult entityHit = (EntityHitResult) hitResult;
            if(entityHit.getEntity() instanceof PlantEntity) {
                return;
            }
        }
        if(!this.getWorld().isClient) {
            this.getWorld().sendEntityStatus(this, (byte)3);
            this.discard();
        }
        super.onCollision(hitResult);
    }

    @Override
    public void checkDespawn() {
        if(this.age >= 30 || this.getWorld().getDifficulty() == Difficulty.PEACEFUL) {
            this.remove(RemovalReason.DISCARDED);
        }
    }

    @Override
    public void tick() {
        super.tick();

        Vec3d velocity = this.getVelocity();
        this.setVelocity(velocity);

        checkDespawn();
    }

    @Override
    public DoubleDoubleImmutablePair getKnockback(LivingEntity target, DamageSource source) {
        return DoubleDoubleImmutablePair.of(0, 0);
    }
}