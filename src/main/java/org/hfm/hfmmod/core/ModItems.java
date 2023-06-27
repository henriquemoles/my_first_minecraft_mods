package org.hfm.hfmmod.core;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.hfm.hfmmod.Hfmmod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Hfmmod.MODID);

    public static final RegistryObject<Item> MOD_BLOCK = ITEMS.register("mod_block", () -> new BlockItem(ModBlocks.MOD_BLOCK.get(), new Item.Properties()));
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Hfmmod.MODID);

    public static final RegistryObject<Item>  MOD_ITEM = ITEMS.register("mod_item", () -> new Item(new Item.Properties()));
    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("mod_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> MOD_BLOCK.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(MOD_ITEM.get());
                output.accept(MOD_BLOCK.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
            }).build());
}

