package com.zer0_the_wolf.layeredarmor;

import com.mojang.logging.LogUtils;
import com.zer0_the_wolf.layeredarmor.item.LayeredArmoritems;
import com.zer0_the_wolf.layeredarmor.item.custom.ColorHandlers;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import net.minecraft.world.item.Item;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(LayeredArmor.MOD_ID)
public class LayeredArmor
{
    public static final String MOD_ID = "layeredarmor";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public LayeredArmor()
    {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        LayeredArmoritems.register(eventBus);
        eventBus.addListener(this::setup);

        // register the color handling for dying items
        eventBus.addListener(ColorHandlers::registerItemColors);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);



    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }


   }
