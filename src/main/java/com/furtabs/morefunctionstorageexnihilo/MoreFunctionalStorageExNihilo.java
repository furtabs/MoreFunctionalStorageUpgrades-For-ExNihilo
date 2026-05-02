package com.furtabs.morefunctionalstorageexnihilo;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;

import com.chinaex123.more_functionalstorage_upgrade.init.ModCreativeTabs;
import com.chinaex123.more_functionalstorage_upgrade.init.ModItems;
import com.chinaex123.more_functionalstorage_upgrade.init.Item.CustomUpgradeItem;
import com.chinaex123.more_functionalstorage_upgrade.init.ModCompat.CreateCompat;
import com.furtabs.morefunctionalstorageexnihilo.ExNihiloCompat;
import com.furtabs.morefunctionalstorageexnihilo.GravelCompat;

@Mod(MoreFunctionalStorageExNihilo.MODID)
public class MoreFunctionalStorageExNihilo {
    public static final String MODID = "morefunctionalstorageexnihilo";

        public MoreFunctionalStorageExNihilo(IEventBus modEventBus, ModContainer modContainer) {
        if (ModList.get().isLoaded("exnihilosequentia")) {
            ExNihiloCompat.register();
        }
        GravelCompat.register();
    }

}