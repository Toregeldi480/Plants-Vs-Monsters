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
            new SeedItem(ModEntities.PEASHOOTER, 0xffffffff, 0xff000000, new Item.Settings())
    );
    public static final Item REPEATER_SEED = Registry.register(
            Registries.ITEM,
            Identifier.of(PlantsVsMonsters.MOD_ID, "repeater_seed"),
            new SeedItem(ModEntities.REPEATER, 0xffffffff, 0xff000000, new Item.Settings())
    );
    public static final Item SNOW_PEA_SEED = Registry.register(
            Registries.ITEM,
            Identifier.of(PlantsVsMonsters.MOD_ID, "snow_pea_seed"),
            new SeedItem(ModEntities.SNOW_PEA, 0xffffffff, 0xff000000, new Item.Settings())
    );
    public static final Item CHERRY_BOMB_SEED = Registry.register(
            Registries.ITEM,
            Identifier.of(PlantsVsMonsters.MOD_ID, "cherry_bomb_seed"),
            new SeedItem(ModEntities.CHERRY_BOMB, 0xffffffff, 0xff000000, new Item.Settings())
    );
    public static final Item POTATO_MINE_SEED = Registry.register(
            Registries.ITEM,
            Identifier.of(PlantsVsMonsters.MOD_ID, "potato_mine_seed"),
            new SeedItem(ModEntities.POTATO_MINE, 0xffffffff, 0xff000000, new Item.Settings())
    );

    public static void registerItems() {
        PlantsVsMonsters.LOGGER.info("Registering items for " + PlantsVsMonsters.MOD_ID);
    }
}
