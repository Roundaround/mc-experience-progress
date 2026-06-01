package me.roundaround.experienceprogress.forge;

import me.roundaround.experienceprogress.client.ExperienceProgressClient;
import me.roundaround.trove.forge.TroveForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("experienceprogress")
public final class ExperienceProgressForgeMod {
  public ExperienceProgressForgeMod(FMLJavaModLoadingContext context) {
    TroveForge.bootstrap(context);

    FMLClientSetupEvent.getBus(context.getModBusGroup())
        .addListener(event -> ExperienceProgressClient.initClient());
  }
}
