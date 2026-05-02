package com.furtabs.morefunctionalstorageexnihilo;

import com.buuz135.functionalstorage.item.FSAttachments;
import com.buuz135.functionalstorage.item.FSItem;
import com.buuz135.functionalstorage.item.component.ExecuteEveryBehavior;
import com.chinaex123.more_functionalstorage_upgrade.init.Item.ConfigItemGeneration;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.registries.DeferredItem;

import static com.chinaex123.more_functionalstorage_upgrade.init.Item.CustomUpgradeItem.ITEMS;

public class GravelCompat {

    private static Item createItemGenerator(String itemId, int count, int interval) {
        return new FSItem(new Item.Properties().component(FSAttachments.FUNCTIONAL_BEHAVIOR,
                new ExecuteEveryBehavior(interval, new ConfigItemGeneration.Delayed(
                        itemId, count, interval)
                ))
        );
    }

    private static final String GRAVEL_ID = "minecraft:gravel";

        public static final DeferredItem<Item> GRAVEL_GENERATOR_UPGRADE_1 =
            ITEMS.register("gravel_generator_upgrade_1", () ->
                    createItemGenerator(GRAVEL_ID, 8, 20)
            );
    public static final DeferredItem<Item> GRAVEL_GENERATOR_UPGRADE_2 =
            ITEMS.register("gravel_generator_upgrade_2", () ->
                    createItemGenerator(GRAVEL_ID, 16, 15)
            );
    public static final DeferredItem<Item> GRAVEL_GENERATOR_UPGRADE_3 =
            ITEMS.register("gravel_generator_upgrade_3", () ->
                    createItemGenerator(GRAVEL_ID, 32, 10)
            );
    public static final DeferredItem<Item> GRAVEL_GENERATOR_UPGRADE_4 =
            ITEMS.register("gravel_generator_upgrade_4", () ->
                    createItemGenerator(GRAVEL_ID, 64, 5)
            );
    public static final DeferredItem<Item> GRAVEL_GENERATOR_UPGRADE_5 =
            ITEMS.register("gravel_generator_upgrade_5", () ->
                    createItemGenerator(GRAVEL_ID, 64, 1)
            );

    public static void register() {
        // This method is intentionally left blank. The static initializers will handle registration.
    }
}