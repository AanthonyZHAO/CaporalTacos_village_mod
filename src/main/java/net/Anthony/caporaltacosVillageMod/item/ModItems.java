package net.Anthony.caporaltacosVillageMod.item;

import net.Anthony.caporaltacosVillageMod.caporaltacos_village_mod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, caporaltacos_village_mod.MOD_ID);


    public static final RegistryObject<Item> FLOWER_CROWN = ITEMS.register("flower_crown",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
