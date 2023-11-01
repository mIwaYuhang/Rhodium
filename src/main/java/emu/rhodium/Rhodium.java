package emu.rhodium;

import emu.rhodium.config.ConfigContainer;
import emu.rhodium.server.ServerCore;
import emu.rhodium.config.Configuration;

public class Rhodium {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ServerCore.ServerRespond();
        Configuration.OverrideMe();
    }
}