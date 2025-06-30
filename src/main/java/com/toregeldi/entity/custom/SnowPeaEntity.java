package com.toregeldi.entity.custom;

import com.toregeldi.entity.custom.projectile.SnowPeaBulletEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class SnowPeaEntity extends PeashooterEntity {
    public SnowPeaEntity(EntityType<? extends PeashooterEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void shootAt(LivingEntity target, float pullProgress) {
        SnowPeaBulletEntity bullet = new SnowPeaBulletEntity(this.getWorld(), this);
        double d = target.getEyeY() - this.getEyeY();
        double e = target.getX() - this.getX();
        double g = target.getZ() - this.getZ();
        bullet.setVelocity(e, d, g, 1.0f, 0);
        this.playSound(SoundEvents.ENTITY_SNOW_GOLEM_SHOOT, 1.0F, 0.4F / (this.getRandom().nextFloat() * 0.4F + 0.8F));
        this.getWorld().spawnEntity(bullet);
    }

    @Override
    public boolean isFireImmune() {
        return true;
    }
}
