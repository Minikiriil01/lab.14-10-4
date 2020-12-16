package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public ReadFile(String path, int cont) throws IOException {

        System.out.println("----------------------------------------");
        System.out.println("Shows the first five files..." + path);
        System.out.println("----------------------------------------");

        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int i = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                if (i == (cont - 1)) {
                    System.out.println("----------------------------------------");
                    return;
                }
                i++;

            }
        }
    }
}
