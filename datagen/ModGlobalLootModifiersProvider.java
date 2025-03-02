package net.eeke.highqualitycrops.datagen;

import net.eeke.highqualitycrops.Highqualitycrops;
import net.eeke.highqualitycrops.item.custom.ModItems;
import net.eeke.highqualitycrops.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, Highqualitycrops.MOD_ID);
    }

    @Override
    protected void start() {
        add("boutique_potato_from_potatoes",new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.POTATOES).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build()
        }, ModItems.BOUTIQUE_POTATO.get()));
        add("boutique_wheat_from_wheat",new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.WHEAT).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build()
        }, ModItems.BOUTIQUE_WHEAT.get()));
        add("boutique_nether_wart_from_nether_wart",new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.NETHER_WART).build(),
                LootItemRandomChanceCondition.randomChance(0.65f).build()
        }, ModItems.BOUTIQUE_NETHER_WART.get()));
        add("boutique_carrot_from_carrot",new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.CARROTS).build(),
                LootItemRandomChanceCondition.randomChance(0.45f).build()
        }, ModItems.BOUTIQUE_CARROTS.get()));
        add("boutique_beetroot_from_beetroots",new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.BEETROOTS).build(),
                LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, ModItems.BOUTIQUE_BEETROOT.get()));
        add("boutique_sugar_cane_from_cane",new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.SUGAR_CANE).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build()
        }, ModItems.BOUTIQUE_SUGAR_CANE.get()));
        add("boutique_sweet_berries_from_berries",new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.SWEET_BERRY_BUSH).build(),
                LootItemRandomChanceCondition.randomChance(0.4f).build()
        }, ModItems.BOUTIQUE_SWEET_BERRIES.get()));
        add("boutique_stone_roots_from_stone",new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.STONE).build(),
                LootItemRandomChanceCondition.randomChance(0.02f).build()
        }, ModItems.BOUTIQUE_STONE_ROOTS.get()));
        add("stone_roots_from_stone",new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.STONE).build(),
                LootItemRandomChanceCondition.randomChance(0.04f).build()
        }, ModItems.STONE_ROOTS.get()));
        add("boutique_clay_roots_from_stone",new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.DIRT).build(),
                LootItemRandomChanceCondition.randomChance(0.036f).build()
        }, ModItems.BOUTIQUE_CLAY_ROOTS.get()));
        add("mud_roots_from_stone",new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.DIRT).build(),
                LootItemRandomChanceCondition.randomChance(0.07f).build()
        }, ModItems.MUD_ROOTS.get()));
        add("boutique_watermelon_from_watermelon",new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.MELON).build(),
                LootItemRandomChanceCondition.randomChance(0.07f).build()
        }, ModItems.BOUTIQUE_WATERMELON.get()));

    }
}
