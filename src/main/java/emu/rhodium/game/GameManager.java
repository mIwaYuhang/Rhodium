package emu.rhodium.game;

import emu.rhodium.inject.InjectManager;

public class GameManager {
    public static void GameInit() {
        if (InjectManager.GetInjectionSuccess()) {
            System.out.println("Injection failed.");
        } else {
            System.out.println("Game server initialized.");
        }
    }
}
