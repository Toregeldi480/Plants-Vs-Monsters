package com.toregeldi.entity.ai.goal;

import com.toregeldi.entity.custom.ChomperEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;

public class ChompGoal extends Goal {
    private final ChomperEntity mob;
    private final int cooldown;
    private int chompCooldown = 0;

    public ChompGoal(ChomperEntity mob, int cooldown) {
        this.mob = mob;
        this.cooldown = cooldown;
    }

    @Override
    public boolean canStart() {
        LivingEntity livingEntity = this.mob.getTarget();
        return livingEntity != null && livingEntity.isAlive() && this.mob.canTarget(livingEntity);
    }

    @Override
    public boolean shouldRunEveryTick() {
        return true;
    }

    @Override
    public void tick() {
        LivingEntity target = this.mob.getTarget();

        if(this.chompCooldown > 0) {
            --this.chompCooldown;
        }

        if(this.chompCooldown <= 0 &&  target != null && this.mob.squaredDistanceTo(target) <= 4.0f) {
            this.mob.chomp(target);
            this.chompCooldown = this.cooldown;
        }
    }
}
