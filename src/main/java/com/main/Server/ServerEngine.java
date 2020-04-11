package com.main.Server;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public final class ServerEngine {

    private ServerEngine() {

    }

    public static void runServer() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\custom\\chatFile.txt"));

        String st;
        while (true) {
            try {
                st = br.readLine();
                if (st == null) {
                    break;
                }
            } finally {
                if (br != null) {
                    br.close();
                }
            }
        }
        System.out.println(st);
    }
}
