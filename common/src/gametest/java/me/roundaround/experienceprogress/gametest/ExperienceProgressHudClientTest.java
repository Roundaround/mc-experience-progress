package me.roundaround.experienceprogress.gametest;

import me.roundaround.allay.api.gametest.ClientGameTest;
import me.roundaround.experienceprogress.client.ExperienceProgressClient;
import me.roundaround.trove.gametest.ClientTest;
import me.roundaround.trove.gametest.ClientTestContext;
import me.roundaround.trove.gametest.ClientWorld;

/**
 * Boots a world, turns the XP-progress overlay on via the same debug entry the
 * keybind toggles, gives the player some XP, then renders for several frames. The
 * overlay numbers are drawn from a {@code @Mixin(Hud)} on the render thread, so a
 * crash there would kill the client and fail the test — this is the render smoke.
 */
@ClientGameTest
public class ExperienceProgressHudClientTest implements ClientTest {
  @Override
  public void runTest(ClientTestContext context) {
    try (ClientWorld world = context.worldBuilder().creative().stopTime(true).create()) {
      world.teleport(0.5, 65.0, 0.5);

      context.runOnClient((mc) -> {
        if (!mc.debugEntries.isCurrentlyEnabled(ExperienceProgressClient.DEBUG_HUD_ENTRY_IDENTIFIER)) {
          mc.debugEntries.toggleStatus(ExperienceProgressClient.DEBUG_HUD_ENTRY_IDENTIFIER);
        }
      });

      world.runCommand("xp add @s 30 points");
      context.waitTicks(10);
    }
  }
}
