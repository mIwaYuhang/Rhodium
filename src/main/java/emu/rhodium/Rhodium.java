package emu.rhodium;

import emu.rhodium.server.ServerCore;
import emu.rhodium.config.Configuration;
import emu.rhodium.game.GameManager;

public class Rhodium {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ServerCore.ServerRespond();
        Configuration.OverrideMe();
        GameManager.GameInit();
    }
}