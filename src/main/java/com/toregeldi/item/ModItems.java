package com.toregeldi.item;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.ModEntities;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PEASHOOTER_CARD = Registry.register(
            Registries.ITEM,
            Identifier.of(PlantsVsMonsters.MOD_ID, "peashooter_card"),
            new SpawnEggItem(ModEntities.PEASHOOTER, 0xffffffff, 0xff000000, new Item.Settings())
    );
    public static final Item REPEATER_CARD = Registry.register(
            Registries.ITEM,
            Identifier.of(PlantsVsMonsters.MOD_ID, "repeater_card"),
            new SpawnEggItem(ModEntities.REPEATER, 0xffffffff, 0xff000000, new Item.Settings())
    );
    public static final Item SNOW_PEA_CARD = Registry.register(
            Registries.ITEM,
            Identifier.of(PlantsVsMonsters.MOD_ID, "snow_pea_card"),
            new SpawnEggItem(ModEntities.SNOW_PEA, 0xffffffff, 0xff000000, new Item.Settings())
    );

    public static void registerItems() {
        PlantsVsMonsters.LOGGER.info("Registering items for " + PlantsVsMonsters.MOD_ID);
    }
}
