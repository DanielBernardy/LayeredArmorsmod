package com.zer0_the_wolf.layeredarmor;

import com.mojang.logging.LogUtils;
import com.zer0_the_wolf.layeredarmor.item.LayeredArmorItems;
import com.zer0_the_wolf.layeredarmor.item.custom.ColorHandlers;
//import com.zer0_the_wolf.layeredarmor.item.custom.ItemDestroyedHandlers;
//import com.zer0_the_wolf.layeredarmor.item.custom.CraftingHandlers;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(LayeredArmor.MOD_ID)
public class LayeredArmor
{
    public static final String MOD_ID = "layeredarmor";
    public static final String UPGRADE_RECIPE_ID = "return_lc_shapeless";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public LayeredArmor()
    {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        LayeredArmorItems.register(eventBus);
        //LayeredArmorRecipes.register(eventBus);
        eventBus.addListener(this::setup);
        // register the color handling for dying items
        //eventBus.addListener(CraftingHandlers::onItemMake);
        eventBus.addListener(ColorHandlers::registerItemColors);

        //eventBus.addListener(ItemDestroyedHandlers::onItemBreak);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);



    }

    /**
     * @param first The first tag
     * @param second The second tag. Will override any duplicate values in first
     * @return A new tag
     */

    @Nullable
    @Contract("null,null -> null;!null,_ -> !null;_,!null -> !null")
    public static CompoundTag mergeTags(@Nullable CompoundTag first, @Nullable CompoundTag second) {
        if (first == null && second == null) return null;
        if (first == null)
            return second.copy();
        else if (second == null)
            return first.copy();
        return first.copy().merge(second);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

   }
