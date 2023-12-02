package com.zer0_the_wolf.layeredarmor.item;

import com.zer0_the_wolf.layeredarmor.LayeredArmor;
//import com.zer0_the_wolf.layeredarmor.item.custom.LayeredArmorItem;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

//import static net.minecraft.world.item.DyeableLeatherItem.DEFAULT_LEATHER_COLOR;

public class LayeredArmoritems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LayeredArmor.MOD_ID);

    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINHELMET = ITEMS.register("lc_helmet",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERCHAIN, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(Items.LEATHER_HELMET)*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINCHESTPLATE = ITEMS.register("lc_chestplate",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERCHAIN, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINLEGGINGS = ITEMS.register("lc_leggings",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERCHAIN, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINBOOTS = ITEMS.register("lc_boots",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERCHAIN, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<DyeableArmorItem> LEATHERIRONHELMET = ITEMS.register("li_helmet",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERIRON, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<DyeableArmorItem> LEATHERIRONCHESTPLATE = ITEMS.register("li_chestplate",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERIRON, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<DyeableArmorItem> LEATHERIRONLEGGINGS = ITEMS.register("li_leggings",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERIRON, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<DyeableArmorItem> LEATHERIRONBOOTS = ITEMS.register("li_boots",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERIRON, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<DyeableArmorItem> LEATHERTURTLEHELMET = ITEMS.register("lt_helmet",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERTURTLE, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<DyeableArmorItem> LEATHERGOLDHELMET = ITEMS.register("lg_helmet",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERGOLD, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<DyeableArmorItem> LEATHERGOLDCHESTPLATE = ITEMS.register("lg_chestplate",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERGOLD, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<DyeableArmorItem> LEATHERGOLDLEGGINGS = ITEMS.register("lg_leggings",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERGOLD, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<DyeableArmorItem> LEATHERGOLDBOOTS = ITEMS.register("lg_boots",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERGOLD, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<DyeableArmorItem> LEATHERDIAMONDHELMET = ITEMS.register("ld_helmet",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERDIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<DyeableArmorItem> LEATHERDIAMONDCHESTPLATE = ITEMS.register("ld_chestplate",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERDIAMOND, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<DyeableArmorItem> LEATHERDIAMONDLEGGINGS = ITEMS.register("ld_leggings",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERDIAMOND, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<DyeableArmorItem> LEATHERDIAMONDBOOTS = ITEMS.register("ld_boots",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERDIAMOND, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<DyeableArmorItem> LEATHERNETHERITEHELMET = ITEMS.register("ln_helmet",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERNETHERITE, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<DyeableArmorItem> LEATHERNETHERITECHESTPLATE = ITEMS.register("ln_chestplate",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERNETHERITE, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<DyeableArmorItem> LEATHERNETHERITELEGGINGS = ITEMS.register("ln_leggings",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERNETHERITE, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<DyeableArmorItem> LEATHERNETHERITEBOOTS = ITEMS.register("ln_boots",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERNETHERITE, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINIRONHELMET = ITEMS.register("lci_helmet",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERCHAINIRON, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmoritems.LEATHERCHAINHELMET.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINIRONCHESTPLATE = ITEMS.register("lci_chestplate",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERCHAINIRON, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmoritems.LEATHERCHAINCHESTPLATE.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINIRONLEGGINGS = ITEMS.register("lci_leggings",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERCHAINIRON, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmoritems.LEATHERCHAINLEGGINGS.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINIRONBOOTS = ITEMS.register("lci_boots",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERCHAINIRON, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmoritems.LEATHERCHAINBOOTS.get())*/));

    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINTURTLEHELMET = ITEMS.register("lct_helmet",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERCHAINTURTLE, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmoritems.LEATHERCHAINHELMET.get())*/));

    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINGOLDHELMET = ITEMS.register("lcg_helmet",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERCHAINGOLD, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmoritems.LEATHERCHAINHELMET.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINGOLDCHESTPLATE = ITEMS.register("lcg_chestplate",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERCHAINGOLD, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmoritems.LEATHERCHAINCHESTPLATE.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINGOLDLEGGINGS = ITEMS.register("lcg_leggings",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERCHAINGOLD, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmoritems.LEATHERCHAINLEGGINGS.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINGOLDBOOTS = ITEMS.register("lcg_boots",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERCHAINGOLD, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmoritems.LEATHERCHAINBOOTS.get())*/));

    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINDIAMONDHELMET = ITEMS.register("lcd_helmet",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERCHAINDIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmoritems.LEATHERCHAINHELMET.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINDIAMONDCHESTPLATE = ITEMS.register("lcd_chestplate",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERCHAINDIAMOND, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmoritems.LEATHERCHAINCHESTPLATE.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINDIAMONDLEGGINGS = ITEMS.register("lcd_leggings",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERCHAINDIAMOND, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmoritems.LEATHERCHAINLEGGINGS.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINDIAMONDBOOTS = ITEMS.register("lcd_boots",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERCHAINDIAMOND, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmoritems.LEATHERCHAINBOOTS.get())*/));

    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINNETHERITEELMET = ITEMS.register("lcn_helmet",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERCHAINNETHERITE, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmoritems.LEATHERCHAINHELMET.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINNETHERITECHESTPLATE = ITEMS.register("lcn_chestplate",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERCHAINNETHERITE, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmoritems.LEATHERCHAINCHESTPLATE.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINNETHERITELEGGINGS = ITEMS.register("lcn_leggings",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERCHAINNETHERITE, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmoritems.LEATHERCHAINLEGGINGS.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINNETHERITEBOOTS = ITEMS.register("lcn_boots",() -> new DyeableArmorItem(LayeredArmorMaterials.LEATHERCHAINNETHERITE, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmoritems.LEATHERCHAINBOOTS.get())*/));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }



}
