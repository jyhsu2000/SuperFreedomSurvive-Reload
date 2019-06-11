package SuperFreedomSurviveReload;

import com.destroystokyo.paper.event.player.PlayerLaunchProjectileEvent;
import com.destroystokyo.paper.event.player.PlayerReadyArrowEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;
import org.bukkit.event.entity.*;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;
import org.bukkit.event.hanging.HangingPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.*;
import org.bukkit.event.vehicle.VehicleDamageEvent;
import org.bukkit.event.vehicle.VehicleEnterEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;

public class Event implements Listener {
    // 事件觸發器

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // 停用死亡訊息
    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerDeathEvent( PlayerDeathEvent event ) {
        event.setDeathMessage( null );
    }

    // 停用登入訊息
    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerJoinEvent( PlayerJoinEvent event ) {
        event.setJoinMessage( null );

        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.getPlayer().sendMessage("§e------------------------ 伺服器 維護中 ------------------------");
        }

    }

    // 停用登出訊息
    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerQuitEvent(PlayerQuitEvent event) {
        event.setQuitMessage( null );
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onEntityChangeBlockEvent(EntityChangeBlockEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onBlockBreakEvent(BlockBreakEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onBlockDamageEvent(BlockDamageEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onBlockExplodeEvent(BlockExplodeEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onBlockFertilizeEvent(BlockFertilizeEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onBlockIgniteEvent(BlockIgniteEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onBlockMultiPlaceEvent(BlockMultiPlaceEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onBlockPlaceEvent(BlockPlaceEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onSignChangeEvent(SignChangeEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onSpongeAbsorbEvent(SpongeAbsorbEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerInteractEvent(PlayerInteractEvent event) {
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // 破壞物品展示框
    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onHangingBreakByEntityEvent(HangingBreakByEntityEvent event) {
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    // 放置物品展示框
    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onHangingPlaceEvent(HangingPlaceEvent event) {
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onEntityDamageByEntityEvent(EntityDamageByEntityEvent event) {
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onEntityExplodeEvent(EntityExplodeEvent event) {
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    // 實體進入礦車
    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onVehicleEnterEvent(VehicleEnterEvent event) {
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    // 實體離開礦車
    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onVehicleExitEvent(VehicleExitEvent event) {
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    // 實體破壞礦車
    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onVehicleDamageEvent(VehicleDamageEvent event) {
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerArmorStandManipulateEvent(PlayerArmorStandManipulateEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerBedEnterEvent(PlayerBedEnterEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerBucketFillEvent(PlayerBucketFillEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerBucketEmptyEvent(PlayerBucketEmptyEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerCommandPreprocessEvent(PlayerCommandPreprocessEvent event){
        if ( event.getMessage().equals("/update") ) {
            return;
        }
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerDropItemEvent(PlayerDropItemEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerEditBookEvent(PlayerEditBookEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerEggThrowEvent(PlayerEggThrowEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setHatching(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerFishEvent(PlayerFishEvent event){
        //  當玩家釣魚時觸發本事件
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerInteractEntityEvent(PlayerInteractEntityEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerItemConsumeEvent(PlayerItemConsumeEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerItemConsumeEvent(PlayerInteractEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerItemMendEvent(PlayerItemMendEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerPickupArrowEvent(PlayerPickupArrowEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerPortalEvent(PlayerPortalEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerShearEntityEvent(PlayerShearEntityEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerTeleportEvent(PlayerTeleportEvent event){
        if ( event.getCause() == PlayerTeleportEvent.TeleportCause.ENDER_PEARL ) {
            if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
                event.setCancelled(true);
            }
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onInventoryClickEvent(InventoryClickEvent event) {
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerInteractEvent_(PlayerInteractEvent event) {
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerReadyArrowEvent(PlayerReadyArrowEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    @EventHandler( priority = EventPriority.HIGHEST )
    final public void onPlayerLaunchProjectileEvent(PlayerLaunchProjectileEvent event){
        if (!Bukkit.getPluginManager().isPluginEnabled("ServerPlugin")) {
            event.setCancelled(true);
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////








}
