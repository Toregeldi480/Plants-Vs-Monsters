package com.toregeldi.entity.ai.goal;

import com.toregeldi.entity.custom.PlantEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.RevengeGoal;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.util.math.Box;

import java.util.Iterator;
import java.util.List;

public class PlantRevengeGoal extends RevengeGoal {
    private PlantEntity mob;
    private Class<?>[] noHelpTypes;

    public PlantRevengeGoal(PlantEntity mob, Class<?>... noRevengeTypes) {
        super(mob, new Class[0]);
        this.mob = mob;
    }

    public boolean shouldContinue() {
        return super.shouldContinue();
    }

    protected void setMobEntityTarget(MobEntity mob, LivingEntity target) {
        mob.setTarget(target);
    }

    @Override
    protected void callSameTypeForRevenge() {
        double d = this.getFollowRange();
        Box box = Box.from(this.mob.getPos()).expand(d, (double)10.0F, d);
        List<? extends MobEntity> list = this.mob.getWorld().getEntitiesByClass(PlantEntity.class, box, EntityPredicates.EXCEPT_SPECTATOR);
        Iterator var5 = list.iterator();

        while(true) {
            MobEntity mobEntity;
            while(true) {
                if (!var5.hasNext()) {
                    return;
                }

                mobEntity = (MobEntity)var5.next();
                if (this.mob != mobEntity && mobEntity.getTarget() == null) {
                    if (this.noHelpTypes == null) {
                        break;
                    }

                    boolean bl = false;

                    for(Class<?> class_ : this.noHelpTypes) {
                        if (mobEntity.getClass() == class_) {
                            bl = true;
                            break;
                        }
                    }

                    if (!bl) {
                        break;
                    }
                }
            }

            this.setMobEntityTarget(mobEntity, this.mob.getAttacker());
        }
    }
}
