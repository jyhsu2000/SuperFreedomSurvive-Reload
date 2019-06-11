package SuperFreedomSurviveReload;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class Data {

    static Plugin plugin = Bukkit.getPluginManager().getPlugin("SuperFreedomSurvive");
    static boolean update = false;

    static void change(boolean u) {
        update = u;
    }


}
