package net.eeke.highqualitycrops.datagen;

import net.eeke.highqualitycrops.Highqualitycrops;
import net.eeke.highqualitycrops.item.custom.ModFoods;
import net.eeke.highqualitycrops.item.custom.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Highqualitycrops.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.BERRY_COOKIES);
        simpleItem(ModItems.BERRY_PIE);
        simpleItem(ModItems.BOUTIQUE_CLAY_ROOTS);
        simpleItem(ModItems.BOUTIQUE_STONE_ROOTS);
        simpleItem(ModItems.BOUTIQUE_SWEET_BERRIES);
        simpleItem(ModItems.BOUTIQUE_WATERMELON);
        simpleItem(ModItems.LARGE_SUGAR_CUBES);
        simpleItem(ModItems.MUD_ROOTS);
        simpleItem(ModItems.NETHER_WART_COOKIES);
        simpleItem(ModItems.STONE_ROOTS);
        simpleItem(ModItems.WILD_VEGETABLE_SOUP);


    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Highqualitycrops.MOD_ID,"item/vegetables/" + item.getId().getPath()));
    }
    private ItemModelBuilder simpleFood(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Highqualitycrops.MOD_ID,"item/vegetables/" + item.getId().getPath()));
    }
}
