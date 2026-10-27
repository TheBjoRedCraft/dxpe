package dev.thebjoredcraft.dxpe

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

object DxpeListener : Listener {
    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        instance.updatePlayer(event.player)
    }
}