package com.zer0_the_wolf.layeredarmor.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;

import static com.zer0_the_wolf.layeredarmor.item.LayeredArmorItems.*;

public class LayeredArmorItem extends DyeableArmorItem {
    public LayeredArmorItem(ArmorMaterial pMaterial, EquipmentSlot pSlot, Properties pProperties) {
        super(pMaterial, pSlot, pProperties);
    }
    @Override
    public boolean canWalkOnPowderedSnow(ItemStack stack, LivingEntity wearer)
    {
        return (stack.is(Items.LEATHER_BOOTS) ||
                stack.is(LEATHERCHAINBOOTS.get()) ||
                stack.is(LEATHERIRONBOOTS.get())  ||
                stack.is(LEATHERGOLDBOOTS.get()) ||
                stack.is(LEATHERDIAMONDBOOTS.get())  ||
                stack.is(LEATHERNETHERITEBOOTS.get())  ||
                stack.is(LEATHERCHAINIRONBOOTS.get()) ||
                stack.is(LEATHERCHAINGOLDBOOTS.get()) ||
                stack.is(LEATHERCHAINDIAMONDBOOTS.get()) ||
                stack.is(LEATHERCHAINNETHERITEBOOTS.get())
            );

    }

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer)
    {
        return stack.getItem() instanceof ArmorItem && (((ArmorItem) stack.getItem()).getMaterial() == ArmorMaterials.GOLD || ((ArmorItem) stack.getItem()).getMaterial() == LayeredArmorMaterials.LEATHERCHAINGOLD || ((ArmorItem) stack.getItem()).getMaterial() == LayeredArmorMaterials.LEATHERGOLD);
    }
}
