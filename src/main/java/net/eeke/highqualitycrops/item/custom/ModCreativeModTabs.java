package net.eeke.highqualitycrops.item.custom;

import net.eeke.highqualitycrops.Highqualitycrops;
import net.eeke.highqualitycrops.Highqualitycrops;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Highqualitycrops.MOD_ID);
    public static final RegistryObject<CreativeModeTab> HIGHQUALITYCROPS_TABS = CREATIVE_MODE_TABS.register("highqualitycrops_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BOUTIQUE_CARROTS.get()))
                    .title(Component.translatable("creativetab.highqualitycrops_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.BOUTIQUE_CARROTS.get());
                        output.accept(ModItems.BEET_PUREE.get());
                        output.accept(ModItems.BOUTIQUE_NETHER_WART.get());
                        output.accept(ModItems.BOUTIQUE_POTATO.get());
                        output.accept(ModItems.BOUTIQUE_WHEAT.get());
                        output.accept(ModItems.BOUTIQUE_BEETROOT.get());
                        output.accept(ModItems.BOUTIQUE_GOLDEN_CARROTS.get());
                        output.accept(ModItems.FIRE_RESISTANCE_WART.get());
                        output.accept(ModItems.POTATO_BUNS.get());
                        output.accept(ModItems.SPECIALTY_BAKED_POTATOES.get());
                        output.accept(ModItems.STRENGTH_WART.get());
                        output.accept(ModItems.TOAST_BREAD.get());
                        output.accept(ModItems.WATER_BREATHING_WART.get());

                    })
                    .build());


    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
