package sanjurjo7.lucre;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Lucre.MODID, name=Lucre.MODNAME, version=Lucre.VERSION)
public class Lucre {
    
    public static final String MODID = "lucre";
    public static final String MODNAME = "Lucre";
    public static final String VERSION = "0.0.1";

    @Instance
    public static Lucre instance = new Lucre();

    @EventHandler
    public void preInit (FMLPreInitializationEvent e) {
    }

    @EventHandler
    public void init (FMLInitializationEvent e) {
    }

    @EventHandler
    public void postInit (FMLPostInitializationEvent e) {
    }
}

}
