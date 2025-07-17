package com.toregeldi.entity.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class PotatoMineEntity extends PlantEntity implements ExplodeableMob{
    private static final TrackedData<Boolean> READY_TO_EXPLODE = DataTracker.registerData(PotatoMineEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
        builder.add(READY_TO_EXPLODE, false);
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        this.setReadyToExplode(nbt.getBoolean("ReadyToExplode"));
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        nbt.putBoolean("ReadyToExplode", this.isReadyToExplode());
    }

    public boolean isReadyToExplode() {
        return this.dataTracker.get(READY_TO_EXPLODE);
    }

    public void setReadyToExplode(boolean ready) {
        this.dataTracker.set(READY_TO_EXPLODE, ready);
    }

    public PotatoMineEntity(EntityType<? extends GolemEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void tick() {
        this.getWorld().getOtherEntities(this, this.getBoundingBox().expand(0.2f)).forEach(entity -> {
            if(entity instanceof HostileEntity && this.isReadyToExplode()) {
                this.explode();
                entity.damage(this.getDamageSources().mobAttack(this), 120.0f);
            }
        });
        if(this.age >= 300) {
            this.setReadyToExplode(true);
        }
        super.tick();
    }

    @Override
    public void explode() {
        World world = this.getWorld();
        if(!world.isClient) {
            world.createExplosion(this, this.getX(), this.getY() + 1.0f, this.getZ(), 1.2f, World.ExplosionSourceType.MOB);

            this.dead = true;
            this.discard();
        }
    }


    @Override
    public boolean canExplosionDestroyBlock(Explosion explosion, BlockView world, BlockPos pos, BlockState state, float explosionPower) {
        return false;
    }
}
