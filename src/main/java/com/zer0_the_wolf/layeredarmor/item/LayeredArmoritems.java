package com.zer0_the_wolf.layeredarmor.item;

import com.zer0_the_wolf.layeredarmor.LayeredArmor;
import net.minecraft.util.ModCheck;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LayeredArmoritems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LayeredArmor.MOD_ID);

    public static final RegistryObject<Item> LEATHERCHAINHELMET = ITEMS.register("lchelmet",() -> new ArmorItem(LayeredArmorMaterials.LEATHERCHAIN, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERCHAINCHESTPLATE = ITEMS.register("lcchestplate",() -> new ArmorItem(LayeredArmorMaterials.LEATHERCHAIN, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERCHAINLEGGINGS = ITEMS.register("lcleggings",() -> new ArmorItem(LayeredArmorMaterials.LEATHERCHAIN, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERCHAINBOOTS = ITEMS.register("lcboots",() -> new ArmorItem(LayeredArmorMaterials.LEATHERCHAIN, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> LEATHERIRONHELMET = ITEMS.register("lihelmet",() -> new ArmorItem(LayeredArmorMaterials.LEATHERIRON, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERIRONCHESTPLATE = ITEMS.register("lichestplate",() -> new ArmorItem(LayeredArmorMaterials.LEATHERIRON, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERIRONLEGGINGS = ITEMS.register("lileggings",() -> new ArmorItem(LayeredArmorMaterials.LEATHERIRON, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERIRONBOOTS = ITEMS.register("liboots",() -> new ArmorItem(LayeredArmorMaterials.LEATHERIRON, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> LEATHERTURTLEHELMET = ITEMS.register("lthelmet",() -> new ArmorItem(LayeredArmorMaterials.LEATHERTURTLE, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> LEATHERGOLDHELMET = ITEMS.register("lghelmet",() -> new ArmorItem(LayeredArmorMaterials.LEATHERGOLD, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERGOLDCHESTPLATE = ITEMS.register("lgchestplate",() -> new ArmorItem(LayeredArmorMaterials.LEATHERGOLD, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERGOLDLEGGINGS = ITEMS.register("lgleggings",() -> new ArmorItem(LayeredArmorMaterials.LEATHERGOLD, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERGOLDBOOTS = ITEMS.register("lgboots",() -> new ArmorItem(LayeredArmorMaterials.LEATHERGOLD, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> LEATHERDIAMONDHELMET = ITEMS.register("ldhelmet",() -> new ArmorItem(LayeredArmorMaterials.LEATHERDIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERDIAMONDCHESTPLATE = ITEMS.register("ldchestplate",() -> new ArmorItem(LayeredArmorMaterials.LEATHERDIAMOND, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERDIAMONDLEGGINGS = ITEMS.register("ldleggings",() -> new ArmorItem(LayeredArmorMaterials.LEATHERDIAMOND, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERDIAMONDBOOTS = ITEMS.register("ldboots",() -> new ArmorItem(LayeredArmorMaterials.LEATHERDIAMOND, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> LEATHERNETHERITEHELMET = ITEMS.register("lnhelmet",() -> new ArmorItem(LayeredArmorMaterials.LEATHERNETHERITE, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERNETHERITECHESTPLATE = ITEMS.register("lnchestplate",() -> new ArmorItem(LayeredArmorMaterials.LEATHERNETHERITE, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERNETHERITELEGGINGS = ITEMS.register("lnleggings",() -> new ArmorItem(LayeredArmorMaterials.LEATHERNETHERITE, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERNETHERITEBOOTS = ITEMS.register("lnboots",() -> new ArmorItem(LayeredArmorMaterials.LEATHERNETHERITE, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> LEATHERCHAINIRONHELMET = ITEMS.register("lcihelmet",() -> new ArmorItem(LayeredArmorMaterials.LEATHERCHAINIRON, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERCHAINIRONCHESTPLATE = ITEMS.register("lcichestplate",() -> new ArmorItem(LayeredArmorMaterials.LEATHERCHAINIRON, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERCHAINIRONLEGGINGS = ITEMS.register("lcileggings",() -> new ArmorItem(LayeredArmorMaterials.LEATHERCHAINIRON, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERCHAINIRONBOOTS = ITEMS.register("lciboots",() -> new ArmorItem(LayeredArmorMaterials.LEATHERCHAINIRON, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> LEATHERCHAINTURTLEHELMET = ITEMS.register("lcthelmet",() -> new ArmorItem(LayeredArmorMaterials.LEATHERCHAINTURTLE, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> LEATHERCHAINGOLDHELMET = ITEMS.register("lcghelmet",() -> new ArmorItem(LayeredArmorMaterials.LEATHERCHAINGOLD, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERCHAINGOLDCHESTPLATE = ITEMS.register("lcgchestplate",() -> new ArmorItem(LayeredArmorMaterials.LEATHERCHAINGOLD, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERCHAINGOLDLEGGINGS = ITEMS.register("lcgleggings",() -> new ArmorItem(LayeredArmorMaterials.LEATHERCHAINGOLD, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERCHAINGOLDBOOTS = ITEMS.register("lcgboots",() -> new ArmorItem(LayeredArmorMaterials.LEATHERCHAINGOLD, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> LEATHERCHAINDIAMONDHELMET = ITEMS.register("lcdhelmet",() -> new ArmorItem(LayeredArmorMaterials.LEATHERCHAINDIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERCHAINDIAMONDCHESTPLATE = ITEMS.register("lcdchestplate",() -> new ArmorItem(LayeredArmorMaterials.LEATHERCHAINDIAMOND, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERCHAINDIAMONDLEGGINGS = ITEMS.register("lcdleggings",() -> new ArmorItem(LayeredArmorMaterials.LEATHERCHAINDIAMOND, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERCHAINDIAMONDBOOTS = ITEMS.register("lcdboots",() -> new ArmorItem(LayeredArmorMaterials.LEATHERCHAINDIAMOND, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> LEATHERCHAINNETHERITEELMET = ITEMS.register("lcnhelmet",() -> new ArmorItem(LayeredArmorMaterials.LEATHERCHAINNETHERITE, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERCHAINNETHERITECHESTPLATE = ITEMS.register("lcnchestplate",() -> new ArmorItem(LayeredArmorMaterials.LEATHERCHAINNETHERITE, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERCHAINNETHERITELEGGINGS = ITEMS.register("lcnleggings",() -> new ArmorItem(LayeredArmorMaterials.LEATHERCHAINNETHERITE, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHERCHAINNETHERITEBOOTS = ITEMS.register("lcnboots",() -> new ArmorItem(LayeredArmorMaterials.LEATHERCHAINNETHERITE, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
