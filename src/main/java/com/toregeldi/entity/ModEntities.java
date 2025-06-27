package com.toregeldi.entity;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.custom.PeashooterEntity;
import com.toregeldi.entity.custom.RepeaterEntity;
import com.toregeldi.entity.custom.SnowPeaEntity;
import com.toregeldi.entity.custom.projectile.PeaBulletEntity;
import com.toregeldi.entity.custom.projectile.SnowPeaBulletEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
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

    public static void registerEntities() {
        PlantsVsMonsters.LOGGER.info("Registering entities for " + PlantsVsMonsters.MOD_ID);
        FabricDefaultAttributeRegistry.register(ModEntities.PEASHOOTER, PeashooterEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.REPEATER, PeashooterEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.SNOW_PEA, PeashooterEntity.createMobAttributes());
    }
}
