package com.toregeldi.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.world.World;

public class WallNutEntity extends PlantEntity {
    public WallNutEntity(EntityType<? extends GolemEntity> entityType, World world) {
        super(entityType, world);
    }
}
