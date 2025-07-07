package com.toregeldi.mixin;

import com.toregeldi.entity.data.SunDataAccessor;
import com.toregeldi.network.SunValuePayload;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.network.ServerPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin implements SunDataAccessor {
    @Unique
    private int sunAmount;

    @Override
    public int getSunValue() {
        return this.sunAmount;
    }

    @Override
    public void setSunValue(int value) {
        this.sunAmount = value;
        syncData();
    }

    @Override
    public void addSunValue(int value) {
        this.setSunValue(this.sunAmount + value);
        syncData();
    }

    @Override
    public void subtractSunValue(int value) {
        this.setSunValue(this.sunAmount - value);
        syncData();
    }

    public void syncData() {
        ServerPlayNetworking.send((ServerPlayerEntity)(Object)this, new SunValuePayload(this.sunAmount));
    }

    @Inject(method = "writeCustomDataToNbt", at = @At("TAIL"))
    private void writeSunData(NbtCompound nbt, CallbackInfo ci) {
        nbt.putInt("SunAmount", this.sunAmount);
    }

    @Inject(method = "readCustomDataFromNbt", at = @At("TAIL"))
    private void readSunData(NbtCompound nbt, CallbackInfo ci) {
        if (nbt.contains("SunAmount")) {
            this.sunAmount = nbt.getInt("SunAmount");
        }
    }
}
