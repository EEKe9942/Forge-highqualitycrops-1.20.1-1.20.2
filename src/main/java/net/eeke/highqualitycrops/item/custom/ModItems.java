package net.eeke.highqualitycrops.item.custom;

import net.eeke.highqualitycrops.Highqualitycrops;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Highqualitycrops.MOD_ID);
    //Boutique carrots 精品胡萝卜
    public static final RegistryObject<Item> BOUTIQUE_CARROTS = ITEMS.register("boutique_carrots",
            () -> new Item(new Item.Properties().food(ModFoods.BOUTIQUE_CARROTS)));
    public static final RegistryObject<Item> BOUTIQUE_POTATO = ITEMS.register("boutique_potato",
            () -> new Item(new Item.Properties().food(ModFoods.BOUTIQUE_POTATO)));
   // public static final RegistryObject<Item> BEET_PUREE = ITEMS.register("beet_puree",
   //        () -> new Item(new Item.Properties().food(ModFoods.BEET_PUREE)));
    public static final RegistryObject<Item> BOUTIQUE_NETHER_WART = ITEMS.register("boutique_nether_wart",
            () -> new Item(new Item.Properties().food(ModFoods.BOUTIQUE_NETHER_WART)));
    public static final RegistryObject<Item> BOUTIQUE_WHEAT = ITEMS.register("boutique_wheat",
            () -> new Item(new Item.Properties().food(ModFoods.BOUTIQUE_WHEAT)));
    public static final RegistryObject<Item> BOUTIQUE_BEETROOT = ITEMS.register("boutique_beetroot",
            () -> new Item(new Item.Properties().food(ModFoods.BOUTIQUE_BEETROOT)));
    public static final RegistryObject<Item> BOUTIQUE_GOLDEN_CARROTS = ITEMS.register("boutique_golden_carrots",
            () -> new Item(new Item.Properties().food(ModFoods.BOUTIQUE_GOLDEN_CARROTS)));
    public static final RegistryObject<Item> FIRE_RESISTANCE_WART = ITEMS.register("fire_resistance_wart",
            () -> new Item(new Item.Properties().food(ModFoods.FIRE_RESISTANCE_WART)));
    public static final RegistryObject<Item> POTATO_BUNS = ITEMS.register("potato_buns",
            () -> new Item(new Item.Properties().food(ModFoods.POTATO_BUNS)));
    public static final RegistryObject<Item> SPECIALTY_BAKED_POTATOES = ITEMS.register("specialty_baked_potatoes",
            () -> new Item(new Item.Properties().food(ModFoods.SPECIALTY_BAKED_POTATOES)));
    public static final RegistryObject<Item> STRENGTH_WART = ITEMS.register("strength_wart",
            () -> new Item(new Item.Properties().food(ModFoods.STRENGTH_WART)));
    public static final RegistryObject<Item> TOAST_BREAD = ITEMS.register("toast_bread",
            () -> new Item(new Item.Properties().food(ModFoods.TOAST_BREAD)));
    public static final RegistryObject<Item> WATER_BREATHING_WART = ITEMS.register("water_breathing_wart",
            () -> new Item(new Item.Properties().food(ModFoods.WATER_BREATHING_WART)));
    public static final RegistryObject<Item>BEET_PUREE = ITEMS.register("beet_puree",
            () -> new BowlFoodItem(new Item.Properties().stacksTo(1).
            food(ModFoods.BEET_PUREE)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}