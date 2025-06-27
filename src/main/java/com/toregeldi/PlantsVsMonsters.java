package com.toregeldi;

import com.toregeldi.entity.ModEntities;
import com.toregeldi.item.ModItems;
import net.fabricmc.api.ModInitializer;

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
	}
}