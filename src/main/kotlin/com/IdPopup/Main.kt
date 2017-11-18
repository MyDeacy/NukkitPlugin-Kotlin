package com.IdPopup


import cn.nukkit.Player
import cn.nukkit.event.EventHandler
import cn.nukkit.event.Listener
import cn.nukkit.event.player.PlayerItemHeldEvent
import cn.nukkit.plugin.PluginBase

class Main : PluginBase() , Listener {

    override fun onEnable() {
        server.getPluginManager().registerEvents(this, this)
    }

    @EventHandler
    fun Tap(event: PlayerItemHeldEvent) {
        val player: Player = event.player
        val item = event.item
        player.sendTip("ID -> ${item.getId()}:${item.getDamage()}")
    }
}