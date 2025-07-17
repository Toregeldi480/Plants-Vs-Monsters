package com.toregeldi.item;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.ModEntities;
import com.toregeldi.item.custom.SeedItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PEASHOOTER_SEED = Registry.register(
            Registries.ITEM,
            Identifier.of(PlantsVsMonsters.MOD_ID, "peashooter_seed"),
            new SeedItem(ModEntities.PEASHOOTER, new Item.Settings(), 150, 100)
    );
    public static final Item REPEATER_SEED = Registry.register(
            Registries.ITEM,
            Identifier.of(PlantsVsMonsters.MOD_ID, "repeater_seed"),
            new SeedItem(ModEntities.REPEATER, new Item.Settings(), 150, 200)
    );
    public static final Item SNOW_PEA_SEED = Registry.register(
            Registries.ITEM,
            Identifier.of(PlantsVsMonsters.MOD_ID, "snow_pea_seed"),
            new SeedItem(ModEntities.SNOW_PEA, new Item.Settings(), 150, 175)
    );
    public static final Item CHERRY_BOMB_SEED = Registry.register(
            Registries.ITEM,
            Identifier.of(PlantsVsMonsters.MOD_ID, "cherry_bomb_seed"),
            new SeedItem(ModEntities.CHERRY_BOMB, new Item.Settings(), 1000, 150)
    );
    public static final Item POTATO_MINE_SEED = Registry.register(
            Registries.ITEM,
            Identifier.of(PlantsVsMonsters.MOD_ID, "potato_mine_seed"),
            new SeedItem(ModEntities.POTATO_MINE, new Item.Settings(), 600, 25)
    );
    public static final Item WALL_NUT_SEED = Registry.register(
            Registries.ITEM,
            Identifier.of(PlantsVsMonsters.MOD_ID, "wall_nut_seed"),
            new SeedItem(ModEntities.WALL_NUT, new Item.Settings(), 600, 50)
    );
    public static final Item SUNFLOWER_SEED = Registry.register(
            Registries.ITEM,
            Identifier.of(PlantsVsMonsters.MOD_ID, "sunflower_seed"),
            new SeedItem(ModEntities.SUNFLOWER, new Item.Settings(), 150, 50)
    );
    public static final Item CHOMPER_SEED = Registry.register(
            Registries.ITEM,
            Identifier.of(PlantsVsMonsters.MOD_ID, "chomper_seed"),
            new SeedItem(ModEntities.CHOMPER, new Item.Settings(), 150, 150)
    );

    public static void registerItems() {
        PlantsVsMonsters.LOGGER.info("Registering items for " + PlantsVsMonsters.MOD_ID);
    }
}
