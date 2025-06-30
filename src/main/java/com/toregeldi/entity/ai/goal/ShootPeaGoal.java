package com.toregeldi.entity.ai.goal;

import com.toregeldi.entity.custom.PeashooterEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.util.math.MathHelper;

import java.util.EnumSet;

public class ShootPeaGoal extends Goal {
    private PeashooterEntity mob;
    private int peasFired;
    private int peasCount;
    private int peaCooldown;
    private int fireCooldown;
    private float maxShootRange;

    public ShootPeaGoal(PeashooterEntity mob, int peasCount, int peaCooldown, int fireCooldown, float maxShootRange) {
        this.mob = mob;
        this.peasCount = peasCount;
        this.peaCooldown = peaCooldown;
        this.fireCooldown = fireCooldown;
        this.maxShootRange = maxShootRange;
        this.setControls(EnumSet.of(Control.MOVE, Control.LOOK));
    }

    @Override
    public boolean canStart() {
        LivingEntity livingEntity = this.mob.getTarget();
        return livingEntity != null && livingEntity.isAlive() && this.mob.canTarget(livingEntity);
    }

    @Override
    public void start() {
        this.peasFired = 0;
    }

    @Override
    public boolean shouldRunEveryTick() {
        return true;
    }

    @Override
    public void tick() {
        --this.fireCooldown;
        LivingEntity livingEntity = this.mob.getTarget();
        if(livingEntity != null) {
            boolean bl  = this.mob.getVisibilityCache().canSee(livingEntity);

            double d = this.mob.squaredDistanceTo(livingEntity);
            if(d < this.maxShootRange * this.maxShootRange && bl) {
                if(fireCooldown <= 0) {
                    ++this.peasFired;
                    if(peasFired < peasCount) {
                        fireCooldown = -1;
                    } else {
                        fireCooldown = peaCooldown;
                        peasFired = 0;
                    }

                    float f = (float)Math.sqrt(d) / this.maxShootRange;
                    float g = MathHelper.clamp(f, 0.1F, 1.0F);
                    this.mob.shootAt(livingEntity, g);
                }

                this.mob.getLookControl().lookAt(livingEntity, 30.0F, 30.0F);
            }

            super.tick();
        }
    }
}
