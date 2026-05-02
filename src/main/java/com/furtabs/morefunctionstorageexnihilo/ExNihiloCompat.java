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

public class ExNihiloCompat {

    private static Item createItemGenerator(String itemId, int count, int interval) {
        return new FSItem(new Item.Properties().component(FSAttachments.FUNCTIONAL_BEHAVIOR,
                new ExecuteEveryBehavior(interval, new ConfigItemGeneration.Delayed(
                        itemId, count, interval)
                ))
        );
    }

    private static final String DUST_ID = "exnihilosequentia:dust";

    public static final DeferredItem<Item> DUST_GENERATOR_UPGRADE_1 =
            ITEMS.register("dust_generator_upgrade_1", () ->
                    createItemGenerator(DUST_ID, 8, 20)
            );

    public static final DeferredItem<Item> DUST_GENERATOR_UPGRADE_2 =
            ITEMS.register("dust_generator_upgrade_2", () ->
                    createItemGenerator(DUST_ID, 16, 15)
            );

    public static final DeferredItem<Item> DUST_GENERATOR_UPGRADE_3 =
            ITEMS.register("dust_generator_upgrade_3", () ->
                    createItemGenerator(DUST_ID, 32, 10)
            );

    public static final DeferredItem<Item> DUST_GENERATOR_UPGRADE_4 =
            ITEMS.register("dust_generator_upgrade_4", () ->
                    createItemGenerator(DUST_ID, 64, 5)
            );

    public static final DeferredItem<Item> DUST_GENERATOR_UPGRADE_5 =
            ITEMS.register("dust_generator_upgrade_5", () ->
                    createItemGenerator(DUST_ID, 64, 1)
            );

    public static void register() {
        // This method is intentionally left blank. The static initializers will handle registration.
    }
}