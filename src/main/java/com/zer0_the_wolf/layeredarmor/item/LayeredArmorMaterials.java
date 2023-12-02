package com.zer0_the_wolf.layeredarmor.item;

import com.zer0_the_wolf.layeredarmor.LayeredArmor;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum LayeredArmorMaterials implements ArmorMaterial{

    LEATHERCHAIN("leather_chainmail", 20, new int[]{3, 8, 6, 2}, 15, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.IRON_INGOT);
    }),
    LEATHERIRON("leather_iron", 20, new int[]{3, 9, 7, 3}, 15, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.IRON_INGOT);
    }),
    LEATHERTURTLE("leather_turtle", 30, new int[]{3, 9, 7, 3}, 15, SoundEvents.ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.SCUTE);
    }),
    LEATHERGOLD("leather_gold", 12, new int[]{3, 8, 5, 2}, 25, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.GOLD_INGOT);
    }),
    LEATHERDIAMOND("leather_diamond", 38, new int[]{4, 11, 8, 4}, 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
        return Ingredient.of(Items.DIAMOND);
    }),
    LEATHERNETHERITE("leather_netherite", 42, new int[]{4, 11, 8, 4}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.of(Items.NETHERITE_INGOT);
    }),
    LEATHERCHAINIRON("leather_chainmail_iron", 35, new int[]{5, 14, 11, 4}, 15, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.IRON_INGOT);
    }),
    LEATHERCHAINTURTLE("leather_chainmail_turtle", 45, new int[]{5, 14, 11, 4}, 15, SoundEvents.ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.SCUTE);
    }),
    LEATHERCHAINGOLD("leather_chainmail_gold", 27, new int[]{5, 13, 9, 3}, 25, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.GOLD_INGOT);
    }),
    LEATHERCHAINDIAMOND("leather_chainmail_diamond", 53, new int[]{6, 16, 12, 5}, 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
        return Ingredient.of(Items.DIAMOND);
    }),
    LEATHERCHAINNETHERITE("leather_chainmail_netherite", 57, new int[]{6, 16, 12, 5}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.of(Items.NETHERITE_INGOT);
    });

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;



    private LayeredArmorMaterials(String pName, int pDurabilityMultiplier, int[] pSlotProtections, int pEnchantmentValue, SoundEvent pSound, float pToughness, float pKnockbackResistance, Supplier<Ingredient> pRepairIngredient) {
        this.name = pName;
        this.durabilityMultiplier = pDurabilityMultiplier;
        this.slotProtections = pSlotProtections;
        this.enchantmentValue = pEnchantmentValue;
        this.sound = pSound;
        this.toughness = pToughness;
        this.knockbackResistance = pKnockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(pRepairIngredient);

    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return LayeredArmor.MOD_ID+":"+this.name;
    }

    public float getToughness() {
        return this.toughness;
    }



    /**
     * Gets the percentage of knockback resistance provided by armor of the material.
     */
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
