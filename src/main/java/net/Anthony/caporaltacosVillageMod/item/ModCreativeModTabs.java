package net.Anthony.caporaltacosVillageMod.item;

import net.Anthony.caporaltacosVillageMod.block.ModBlocks;
import net.Anthony.caporaltacosVillageMod.caporaltacos_village_mod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, caporaltacos_village_mod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CAPORALTACOS_VILLAGE_MOD_TAB =
            CREATIVE_MODE_TABS.register("caporaltacos_village_mod_tab",
                    () -> CreativeModeTab.builder()
                            .icon(() -> new ItemStack(ModBlocks.APPLE_BASKET.get()))
                            .title(Component.translatable("creativetab.caporaltacos_village_mod_tab"))
                            .displayItems((parameters, output) -> {
                                output.accept(ModBlocks.APPLE_BASKET.get());
                                output.accept(ModItems.FLOWER_CROWN.get());
                                output.accept(ModBlocks.SCULPTED_STATUE.get());

                                
                            })
                            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
