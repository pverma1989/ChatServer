package com.main;

import com.main.Client.ClientEngine;
import com.main.Server.ServerEngine;
import java.io.IOException;

public final class Main {

    private Main(){

    }

    public static void main(String[] args) throws IOException {
        String engine = "client";
        engine = engine.toLowerCase();
        switch( engine ) {
            case "client": ClientEngine.runClient();
                System.out.println("Client is connecting");
                break;
            case "server": ServerEngine.runServer();
                System.out.println("Client is connecting");
                break;
            default:
                System.out.println("no match");
        }
    }
}

