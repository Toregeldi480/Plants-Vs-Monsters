package com.toregeldi.network;

import com.toregeldi.PlantsVsMonsters;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;

public record SunValuePayload(int sunValue) implements CustomPayload {
    public static final Identifier SUN_VALUE_ID = Identifier.of(PlantsVsMonsters.MOD_ID, "sun_value");
    public static final CustomPayload.Id<SunValuePayload> ID = new CustomPayload.Id<>(SUN_VALUE_ID);
    public static final PacketCodec<RegistryByteBuf, SunValuePayload> CODEC = PacketCodec.tuple(PacketCodecs.INTEGER, SunValuePayload::sunValue, SunValuePayload::new);

    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }
}
