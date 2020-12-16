package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class WriteToFileList {
    public WriteToFileList(String path, ArrayList<File> list) throws IOException {
        System.out.println("------------------------------------");
        System.out.println("Write to the file list..." + path);
        System.out.println("------------------------------------");

        byte[] bt;
        try (FileOutputStream inFile = new FileOutputStream(path)) {

            for (File f : list) {
                bt = (f.getCanonicalPath() + System.getProperty("line.separator")).getBytes();
                inFile.write(bt);
            }
        }
    }
}