package com.main.Client;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public final class ClientEngine {

    private static final String FILE_LOCATION = "C:\\custom\\chatFile.txt";
    private ClientEngine() {

    }

    public static void runClient() throws IOException {
        FileWriter fileWriter = null;
        final String message = "hii";
        try {
            File file = new File("");
            fileWriter = new FileWriter(file);
            fileWriter.write(message);
            fileWriter.flush();
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }
}
