package com.zer0_the_wolf.layeredarmor.recipe;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.TagParser;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

public class MultiOutputRecipe extends ShapelessRecipe
{
    private final ItemStack remaining;

    public MultiOutputRecipe(ShapelessRecipe original, ItemStack remaining) {
        this(original.getId(), original.getGroup(), original.getResultItem(), original.getIngredients(), remaining);
    }

    public MultiOutputRecipe(ResourceLocation id, String group, ItemStack result, NonNullList<Ingredient> ingredients, ItemStack remaining) {
        super(id, group, result, ingredients);
        this.remaining = remaining;
    }

    @Override
    public ItemStack assemble(CraftingContainer pInv) {
        int totalDamage = 0;
        for(int i = 0; i < pInv.getContainerSize(); ++i) {
            totalDamage += pInv.getItem(i).getDamageValue();
        }
        ItemStack returnItem = getResultItem().copy();
        returnItem.setDamageValue(totalDamage);

        return returnItem;
    }

    @NotNull
    @Override
    public NonNullList<ItemStack> getRemainingItems(CraftingContainer pContainer)
    {
        NonNullList<ItemStack> nonnulllist = NonNullList.withSize(pContainer.getContainerSize(), ItemStack.EMPTY);
        nonnulllist.set(0,remaining.copy());
        return nonnulllist;
    }

    public static class Serializer extends ShapelessRecipe.Serializer
    {
        @NotNull
        @Override
        public MultiOutputRecipe fromJson(ResourceLocation recipeId, JsonObject json) {
            ShapelessRecipe original = super.fromJson(recipeId, json);

            ItemStack remaining = ItemStack.EMPTY;

            if (json.has("remaining")) {
                remaining = itemFromJson(json.get("remaining"));
            }

            return new MultiOutputRecipe(original, remaining);
        }

        public MultiOutputRecipe fromNetwork(ResourceLocation recipeId, FriendlyByteBuf buffer) {
            ShapelessRecipe original = super.fromNetwork(recipeId, buffer);

            ItemStack remaining = buffer.readItem();

            return new MultiOutputRecipe(original, remaining);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buffer, ShapelessRecipe recipe) {
            // this cast should be safe... right?
            toNetwork(buffer, (MultiOutputRecipe) recipe);
        }

        public void toNetwork(FriendlyByteBuf buffer, MultiOutputRecipe recipe) {
            super.toNetwork(buffer, recipe);

            buffer.writeItemStack(recipe.remaining, true);
        }

        private ItemStack itemFromJson(JsonElement json) {
            if (json instanceof JsonObject o) {
                ItemStack item = itemFromString(o.get("item").getAsString());
                if (o.has("nbt")) {
                    try {
                        item.setTag(TagParser.parseTag(o.get("nbt").getAsString()));
                    } catch (CommandSyntaxException e) {
                        throw new JsonSyntaxException("Error while parsing NBT for item '" + item.getItem() + "'",e);
                    }
                }
                return item;
            }
            return itemFromString(json.getAsString());
        }

        private ItemStack itemFromString(String name) {
            if (name.isEmpty()) return ItemStack.EMPTY;

            Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(name));
            if (item == null) throw new JsonSyntaxException("Unknown item '" + name + "'");

            return item.getDefaultInstance();
        }
    }
}