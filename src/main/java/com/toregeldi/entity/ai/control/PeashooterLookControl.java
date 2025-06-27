package com.toregeldi.entity.ai.control;

import net.minecraft.entity.ai.control.LookControl;
import net.minecraft.entity.mob.MobEntity;

public class PeashooterLookControl extends LookControl {
    public PeashooterLookControl(MobEntity entity) {
        super(entity);
    }

    protected void clampHeadYaw() {
    }
}
