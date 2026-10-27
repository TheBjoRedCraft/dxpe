package dev.thebjoredcraft.dxpe

import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin
import java.time.LocalDate

val instance get() = JavaPlugin.getPlugin(DxpeMain::class.java)

class DxpeMain : JavaPlugin() {
    override fun onEnable() {
        server.pluginManager.registerEvents(DxpeListener, this)
    }

    fun updatePlayer(player: Player) {
        val today = LocalDate.now()

        player.exp = yearProgress(today)
        player.level = today.year
    }

    private fun yearProgress(date: LocalDate): Float {
        val dayOfYear = date.dayOfYear
        val daysInYear = date.lengthOfYear()

        return dayOfYear.toFloat() / daysInYear
    }
}