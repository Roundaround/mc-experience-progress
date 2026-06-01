package me.roundaround.experienceprogress.client;

import com.mojang.blaze3d.platform.InputConstants;
import me.roundaround.experienceprogress.generated.Constants;
import me.roundaround.trove.client.KeyBindings;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.gui.components.debug.DebugEntryNoop;
import net.minecraft.client.gui.components.debug.DebugScreenEntries;
import net.minecraft.resources.Identifier;
import org.lwjgl.glfw.GLFW;

public final class ExperienceProgressClient {
  public static final Identifier DEBUG_HUD_ENTRY_IDENTIFIER = Identifier.fromNamespaceAndPath(
      Constants.MOD_ID,
      "visibility"
  );

  public static KeyMapping toggleKeyBinding;

  private ExperienceProgressClient() {}

  public static void initClient() {
    DebugScreenEntries.register(DEBUG_HUD_ENTRY_IDENTIFIER, new DebugEntryNoop());

    toggleKeyBinding = KeyBindings.register(new KeyMapping(
        "experienceprogress.keybind.toggle",
        InputConstants.Type.KEYSYM,
        GLFW.GLFW_KEY_X,
        KeyMapping.Category.DEBUG
    ));
  }
}
