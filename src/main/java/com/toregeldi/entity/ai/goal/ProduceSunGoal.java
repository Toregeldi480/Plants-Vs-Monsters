package com.toregeldi.entity.ai.goal;

import com.toregeldi.entity.custom.SunProducerMob;
import net.minecraft.entity.ai.goal.Goal;

public class ProduceSunGoal extends Goal {
    private final SunProducerMob mob;
    private final int cooldown;
    private int sunCooldown;

    public ProduceSunGoal(SunProducerMob mob, int cooldown) {
       this.mob = mob;
       this.cooldown = cooldown;
       this.sunCooldown = cooldown;
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
        --this.sunCooldown;
        if(this.sunCooldown <= 0) {
            this.mob.produceSun();
            this.sunCooldown = cooldown;
        }

        super.tick();
    }
}
