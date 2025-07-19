package com.toregeldi.entity.custom;

import com.toregeldi.entity.ai.goal.ShootPeaGoal;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.RangedAttackMob;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.World;

public class RepeaterEntity extends PeashooterEntity implements RangedAttackMob, UpgradablePlant {
    private static final TrackedData<Boolean> UPGRADED = DataTracker.registerData(RepeaterEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

    public RepeaterEntity(EntityType<? extends PeashooterEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
        builder.add(UPGRADED, false);
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        this.upgrade(nbt.getBoolean("Upgraded"));
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        nbt.putBoolean("Upgraded", this.isUpgraded());
    }

    public boolean isUpgraded() {
        return this.dataTracker.get(UPGRADED);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new ShootPeaGoal(this, 2, 30, 10, 30.0f));
        super.initGoals();
    }

    @Override
    public void upgrade(boolean bl) {
        this.dataTracker.set(UPGRADED, bl);
    }
}
