package com.zer0_the_wolf.layeredarmor.item.custom;


import com.zer0_the_wolf.layeredarmor.item.LayeredArmoritems;

import net.minecraft.nbt.CompoundTag;

import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ColorHandlers {


//registers all the dyeable items to be colored and calls the method to get color from nbt data and applies tint to the layer 0 texture
        @SubscribeEvent
public static void registerItemColors(ColorHandlerEvent.Item event){
            event.getItemColors().register(ColorHandlers::getColor/*event.getItemColors()::getColor*/,
                    LayeredArmoritems.LEATHERCHAINHELMET.get(),
                    LayeredArmoritems.LEATHERCHAINCHESTPLATE.get(),
                    LayeredArmoritems.LEATHERCHAINLEGGINGS.get(),
                    LayeredArmoritems.LEATHERCHAINBOOTS.get(),
                    LayeredArmoritems.LEATHERIRONHELMET.get(),
                    LayeredArmoritems.LEATHERIRONCHESTPLATE.get(),
                    LayeredArmoritems.LEATHERIRONLEGGINGS.get(),
                    LayeredArmoritems.LEATHERIRONBOOTS.get(),
                    LayeredArmoritems.LEATHERTURTLEHELMET.get(),
                    LayeredArmoritems.LEATHERGOLDHELMET.get(),
                    LayeredArmoritems.LEATHERGOLDCHESTPLATE.get(),
                    LayeredArmoritems.LEATHERGOLDLEGGINGS.get(),
                    LayeredArmoritems.LEATHERGOLDBOOTS.get(),
                    LayeredArmoritems.LEATHERDIAMONDHELMET.get(),
                    LayeredArmoritems.LEATHERDIAMONDCHESTPLATE.get(),
                    LayeredArmoritems.LEATHERDIAMONDLEGGINGS.get(),
                    LayeredArmoritems.LEATHERDIAMONDBOOTS.get(),
                    LayeredArmoritems.LEATHERNETHERITEHELMET.get(),
                    LayeredArmoritems.LEATHERNETHERITECHESTPLATE.get(),
                    LayeredArmoritems.LEATHERNETHERITELEGGINGS.get(),
                    LayeredArmoritems.LEATHERNETHERITEBOOTS.get(),
                    LayeredArmoritems.LEATHERCHAINIRONHELMET.get(),
                    LayeredArmoritems.LEATHERCHAINIRONCHESTPLATE.get(),
                    LayeredArmoritems.LEATHERCHAINIRONLEGGINGS.get(),
                    LayeredArmoritems.LEATHERCHAINIRONBOOTS.get(),
                    LayeredArmoritems.LEATHERCHAINTURTLEHELMET.get(),
                    LayeredArmoritems.LEATHERCHAINGOLDHELMET.get(),
                    LayeredArmoritems.LEATHERCHAINGOLDCHESTPLATE.get(),
                    LayeredArmoritems.LEATHERCHAINGOLDLEGGINGS.get(),
                    LayeredArmoritems.LEATHERCHAINGOLDBOOTS.get(),
                    LayeredArmoritems.LEATHERCHAINDIAMONDHELMET.get(),
                    LayeredArmoritems.LEATHERCHAINDIAMONDCHESTPLATE.get(),
                    LayeredArmoritems.LEATHERCHAINDIAMONDLEGGINGS.get(),
                    LayeredArmoritems.LEATHERCHAINDIAMONDBOOTS.get(),
                    LayeredArmoritems.LEATHERCHAINNETHERITEELMET.get(),
                    LayeredArmoritems.LEATHERCHAINNETHERITECHESTPLATE.get(),
                    LayeredArmoritems.LEATHERCHAINNETHERITELEGGINGS.get(),
                    LayeredArmoritems.LEATHERCHAINNETHERITEBOOTS.get()
            );
        }
    //tints all items with layer 0 the expected color and leaves all other textures layers untinted the layer is indicated by the tintIndex value
    private static int getColor(ItemStack pStack, int tintIndex)
    {
        CompoundTag compoundtag = pStack.getTagElement("display");
        if (tintIndex == 0) {
            return compoundtag != null && compoundtag.contains("color", 99) ? compoundtag.getInt("color") : 10511680;
        }
        return 0xFFFFFF;

    }
}