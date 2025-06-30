package com.toregeldi.entity.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class PotatoMineEntity extends PlantEntity implements ExplodeableMob{
    public int readyToExplode = 300;
    private float explosionRadius = 1.2f;

    public PotatoMineEntity(EntityType<? extends GolemEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void tick() {
        this.getWorld().getOtherEntities(this, this.getBoundingBox().expand(0.2f)).forEach(entity -> {
            if(entity instanceof HostileEntity && readyToExplode <= 0) {
                this.explode();
                entity.damage(this.getDamageSources().mobAttack(this), 20.0f);
            }
        });
        if(readyToExplode >= 0) {
            --readyToExplode;
        }
        super.tick();
    }

    @Override
    public void explode() {
        World world = this.getWorld();
        if(!world.isClient) {
            world.createExplosion(this, this.getX(), this.getY() + 1.0f, this.getZ(), this.explosionRadius, World.ExplosionSourceType.MOB);

            this.dead = true;
            this.discard();
        }
    }


    @Override
    public boolean canExplosionDestroyBlock(Explosion explosion, BlockView world, BlockPos pos, BlockState state, float explosionPower) {
        return false;
    }
}
