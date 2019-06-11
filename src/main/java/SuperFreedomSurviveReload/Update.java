package SuperFreedomSurviveReload;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Update implements CommandExecutor {
    // 更新

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender.hasPermission("command.update")) {

            if (Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
                // 更新維護

                new BukkitRunnable() {
                    int time = 3;

                    @Override
                    final public void run() {

                        if (time <= 0) {

                            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                            // 結束插件
                            //HandlerList.unregisterAll(Data.plugin); // 解除綁定所有事件
                            //HandlerList.bakeAll();
                            Bukkit.resetRecipes(); // 取消合成表
                            Bukkit.getPluginManager().disablePlugin(Data.plugin, true); // 停用




                            //Bukkit.getLogger().info("維護中");
                            Bukkit.broadcastMessage("§e------------------------ 伺服器 維護中 ------------------------");

                            // 將該全部的玩家全部都移動到主城 並關閉界面
                            // 取得所有玩家清單
                            Collection collection = Bukkit.getServer().getOnlinePlayers();
                            Iterator iterator = collection.iterator();

                            Location location = Bukkit.getWorld("w").getSpawnLocation();

                            // 總數
                            while (iterator.hasNext()) {

                                try {
                                    Player player = ((Player) iterator.next());
                                    //player.closeInventory();
                                    // 把所有坐騎傳送到同樣地點
                                    Entity vehicle = player.getVehicle();
                                    if (vehicle != null) {
                                        player.leaveVehicle();

                                        vehicle.teleportAsync(location);
                                        // 傳送
                                        player.teleportAsync(location); // 傳送玩家過去
                                    } else {
                                        // 傳送
                                        player.teleportAsync(location); // 傳送玩家過去
                                    }

                                    // 玩家騎上
                                    if (vehicle != null) {
                                        vehicle.addPassenger(player);
                                    }

                                    if ( player.getGameMode() == GameMode.SPECTATOR ) {
                                    } else if ( player.getGameMode() == GameMode.CREATIVE ) {
                                    } else {
                                        player.setFlying(false); // 禁止飛行
                                        player.setAllowFlight(false); // 禁止飛行
                                    }

                                } catch (Exception ex) {
                                }
                            }

                            // 結束其他所有的世界
                            List<World> list = Bukkit.getWorlds();
                            for (int i = list.size() - 1; i >= 0; --i) {
                                if (
                                        list.get(i).getName().equals("w") ||
                                        list.get(i).getName().equals("w_nether") ||
                                        list.get(i).getName().equals("w_the_end")
                                ) {

                                } else {
                                    // 安全的停止並保存區塊
                                    for (int ii = 0; ii < list.get(i).getLoadedChunks().length; ++ii) {
                                        list.get(i).unloadChunk(list.get(i).getLoadedChunks()[ii]);
                                    }

                                    Bukkit.unloadWorld(list.get(i), true); // 停止世界

                                    Bukkit.getLogger().info("世界 " + list.get(i).getName() + " 已停止");
                                }
                            }


                            cancel();
                            return;

                        } else {
                            if ( time == 60 || time == 30 || time == 20 || time == 10 || time <= 5 ) {
                                Bukkit.broadcastMessage("§e伺服器線上維護 剩餘" + time + "秒");
                            }

                        }

                        --time;
                    }
                }.runTaskTimer(Index.plugin,0L , 20L);


            } else {
                // 維護結束

                // 載入插件
                //Bukkit.getPluginManager().enablePlugin(Data.plugin);

                Bukkit.reload();
                if (Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
                    Bukkit.broadcastMessage("§e----------------------- 伺服器 維護結束 -----------------------");
                }


/*
                new BukkitRunnable() {
                    int time = 10;
                    @Override
                    final public void run() {

                        if (time <= 0) {

                            Bukkit.reload();

                            if (Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
                                Bukkit.broadcastMessage("§e----------------------- 伺服器 維護結束 -----------------------");
                            }

                            cancel();
                            return;

                        } else {
                            if ( time == 10 || time <= 5 ) {
                                Bukkit.broadcastMessage("§e伺服器維護結束 剩餘" + time + "秒");
                            }

                        }

                        --time;
                    }
                }.runTaskTimer(Index.plugin,0L , 20L);
*/
            }
        }
        return true;

    }
}
