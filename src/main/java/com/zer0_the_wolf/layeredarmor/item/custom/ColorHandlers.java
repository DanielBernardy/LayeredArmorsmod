package com.zer0_the_wolf.layeredarmor.item.custom;


import com.zer0_the_wolf.layeredarmor.item.LayeredArmorItems;

import net.minecraft.nbt.CompoundTag;

import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.event.ColorHandlerEvent;

import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ColorHandlers {//extends ArmorDyeRecipe {

    /*public ColorHandlers(ResourceLocation pId) {
        super(pId);
    }*/

    //registers all the dyeable items to be colored and calls the method to get color from nbt data and applies tint to the layer 0 texture
    @SubscribeEvent
    public static void registerItemColors(ColorHandlerEvent.Item event) {
        event.getItemColors().register(ColorHandlers::getColor/*event.getItemColors()::getColor*/,
                LayeredArmorItems.LEATHERCHAINHELMET.get(),
                LayeredArmorItems.LEATHERCHAINCHESTPLATE.get(),
                LayeredArmorItems.LEATHERCHAINLEGGINGS.get(),
                LayeredArmorItems.LEATHERCHAINBOOTS.get(),
                LayeredArmorItems.LEATHERIRONHELMET.get(),
                LayeredArmorItems.LEATHERIRONCHESTPLATE.get(),
                LayeredArmorItems.LEATHERIRONLEGGINGS.get(),
                LayeredArmorItems.LEATHERIRONBOOTS.get(),
                LayeredArmorItems.LEATHERTURTLEHELMET.get(),
                LayeredArmorItems.LEATHERGOLDHELMET.get(),
                LayeredArmorItems.LEATHERGOLDCHESTPLATE.get(),
                LayeredArmorItems.LEATHERGOLDLEGGINGS.get(),
                LayeredArmorItems.LEATHERGOLDBOOTS.get(),
                LayeredArmorItems.LEATHERDIAMONDHELMET.get(),
                LayeredArmorItems.LEATHERDIAMONDCHESTPLATE.get(),
                LayeredArmorItems.LEATHERDIAMONDLEGGINGS.get(),
                LayeredArmorItems.LEATHERDIAMONDBOOTS.get(),
                LayeredArmorItems.LEATHERNETHERITEHELMET.get(),
                LayeredArmorItems.LEATHERNETHERITECHESTPLATE.get(),
                LayeredArmorItems.LEATHERNETHERITELEGGINGS.get(),
                LayeredArmorItems.LEATHERNETHERITEBOOTS.get(),
                LayeredArmorItems.LEATHERCHAINIRONHELMET.get(),
                LayeredArmorItems.LEATHERCHAINIRONCHESTPLATE.get(),
                LayeredArmorItems.LEATHERCHAINIRONLEGGINGS.get(),
                LayeredArmorItems.LEATHERCHAINIRONBOOTS.get(),
                LayeredArmorItems.LEATHERCHAINTURTLEHELMET.get(),
                LayeredArmorItems.LEATHERCHAINGOLDHELMET.get(),
                LayeredArmorItems.LEATHERCHAINGOLDCHESTPLATE.get(),
                LayeredArmorItems.LEATHERCHAINGOLDLEGGINGS.get(),
                LayeredArmorItems.LEATHERCHAINGOLDBOOTS.get(),
                LayeredArmorItems.LEATHERCHAINDIAMONDHELMET.get(),
                LayeredArmorItems.LEATHERCHAINDIAMONDCHESTPLATE.get(),
                LayeredArmorItems.LEATHERCHAINDIAMONDLEGGINGS.get(),
                LayeredArmorItems.LEATHERCHAINDIAMONDBOOTS.get(),
                LayeredArmorItems.LEATHERCHAINNETHERITEHELMET.get(),
                LayeredArmorItems.LEATHERCHAINNETHERITECHESTPLATE.get(),
                LayeredArmorItems.LEATHERCHAINNETHERITELEGGINGS.get(),
                LayeredArmorItems.LEATHERCHAINNETHERITEBOOTS.get()//,
                //LayeredArmorItems.LEATHERIRONHORSE.get(),
                //LayeredArmorItems.LEATHERGOLDHORSE.get(),
                //LayeredArmorItems.LEATHERDIAMONDHORSE.get()
        );

    }

    //tints all items with layer 0 the expected color and leaves all other textures layers untinted the layer is indicated by the tintIndex value
    private static int getColor(ItemStack pStack, int tintIndex) {
        CompoundTag compoundTag1 = pStack.getTagElement("type");
        if (compoundTag1 != null) {
            compoundTag1.putString("type","layeredarmor:upgrade_shapeless");
        }

        CompoundTag compoundtag = pStack.getTagElement("display");
        if (tintIndex == 0) {
            return compoundtag != null && compoundtag.contains("color", 99) ? compoundtag.getInt("color") : 10511680;
        }
        return 0xFFFFFF;

    }
    /*
    @NotNull
    @Override
    public NonNullList<ItemStack> getRemainingItems(CraftingContainer pContainer) {
        NonNullList<ItemStack> nonnulllist = NonNullList.withSize(pContainer.getContainerSize(), ItemStack.EMPTY);

        for(int i = 0; i < nonnulllist.size(); ++i) {
            ItemStack item = pContainer.getItem(i);
            //if (item.hasContainerItem()) {
            //    nonnulllist.set(i, item.getContainerItem());
            //}
        }

        return nonnulllist;
    }*/
}