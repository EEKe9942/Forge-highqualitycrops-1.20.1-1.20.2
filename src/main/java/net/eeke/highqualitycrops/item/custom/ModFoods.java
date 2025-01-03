package net.eeke.highqualitycrops.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    //精品胡萝卜
    public static final FoodProperties BOUTIQUE_CARROTS = new FoodProperties.Builder().nutrition(8).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION,1800)
                    ,1f).build();
    //土豆
    public static final FoodProperties BOUTIQUE_POTATO = new FoodProperties.Builder().nutrition(4).saturationMod(0.2f).build();
    //甜菜浓汤

    public static final FoodProperties BEET_PUREE = new FoodProperties.Builder().nutrition(4).saturationMod(0.2f).build();
    //精品下界疣
    public static final FoodProperties BOUTIQUE_NETHER_WART = new FoodProperties.Builder().nutrition(4).saturationMod(0.2f).build();
    //精品小麦
    public static final FoodProperties BOUTIQUE_WHEAT = new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build();
    //精品甜菜根
    public static final FoodProperties BOUTIQUE_BEETROOT = new FoodProperties.Builder().nutrition(4).fast().alwaysEat().saturationMod(0.2f).
            effect(()-> new MobEffectInstance(MobEffects.DIG_SPEED,400),1f).build();
    //精品金胡萝卜
    public static final FoodProperties BOUTIQUE_GOLDEN_CARROTS = new FoodProperties.Builder().nutrition(9).saturationMod(0.6f).
            effect(()-> new MobEffectInstance(MobEffects.REGENERATION,800),1f).build();
    //火抗地狱疣
    public static final FoodProperties FIRE_RESISTANCE_WART = new FoodProperties.Builder().nutrition(0).fast().alwaysEat().saturationMod(0.1f).
            effect(()-> new MobEffectInstance(MobEffects.FIRE_RESISTANCE,1600),1f).build();
    //土豆圆面包
    public static final FoodProperties POTATO_BUNS = new FoodProperties.Builder().nutrition(8).saturationMod(0.4f).
            effect(()-> new MobEffectInstance(MobEffects.MOVEMENT_SPEED,400),0.8f).build();
    //烤精品土豆
    public static final FoodProperties SPECIALTY_BAKED_POTATOES = new FoodProperties.Builder().nutrition(8).saturationMod(0.6f).build();
    //力量下界疣
    public static final FoodProperties STRENGTH_WART = new FoodProperties.Builder().nutrition(4).fast().alwaysEat().saturationMod(0.2f).
            effect(()-> new MobEffectInstance(MobEffects.DAMAGE_BOOST,800),1f).build();
    //吐司面包
    public static final FoodProperties TOAST_BREAD = new FoodProperties.Builder().nutrition(20).saturationMod(1f).build();
    //水肺下界疣
    public static final FoodProperties WATER_BREATHING_WART = new FoodProperties.Builder().nutrition(4).saturationMod(0.2f).alwaysEat().fast().
            effect(()-> new MobEffectInstance(MobEffects.WATER_BREATHING,2400),1f).build();

}
