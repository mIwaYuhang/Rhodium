package emu.rhodium.server;

import io.javalin.Javalin;

enum METHOD {
    GET,
    POST,
}

public class ServerCore {
    public static void StartServer(int port) {
        var server = Javalin.create().start(port);
    }
}