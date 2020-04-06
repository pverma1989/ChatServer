package com.main;
import com.main.Client.*;
import com.main.Server.*;

import java.io.FileNotFoundException;

public final class Main {

    private Main() {

    }
    public static void main(final String[] args) {

        String engine = "Client";
        switch (engine) {
            case "Client": ClientEngine.runClient();
                break;
            case "Server": ServerEngine.runServer();
                break;
            default:
                break;
        }
        System.out.println(engine + " program will execute");
    }
}

