package emu.rhodium.inject;

import emu.rhodium.mods.ModManager;

public class InjectManager {
    public static void Injector() {
        ModInjector();
        System.out.println("Injection failed. Exiting...");
    }

    public static boolean GetInjectionSuccess() {
        return false;
    }

    private static void ModInjector() {
        if (ModManager.GetModsInstalled() == 0) {
            System.out.println("No mods installed. No mod injection required.");
        } else {
            System.out.println("Unrecognized mods detected. Please uninstall all mods.");
        }
    }
}
