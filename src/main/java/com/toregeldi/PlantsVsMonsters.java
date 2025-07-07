package com.toregeldi;

import com.toregeldi.entity.ModEntities;
import com.toregeldi.entity.data.SunDataAccessor;
import com.toregeldi.item.ModItems;
import com.toregeldi.network.SunValuePayload;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlantsVsMonsters implements ModInitializer {
	public static final String MOD_ID = "plants-vs-monsters";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Mod Initialization has started for " + MOD_ID);
		ModItems.registerItems();
		ModEntities.registerEntities();

		PayloadTypeRegistry.playS2C().register(SunValuePayload.ID, SunValuePayload.CODEC);
		ServerPlayConnectionEvents.JOIN.register((handler, packetSender, server) ->
				ServerPlayNetworking.send(handler.player, new SunValuePayload(((SunDataAccessor)handler.player).getSunValue())));
	}
}