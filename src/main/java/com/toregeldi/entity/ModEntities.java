package com.toregeldi.entity;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.custom.*;
import com.toregeldi.entity.custom.projectile.PeaBulletEntity;
import com.toregeldi.entity.custom.projectile.SnowPeaBulletEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<PeashooterEntity> PEASHOOTER = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(PlantsVsMonsters.MOD_ID, "peashooter"),
            EntityType.Builder.create(PeashooterEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1.0f, 1.4f).build("peashooter")
    );
    public static final EntityType<RepeaterEntity> REPEATER = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(PlantsVsMonsters.MOD_ID, "repeater"),
            EntityType.Builder.create(RepeaterEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1.0f, 1.4f).build("repeater")
    );
    public static final EntityType<SnowPeaEntity> SNOW_PEA = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(PlantsVsMonsters.MOD_ID, "snow_pea"),
            EntityType.Builder.create(SnowPeaEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1.0f, 1.4f).build("snow_pea")
    );
    public static final EntityType<CherryBombEntity> CHERRY_BOMB = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(PlantsVsMonsters.MOD_ID, "cherry_bomb"),
            EntityType.Builder.create(CherryBombEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1.0f, 0.8f).build("cherry_bomb")
    );
    public static final EntityType<PotatoMineEntity> POTATO_MINE = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(PlantsVsMonsters.MOD_ID, "potato_mine"),
            EntityType.Builder.create(PotatoMineEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1.0f, 0.4f).build("potato_mine")
    );
    public static final EntityType<WallNutEntity> WALL_NUT = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(PlantsVsMonsters.MOD_ID, "wall_nut"),
            EntityType.Builder.create(WallNutEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1.0f, 1.4f).build("wall_nut")
    );
    public static final EntityType<SunflowerEntity> SUNFLOWER = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(PlantsVsMonsters.MOD_ID, "sunflower"),
            EntityType.Builder.create(SunflowerEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1.0f, 1.2f).build("sunflower")
    );
    public static final EntityType<ChomperEntity> CHOMPER = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(PlantsVsMonsters.MOD_ID, "chomper"),
            EntityType.Builder.create(ChomperEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1.0f, 1.1f).build("chomper")
    );


    public static final EntityType<PeaBulletEntity> PEA_BULLET = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(PlantsVsMonsters.MOD_ID, "pea_bullet"),
            EntityType.Builder.<PeaBulletEntity>create(PeaBulletEntity::new, SpawnGroup.MISC)
                    .dimensions(0.1f, 0.1f).build("pea_bullet")
    );
    public static final EntityType<SnowPeaBulletEntity> SNOW_PEA_BULLET = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(PlantsVsMonsters.MOD_ID, "snow_pea_bullet"),
            EntityType.Builder.<SnowPeaBulletEntity>create(SnowPeaBulletEntity::new, SpawnGroup.MISC)
                    .dimensions(0.1f, 0.1f).build("snow_pea_bullet")
    );
    public static final EntityType<SunOrbEntity> SUN_ORB = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(PlantsVsMonsters.MOD_ID, "sun_orb"),
            EntityType.Builder.<SunOrbEntity>create(SunOrbEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5f, 0.5f).build("sun_orb")
    );

    public static void registerEntities() {
        PlantsVsMonsters.LOGGER.info("Registering entities for " + PlantsVsMonsters.MOD_ID);
        FabricDefaultAttributeRegistry.register(ModEntities.PEASHOOTER, PeashooterEntity.createPlantAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0f));
        FabricDefaultAttributeRegistry.register(ModEntities.REPEATER, RepeaterEntity.createPlantAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0f));
        FabricDefaultAttributeRegistry.register(ModEntities.SNOW_PEA, SnowPeaEntity.createPlantAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0f));
        FabricDefaultAttributeRegistry.register(ModEntities.CHERRY_BOMB, CherryBombEntity.createPlantAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 1000.0f));
        FabricDefaultAttributeRegistry.register(ModEntities.POTATO_MINE, PotatoMineEntity.createPlantAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0f));
        FabricDefaultAttributeRegistry.register(ModEntities.WALL_NUT, WallNutEntity.createPlantAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 265.0f));
        FabricDefaultAttributeRegistry.register(ModEntities.SUNFLOWER, SunflowerEntity.createPlantAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0f));
        FabricDefaultAttributeRegistry.register(ModEntities.CHOMPER, ChomperEntity.createPlantAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0f));
    }
}
