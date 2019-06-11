package SuperFreedomSurviveReload;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Index extends JavaPlugin {

    static public Plugin plugin = null;

    @Override
    public void onEnable() {

        plugin = this;

        this.getCommand("update").setExecutor(new SuperFreedomSurviveReload.Update());
        getServer().getPluginManager().registerEvents(new SuperFreedomSurviveReload.Event() , this);

    }

    @Override
    public void onDisable() {

        plugin = null;
        // Plugin shutdown logic
    }



}
