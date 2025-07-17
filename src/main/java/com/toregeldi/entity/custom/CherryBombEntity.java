package com.toregeldi.entity.custom;

import com.toregeldi.entity.ai.goal.TimedExplosionGoal;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class CherryBombEntity extends PlantEntity implements ExplodeableMob {
    public CherryBombEntity(EntityType<? extends PlantEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new TimedExplosionGoal(this, 30));
        super.initGoals();
    }

    @Override
    public void explode() {
        World world = this.getWorld();
        if(!world.isClient) {
            world.createExplosion(this, this.getX(), this.getY(), this.getZ(), 4.0f, World.ExplosionSourceType.MOB);
            this.dead = true;
            this.discard();
        }
    }

    @Override
    public boolean canExplosionDestroyBlock(Explosion explosion, BlockView world, BlockPos pos, BlockState state, float explosionPower) {
        return false;
    }
}
