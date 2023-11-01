package emu.rhodium.config;

public class ConfigContainer {
    public static int ConfigVer() {
        return 1;
    }

    public static void OverrideMe() {
        System.out.println("Not Overridden.");
    }
}
