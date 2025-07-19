package com.toregeldi.item.custom;

import com.toregeldi.entity.custom.UpgradablePlant;
import com.toregeldi.entity.data.SunDataAccessor;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

public class UpgradeSeedItem extends SeedItem {
    private EntityType<? extends MobEntity> type;
    private int cooldown;
    private int cost;

    public UpgradeSeedItem(EntityType<? extends MobEntity> type, int primaryColor, int secondaryColor, Settings settings) {
        super(type, primaryColor, secondaryColor, settings);
    }

    public UpgradeSeedItem(EntityType<? extends MobEntity> type, Settings settings, int cooldown, int cost) {
        super(type, 0xffffffff, 0xff000000, settings);
        this.type = type;
        this.cooldown = cooldown;
        this.cost = cost;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        return ActionResult.PASS;
    }

    @Override
    public ActionResult useOnEntity(ItemStack itemStack, PlayerEntity player, LivingEntity entity, Hand hand) {
        EntityType<?> entityType = this.getEntityType(itemStack);
        SunDataAccessor sunAccessor = ((SunDataAccessor)player);

        if(!(player.isCreative()) && sunAccessor.getSunValue() < cost) {
            return ActionResult.FAIL;
        }
        if(entityType != entity.getType()) {
            return ActionResult.FAIL;
        }

        ((UpgradablePlant)entity).upgrade(true);
        if(!(player.isCreative())) {
            player.getItemCooldownManager().set(this, cooldown);
            sunAccessor.subtractSunValue(cost);
        }

        return ActionResult.SUCCESS;
    }
}
