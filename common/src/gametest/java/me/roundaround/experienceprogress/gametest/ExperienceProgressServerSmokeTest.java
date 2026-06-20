package me.roundaround.experienceprogress.gametest;

import me.roundaround.allay.api.gametest.ServerGameTest;
import me.roundaround.trove.gametest.ServerSmokeTest;

/**
 * Experience Progress is client-only; this asserts it's a clean dedicated-server
 * no-op (boots, ticks, loads no client class). The body lives in {@link ServerSmokeTest}.
 */
@ServerGameTest
public class ExperienceProgressServerSmokeTest extends ServerSmokeTest {
}
