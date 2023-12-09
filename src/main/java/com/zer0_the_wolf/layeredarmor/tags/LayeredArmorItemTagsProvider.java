package com.zer0_the_wolf.layeredarmor.tags;

import com.zer0_the_wolf.layeredarmor.item.LayeredArmorItems;
import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class LayeredArmorItemTagsProvider extends ItemTagsProvider {

    public LayeredArmorItemTagsProvider(DataGenerator p_126530_, BlockTagsProvider p_126531_, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_126530_, p_126531_, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {
        super.addTags();
        TagAppender<Item> itemTagAppender = this.tag(ItemTags.FREEZE_IMMUNE_WEARABLES)
                .add(LayeredArmorItems.LEATHERCHAINBOOTS.get(),
                        LayeredArmorItems.LEATHERCHAINHELMET.get(),
                        LayeredArmorItems.LEATHERCHAINCHESTPLATE.get(),
                        LayeredArmorItems.LEATHERCHAINLEGGINGS.get(),
                        LayeredArmorItems.LEATHERCHAINIRONBOOTS.get(),
                        LayeredArmorItems.LEATHERCHAINIRONHELMET.get(),
                        LayeredArmorItems.LEATHERCHAINIRONCHESTPLATE.get(),
                        LayeredArmorItems.LEATHERCHAINIRONLEGGINGS.get(),
                        LayeredArmorItems.LEATHERCHAINGOLDBOOTS.get(),
                        LayeredArmorItems.LEATHERCHAINGOLDHELMET.get(),
                        LayeredArmorItems.LEATHERCHAINGOLDCHESTPLATE.get(),
                        LayeredArmorItems.LEATHERCHAINGOLDLEGGINGS.get(),
                        LayeredArmorItems.LEATHERCHAINDIAMONDBOOTS.get(),
                        LayeredArmorItems.LEATHERCHAINDIAMONDHELMET.get(),
                        LayeredArmorItems.LEATHERCHAINDIAMONDCHESTPLATE.get(),
                        LayeredArmorItems.LEATHERCHAINDIAMONDLEGGINGS.get(),
                        LayeredArmorItems.LEATHERCHAINNETHERITEBOOTS.get(),
                        LayeredArmorItems.LEATHERCHAINNETHERITEHELMET.get(),
                        LayeredArmorItems.LEATHERCHAINNETHERITECHESTPLATE.get(),
                        LayeredArmorItems.LEATHERCHAINNETHERITELEGGINGS.get(),
                        LayeredArmorItems.LEATHERIRONBOOTS.get(),
                        LayeredArmorItems.LEATHERIRONHELMET.get(),
                        LayeredArmorItems.LEATHERIRONCHESTPLATE.get(),
                        LayeredArmorItems.LEATHERIRONLEGGINGS.get(),
                        LayeredArmorItems.LEATHERGOLDBOOTS.get(),
                        LayeredArmorItems.LEATHERGOLDHELMET.get(),
                        LayeredArmorItems.LEATHERGOLDCHESTPLATE.get(),
                        LayeredArmorItems.LEATHERGOLDLEGGINGS.get(),
                        LayeredArmorItems.LEATHERDIAMONDBOOTS.get(),
                        LayeredArmorItems.LEATHERDIAMONDHELMET.get(),
                        LayeredArmorItems.LEATHERDIAMONDCHESTPLATE.get(),
                        LayeredArmorItems.LEATHERDIAMONDLEGGINGS.get(),
                        LayeredArmorItems.LEATHERNETHERITEBOOTS.get(),
                        LayeredArmorItems.LEATHERNETHERITEHELMET.get(),
                        LayeredArmorItems.LEATHERNETHERITECHESTPLATE.get(),
                        LayeredArmorItems.LEATHERNETHERITELEGGINGS.get()
                );
    }
}

