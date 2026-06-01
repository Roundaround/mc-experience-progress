package me.roundaround.experienceprogress.neoforge;

import me.roundaround.experienceprogress.client.ExperienceProgressClient;
import me.roundaround.trove.neoforge.TroveNeoForge;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod("experienceprogress")
public final class ExperienceProgressNeoForgeMod {
  public ExperienceProgressNeoForgeMod(IEventBus modBus, ModContainer container) {
    TroveNeoForge.bootstrap(modBus, container);

    modBus.addListener(FMLClientSetupEvent.class, event -> ExperienceProgressClient.initClient());
  }
}
