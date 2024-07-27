package net.raymond.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.raymond.tutorialmod.TutorialMod;
import net.raymond.tutorialmod.item.custom.MetalDetectorItem;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE = registerItem("sapphire",new Item(new FabricItemSettings()));
    public static final Item RAW_SAPPHIRE = registerItem("raw_sapphire",new Item(new FabricItemSettings()));

    public static final Item METAL_DETECTOR = registerItem("metal_detector", new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));
    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item STRAWBERRY = registerItem("strawberry", new Item(new FabricItemSettings().food(ModFoodComponents.STRAWBERRY)));

    public static final Item COAL_BRIQUETTE = registerItem("coal_briquette", new Item(new FabricItemSettings()));

    public static final Item RUBY_STAFF = registerItem("ruby_staff", new Item(new FabricItemSettings().maxCount(1)));

    // T O O L S
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", new PickaxeItem(ModToolMaterial.RUBY, 2, 2f
        ,new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe", new AxeItem(ModToolMaterial.RUBY, 4, 2f
            ,new FabricItemSettings()));
    public static final Item RUBY_SWORD = registerItem("ruby_sword", new SwordItem(ModToolMaterial.RUBY, 5, 3f
            ,new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", new ShovelItem(ModToolMaterial.RUBY, 1, 2f
            ,new FabricItemSettings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", new HoeItem(ModToolMaterial.RUBY, 0, 0f
            ,new FabricItemSettings()));

    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe", new PickaxeItem(ModToolMaterial.SAPPHIRE, 2, 2f
            ,new FabricItemSettings()));
    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe", new AxeItem(ModToolMaterial.SAPPHIRE, 4, 2f
            ,new FabricItemSettings()));
    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword", new SwordItem(ModToolMaterial.SAPPHIRE, 5, 3f
            ,new FabricItemSettings()));
    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel", new ShovelItem(ModToolMaterial.SAPPHIRE, 1, 2f
            ,new FabricItemSettings()));
    public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe", new HoeItem(ModToolMaterial.SAPPHIRE, 0, 0f
            ,new FabricItemSettings()));

    public static final Item GARNET_SCYTHE = registerItem("garnet_scythe", new SwordItem(ModToolMaterial.SAPPHIRE, 7, 1.5f
            ,new FabricItemSettings()));





    private static void addItemsToIngredients(FabricItemGroupEntries entries){
        entries.add(RUBY);
        entries.add(RAW_RUBY);
        entries.add(SAPPHIRE);
        entries.add(RAW_SAPPHIRE);

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredients);
    }
}
