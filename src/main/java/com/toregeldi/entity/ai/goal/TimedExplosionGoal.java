package com.toregeldi.entity.ai.goal;

import com.toregeldi.entity.custom.ExplodeableMob;
import net.minecraft.entity.ai.goal.Goal;

public class TimedExplosionGoal extends Goal {
    private ExplodeableMob mob;
    private int timer;

    public TimedExplosionGoal(ExplodeableMob mob, int timer) {
        this.mob = mob;
        this.timer = timer;
    }

    @Override
    public boolean canStart() {
        return true;
    }

    @Override
    public boolean shouldRunEveryTick() {
        return true;
    }

    @Override
    public void tick() {
        if(this.timer <= 0) {
            this.mob.explode();
        }

        --this.timer;

        super.tick();
    }
}
