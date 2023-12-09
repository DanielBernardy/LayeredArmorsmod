package com.zer0_the_wolf.layeredarmor.item;

import com.zer0_the_wolf.layeredarmor.LayeredArmor;
//import com.zer0_the_wolf.layeredarmor.item.custom.LayeredArmorItem;
//import com.zer0_the_wolf.layeredarmor.recipe.RetrurnLCShapelessRecipe;
import com.zer0_the_wolf.layeredarmor.recipe.MultiOutputRecipe;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.*;
import net.minecraftforge.registries.tags.ITag;
import net.minecraftforge.registries.tags.ITagManager;
//import net.minecraft.world.player;

import static com.zer0_the_wolf.layeredarmor.LayeredArmor.*;

//import static net.minecraft.world.item.DyeableLeatherItem.DEFAULT_LEATHER_COLOR;

public class LayeredArmorItems {

    public static final String MULTI_RECIPE_ID = "mult_output";

    public static final ITag<Item> MULT_MAIN = modTag(ForgeRegistries.ITEMS, "recipe_control/multi_main");
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LayeredArmor.MOD_ID);

    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZER_REGISTRY = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, MOD_ID);
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPE_REGISTRY = DeferredRegister.create(Registry.RECIPE_TYPE_REGISTRY, MOD_ID);

    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINHELMET = ITEMS.register("lc_helmet",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERCHAIN, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(Items.LEATHER)*/)/*.onDestroyed()*/);
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINCHESTPLATE = ITEMS.register("lc_chestplate",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERCHAIN, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(Items.LEATHER_CHESTPLATE)*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINLEGGINGS = ITEMS.register("lc_leggings",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERCHAIN, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(Items.LEATHER_LEGGINGS)*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINBOOTS = ITEMS.register("lc_boots",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERCHAIN, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(Items.LEATHER_BOOTS)*/));

    public static final RegistryObject<DyeableArmorItem> LEATHERIRONHELMET = ITEMS.register("li_helmet",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERIRON, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(Items.LEATHER_HELMET)*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERIRONCHESTPLATE = ITEMS.register("li_chestplate",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERIRON, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(Items.LEATHER_CHESTPLATE)*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERIRONLEGGINGS = ITEMS.register("li_leggings",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERIRON, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(Items.LEATHER_LEGGINGS)*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERIRONBOOTS = ITEMS.register("li_boots",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERIRON, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(Items.LEATHER_BOOTS)*/));

    public static final RegistryObject<DyeableArmorItem> LEATHERTURTLEHELMET = ITEMS.register("lt_helmet",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERTURTLE, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(Items.LEATHER_HELMET)*/));

    public static final RegistryObject<DyeableArmorItem> LEATHERGOLDHELMET = ITEMS.register("lg_helmet",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERGOLD, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(Items.LEATHER_HELMET)*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERGOLDCHESTPLATE = ITEMS.register("lg_chestplate",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERGOLD, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(Items.LEATHER_CHESTPLATE)*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERGOLDLEGGINGS = ITEMS.register("lg_leggings",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERGOLD, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(Items.LEATHER_LEGGINGS)*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERGOLDBOOTS = ITEMS.register("lg_boots",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERGOLD, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(Items.LEATHER_BOOTS)*/));

    public static final RegistryObject<DyeableArmorItem> LEATHERDIAMONDHELMET = ITEMS.register("ld_helmet",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERDIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(Items.LEATHER_HELMET)*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERDIAMONDCHESTPLATE = ITEMS.register("ld_chestplate",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERDIAMOND, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(Items.LEATHER_CHESTPLATE)*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERDIAMONDLEGGINGS = ITEMS.register("ld_leggings",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERDIAMOND, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(Items.LEATHER_LEGGINGS)*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERDIAMONDBOOTS = ITEMS.register("ld_boots",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERDIAMOND, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(Items.LEATHER_BOOTS)*/));

    public static final RegistryObject<DyeableArmorItem> LEATHERNETHERITEHELMET = ITEMS.register("ln_helmet",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERNETHERITE, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(Items.LEATHER_HELMET)*/.fireResistant()));
    public static final RegistryObject<DyeableArmorItem> LEATHERNETHERITECHESTPLATE = ITEMS.register("ln_chestplate",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERNETHERITE, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(Items.LEATHER_CHESTPLATE)*/.fireResistant()));
    public static final RegistryObject<DyeableArmorItem> LEATHERNETHERITELEGGINGS = ITEMS.register("ln_leggings",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERNETHERITE, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(Items.LEATHER_LEGGINGS)*/.fireResistant()));
    public static final RegistryObject<DyeableArmorItem> LEATHERNETHERITEBOOTS = ITEMS.register("ln_boots",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERNETHERITE, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(Items.LEATHER_BOOTS)*/.fireResistant()));

    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINIRONHELMET = ITEMS.register("lci_helmet",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERCHAINIRON, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmorItems.LEATHERCHAINHELMET.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINIRONCHESTPLATE = ITEMS.register("lci_chestplate",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERCHAINIRON, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmorItems.LEATHERCHAINCHESTPLATE.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINIRONLEGGINGS = ITEMS.register("lci_leggings",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERCHAINIRON, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmorItems.LEATHERCHAINLEGGINGS.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINIRONBOOTS = ITEMS.register("lci_boots",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERCHAINIRON, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmorItems.LEATHERCHAINBOOTS.get())*/));

    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINTURTLEHELMET = ITEMS.register("lct_helmet",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERCHAINTURTLE, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmorItems.LEATHERCHAINHELMET.get())*/));

    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINGOLDHELMET = ITEMS.register("lcg_helmet",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERCHAINGOLD, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmorItems.LEATHERCHAINHELMET.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINGOLDCHESTPLATE = ITEMS.register("lcg_chestplate",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERCHAINGOLD, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmorItems.LEATHERCHAINCHESTPLATE.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINGOLDLEGGINGS = ITEMS.register("lcg_leggings",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERCHAINGOLD, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmorItems.LEATHERCHAINLEGGINGS.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINGOLDBOOTS = ITEMS.register("lcg_boots",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERCHAINGOLD, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmorItems.LEATHERCHAINBOOTS.get())*/));

    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINDIAMONDHELMET = ITEMS.register("lcd_helmet",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERCHAINDIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmorItems.LEATHERCHAINHELMET.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINDIAMONDCHESTPLATE = ITEMS.register("lcd_chestplate",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERCHAINDIAMOND, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmorItems.LEATHERCHAINCHESTPLATE.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINDIAMONDLEGGINGS = ITEMS.register("lcd_leggings",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERCHAINDIAMOND, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmorItems.LEATHERCHAINLEGGINGS.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINDIAMONDBOOTS = ITEMS.register("lcd_boots",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERCHAINDIAMOND, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)/*.craftRemainder(LayeredArmorItems.LEATHERCHAINBOOTS.get())*/));

    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINNETHERITEHELMET = ITEMS.register("lcn_helmet",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERCHAINNETHERITE, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()/*.craftRemainder(LayeredArmorItems.LEATHERCHAINHELMET.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINNETHERITECHESTPLATE = ITEMS.register("lcn_chestplate",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERCHAINNETHERITE, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()/*.craftRemainder(LayeredArmorItems.LEATHERCHAINCHESTPLATE.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINNETHERITELEGGINGS = ITEMS.register("lcn_leggings",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERCHAINNETHERITE, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()/*.craftRemainder(LayeredArmorItems.LEATHERCHAINLEGGINGS.get())*/));
    public static final RegistryObject<DyeableArmorItem> LEATHERCHAINNETHERITEBOOTS = ITEMS.register("lcn_boots",() -> new LayeredArmorItem(LayeredArmorMaterials.LEATHERCHAINNETHERITE, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()/*.craftRemainder(LayeredArmorItems.LEATHERCHAINBOOTS.get())*/));
    public static final RegistryObject<MultiOutputRecipe.Serializer> MULTI_SERIALIZER = RECIPE_SERIALIZER_REGISTRY.register(MULTI_RECIPE_ID, MultiOutputRecipe.Serializer::new);
    public static final RegistryObject<RecipeType<MultiOutputRecipe>> MULTI_TYPE = RECIPE_TYPE_REGISTRY.register(MULTI_RECIPE_ID, () -> new RecipeType<>() {
        @Override
        public String toString() {
            return MOD_ID + ':' + MULTI_RECIPE_ID;
        }
    });

    public static void register(IEventBus eventBus) {



        ITEMS.register(eventBus);
        RECIPE_SERIALIZER_REGISTRY.register(eventBus);
        RECIPE_TYPE_REGISTRY.register(eventBus);
        //MULTI_SERIALIZER.
    }



    static <T extends IForgeRegistryEntry<T>> ITag<T> modTag(IForgeRegistry<T> registry, String key) {
        return tag(registry, new ResourceLocation(MOD_ID, key));
    }

    static <T extends IForgeRegistryEntry<T>> ITag<T> forgeTag(IForgeRegistry<T> registry, String key) {
        return tag(registry, new ResourceLocation("forge", key));
    }

    static <T extends IForgeRegistryEntry<T>> ITag<T> tag(IForgeRegistry<T> registry, ResourceLocation key) {
        ITagManager<T> manager = registry.tags();
        if (manager == null) throw new IllegalArgumentException("Registry " + registry.getRegistryKey() + " does not support tags");

        return manager.getTag(manager.createTagKey(key));
    }
}
