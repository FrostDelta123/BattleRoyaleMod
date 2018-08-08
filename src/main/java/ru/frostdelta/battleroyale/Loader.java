package ru.frostdelta.battleroyale;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.event.RegistryEvent;
import ru.frostdelta.battleroyale.items.*;
import ru.frostdelta.battleroyale.proxy.CommonProxy;

@Mod(
        modid = Loader.MOD_ID,
        name = Loader.MOD_NAME,
        version = Loader.VERSION
)
public class Loader {

    public static final String MOD_ID = "BattleRoyale";
    public static final String MOD_NAME = "BattleRoyale";
    public static final String VERSION = "1.0-SNAPSHOT";

    @Mod.Instance(MOD_ID)
    public static Loader INSTANCE;

    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {

    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }

    /**
     * Forge will automatically look up and bind blocks to the fields in this class
     * based on their registry name.
     */
    @GameRegistry.ObjectHolder(MOD_ID)
    public static class Blocks {
      /*
          public static final MySpecialBlock mySpecialBlock = null; // placeholder for special block below
      */
    }

    /**
     * Forge will automatically look up and bind items to the fields in this class
     * based on their registry name.
     */
    @GameRegistry.ObjectHolder(MOD_ID)
    public static class Items {

        public static final AKM AKM = null;
        public static final AUG AUG = null;
        public static final AWM AWM = null;
        public static final Crossbow Crossbow = null;
        public static final DP_28 DP_28 = null;
        public static final Groza Groza = null;
        public static final Kar98K Kar98K = null;
        public static final M14A4 M14A4 = null;
        public static final M24 M24 = null;
        public static final M249 M249 = null;
        public static final M416 M416 = null;
        public static final Mini_14 Mini_14 = null;
        public static final Mk14_EBR Mk14_EBR = null;
        public static final Obrez Obrez = null;
        public static final P18C P18C = null;
        public static final P92 P92 = null;
        public static final P1911 P1911 = null;
        public static final R45 R45 = null;
        public static final R1895 R1895 = null;
        public static final S12K S12K = null;
        public static final S686 S686 = null;
        public static final S1897 S1897 = null;
        public static final SKAR_L SKAR_L = null;
        public static final SKS SKS = null;
        public static final Tommy_Gun Tommy_Gun = null;
        public static final UMP9 UMP9 = null;
        public static final UZI UZI = null;
        public static final Vector Vector = null;
        public static final VSS VSS = null;
        public static final Win_94 Win_94 = null;
      /*
          public static final ItemBlock mySpecialBlock = null; // itemblock for the block above
          public static final MySpecialItem mySpecialItem = null; // placeholder for special item below
      */
    }

    /**
     * This is a special class that listens to registry events, to allow creation of mod blocks and items at the proper time.
     */
    @Mod.EventBusSubscriber
    public static class ObjectRegistryHandler {
        /**
         * Listen for the register event for creating custom items
         */
        @SubscribeEvent
        public static void addItems(RegistryEvent.Register<Item> event) {

            event.getRegistry().register(new AKM().setRegistryName(MOD_ID,"AKM"));
            event.getRegistry().register(new AUG().setRegistryName(MOD_ID,"AUG"));
            event.getRegistry().register(new AWM().setRegistryName(MOD_ID,"AWM"));
            event.getRegistry().register(new Crossbow().setRegistryName(MOD_ID,"Crossbow"));
            event.getRegistry().register(new DP_28().setRegistryName(MOD_ID,"DP 28"));
            event.getRegistry().register(new Groza().setRegistryName(MOD_ID,"Groza"));
            event.getRegistry().register(new Kar98K().setRegistryName(MOD_ID,"Kar98k"));
            event.getRegistry().register(new M14A4().setRegistryName(MOD_ID,"M14A4"));
            event.getRegistry().register(new M24().setRegistryName(MOD_ID,"M24"));
            event.getRegistry().register(new M249().setRegistryName(MOD_ID,"M249"));
            event.getRegistry().register(new M416().setRegistryName(MOD_ID,"M416"));
            event.getRegistry().register(new Mini_14().setRegistryName(MOD_ID,"Mini 14"));
            event.getRegistry().register(new Mk14_EBR().setRegistryName(MOD_ID,"Mk14 EBR"));
            event.getRegistry().register(new Obrez().setRegistryName(MOD_ID,"Obrez"));
            event.getRegistry().register(new P18C().setRegistryName(MOD_ID,"P18C"));
            event.getRegistry().register(new P92().setRegistryName(MOD_ID,"P92"));
            event.getRegistry().register(new P1911().setRegistryName(MOD_ID,"P1911"));
            event.getRegistry().register(new R45().setRegistryName(MOD_ID,"R45"));
            event.getRegistry().register(new R1895().setRegistryName(MOD_ID,"R1895"));
            event.getRegistry().register(new S12K().setRegistryName(MOD_ID,"S12K"));
            event.getRegistry().register(new S686().setRegistryName(MOD_ID,"S686"));
            event.getRegistry().register(new S1897().setRegistryName(MOD_ID,"S1897"));
            event.getRegistry().register(new SKAR_L().setRegistryName(MOD_ID,"SKAR_L"));
            event.getRegistry().register(new SKS().setRegistryName(MOD_ID,"SKS"));
            event.getRegistry().register(new Tommy_Gun().setRegistryName(MOD_ID,"Tommy_Gun"));
            event.getRegistry().register(new UMP9().setRegistryName(MOD_ID,"UMP9"));
            event.getRegistry().register(new UZI().setRegistryName(MOD_ID,"UZI"));
            event.getRegistry().register(new Vector().setRegistryName(MOD_ID,"Vector"));
            event.getRegistry().register(new VSS().setRegistryName(MOD_ID,"VSS"));
            event.getRegistry().register(new Win_94().setRegistryName(MOD_ID,"Win 94"));

           /*
             event.getRegistry().register(new ItemBlock(Blocks.myBlock).setRegistryName(MOD_ID, "myBlock"));
             event.getRegistry().register(new MySpecialItem().setRegistryName(MOD_ID, "mySpecialItem"));
            */
        }

        /**
         * Listen for the register event for creating custom blocks
         */
        @SubscribeEvent
        public static void addBlocks(RegistryEvent.Register<Block> event) {
           /*
             event.getRegistry().register(new MySpecialBlock().setRegistryName(MOD_ID, "mySpecialBlock"));
            */
        }
    }

    @SidedProxy(serverSide = "ru.frostdelta.battleroyale.proxy.CommonProxy", clientSide = "ru.frostdelta.battleroyale.proxy.ClientProxy")
    public static CommonProxy proxy;

    /* EXAMPLE ITEM AND BLOCK - you probably want these in separate files
    public static class MySpecialItem extends Item {

    }

    public static class MySpecialBlock extends Block {

    }
    */
}
