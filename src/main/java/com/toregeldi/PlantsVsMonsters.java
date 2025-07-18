package com.toregeldi;

import com.toregeldi.entity.ModEntities;
import com.toregeldi.entity.data.SunDataAccessor;
import com.toregeldi.item.ModItems;
import com.toregeldi.network.SunValuePayload;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlantsVsMonsters implements ModInitializer {
	public static final String MOD_ID = "plants-vs-monsters";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Mod Initialization has started for " + MOD_ID);
		RegistryKey<ItemGroup> PLANTS_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(MOD_ID, "plants"));
		ItemGroup PLANTS_ITEM_GROUP = FabricItemGroup.builder()
				.icon(() -> new ItemStack(ModItems.SUNFLOWER_SEED))
				.displayName(Text.translatable("itemGroup.plants"))
				.build();

		ModItems.registerItems();
		ModEntities.registerEntities();

		Registry.register(Registries.ITEM_GROUP, PLANTS_ITEM_GROUP_KEY, PLANTS_ITEM_GROUP);

		ItemGroupEvents.modifyEntriesEvent(PLANTS_ITEM_GROUP_KEY).register(itemGroup -> {
			itemGroup.add(ModItems.CHERRY_BOMB_SEED);
			itemGroup.add(ModItems.CHOMPER_SEED);
			itemGroup.add(ModItems.PEASHOOTER_SEED);
			itemGroup.add(ModItems.REPEATER_SEED);
			itemGroup.add(ModItems.SNOW_PEA_SEED);
			itemGroup.add(ModItems.SUNFLOWER_SEED);
			itemGroup.add(ModItems.WALL_NUT_SEED);
		});

		PayloadTypeRegistry.playS2C().register(SunValuePayload.ID, SunValuePayload.CODEC);
		ServerPlayConnectionEvents.JOIN.register((handler, packetSender, server) ->
				ServerPlayNetworking.send(handler.player, new SunValuePayload(((SunDataAccessor)handler.player).getSunValue())));
	}
}