package me.roundaround.experienceprogress;

import me.roundaround.allay.api.Entrypoint;
import me.roundaround.experienceprogress.client.ExperienceProgressClient;
import net.fabricmc.api.ClientModInitializer;

@Entrypoint(Entrypoint.CLIENT)
public class ExperienceProgressMod implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
    ExperienceProgressClient.initClient();
  }
}
