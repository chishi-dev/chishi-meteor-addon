package dev.mswgumo.chishi.meteor.addon.modules;

import dev.mswgumo.chishi.meteor.addon.ChiShiAddon;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;

public class NoSprint extends Module {
    public NoSprint() {
        super(ChiShiAddon.CATEGORY, "no-sprint", "No Sprint");
    }


    @EventHandler
    public void onTick(TickEvent.Pre event) {
        if (mc.player == null) return;
        mc.player.setSprinting(false);
    }
}
