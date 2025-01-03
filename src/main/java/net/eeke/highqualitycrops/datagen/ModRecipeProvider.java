package net.eeke.highqualitycrops.datagen;

import net.eeke.highqualitycrops.Highqualitycrops;
import net.eeke.highqualitycrops.item.custom.ModFoods;
import net.eeke.highqualitycrops.item.custom.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
   // private static final List<ItemLike> POTATO_SMELTABLES = List.of(ModItems.BOUTIQUE_POTATO.get(),
   //         ModItems.BOUTIQUE_POTATO.get());
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);

    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
      //  oreSmelting(pWriter,POTATO_SMELTABLES, RecipeCategory.MISC,ModItems.SPECIALTY_BAKED_POTATOES.get(),0.25f,200,"specialty_baked_potatoes");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.TOAST_BREAD.get())
                .pattern("XXX")
                .pattern("OXO")
                .define('X',ModItems.BOUTIQUE_WHEAT.get())
                .define('O',Items.SUGAR.asItem())
                .unlockedBy(getHasName(ModItems.TOAST_BREAD.get()),has(ModItems.TOAST_BREAD.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.POTATO_BUNS.get(),3)
                .pattern("XXX")
                .pattern(" O ")
                .define('X',ModItems.BOUTIQUE_WHEAT.get())
                .define('O',ModItems.BOUTIQUE_POTATO.get())
                .unlockedBy(getHasName(ModItems.POTATO_BUNS.get()),has(ModItems.POTATO_BUNS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.WATER_BREATHING_WART.get(),4)
                .pattern(" X ")
                .pattern("XOX")
                .pattern(" X ")
                .define('X',ModItems.BOUTIQUE_NETHER_WART.get())
                .define('O',Items.PUFFERFISH.asItem())
                .unlockedBy(getHasName(ModItems.WATER_BREATHING_WART.get()),has(ModItems.WATER_BREATHING_WART.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.STRENGTH_WART.get(),2)
                .pattern("XOX")
                .define('X',ModItems.BOUTIQUE_NETHER_WART.get())
                .define('O',Items.BLAZE_POWDER.asItem())
                .unlockedBy(getHasName(ModItems.STRENGTH_WART.get()),has(ModItems.STRENGTH_WART.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.BEET_PUREE.get())
                .pattern("X")
                .pattern("S")
                .pattern("O")
                .define('S',ModItems.BOUTIQUE_BEETROOT.get())
                .define('O',Items.BOWL.asItem())
                .define('X',Items.BEETROOT.asItem())
                .unlockedBy(getHasName(ModItems.BEET_PUREE.get()),has(ModItems.BEET_PUREE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.FIRE_RESISTANCE_WART.get())
                .pattern("XOX")
                .define('X',ModItems.BOUTIQUE_NETHER_WART.get())
                .define('O',Items.MAGMA_CREAM.asItem())
                .unlockedBy(getHasName(ModItems.FIRE_RESISTANCE_WART.get()),has(ModItems.FIRE_RESISTANCE_WART.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.BOUTIQUE_GOLDEN_CARROTS.get())
                .pattern("OXO")
                .pattern("OSO")
                .pattern("OXO")
                .define('S',ModItems.BOUTIQUE_CARROTS.get())
                .define('O',Items.GOLD_NUGGET.asItem())
                .define('X',Items.GOLD_INGOT.asItem())
                .unlockedBy(getHasName(ModItems.BOUTIQUE_GOLDEN_CARROTS.get()),has(ModItems.BOUTIQUE_GOLDEN_CARROTS.get()))
                .save(pWriter);


    }
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike)).
                    save(pFinishedRecipeConsumer, Highqualitycrops.MOD_ID + ":" + (pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
