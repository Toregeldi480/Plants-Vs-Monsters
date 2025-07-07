package com.toregeldi.entity.custom;

import com.toregeldi.entity.ModEntities;
import com.toregeldi.entity.data.SunDataAccessor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class SunOrbEntity extends Entity {
    private int age;
    private int value = 25;

    public SunOrbEntity(EntityType<?> type, World world) {
        super(type, world);
    }

    public SunOrbEntity(World world, int value) {
        super(ModEntities.SUN_ORB, world);
        this.value = value;
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {

    }

    @Override
    public Vec3d getVelocity() {
        return new Vec3d(0, -0.2f, 0);
    }

    @Override
    public void tick() {
        this.move(MovementType.SELF, this.getVelocity());
        ++this.age;
        if(this.age >= 400) {
            this.discard();
        }
    }

    @Override
    public void onPlayerCollision(PlayerEntity player) {
        if(player instanceof ServerPlayerEntity) {
            if(player instanceof SunDataAccessor accessor) {
                accessor.addSunValue(this.value);
                this.playSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 0.5f, 1.0f);
                this.discard();
            }
        }
    }

    @Override
    protected void readCustomDataFromNbt(NbtCompound nbt) {
        if(nbt.contains("Age")) {
            this.age = nbt.getInt("Age");
        }
        if(nbt.contains("SunValue")) {
            this.value = nbt.getInt("SunValue");
        }
    }

    @Override
    protected void writeCustomDataToNbt(NbtCompound nbt) {
        nbt.putInt("Age", this.age);
        nbt.putInt("SunValue", this.value);
    }
}
