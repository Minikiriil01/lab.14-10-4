package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class findFiles {
    ArrayList<File> list;

    public findFiles(String Path) throws IOException {
        System.out.println("----------------------------------");
        System.out.println("A list of files a direcktory..." + Path);
        System.out.println("----------------------------------");
        list = new ArrayList<File>();
        File f = new File(Path);
        File[] listFiles = f.listFiles();
        int i = 0;
        for (File f1 : listFiles) {
            list.add(f1);
            System.out.println(list.get(i++));
        }
    }
    public ArrayList<File> getList() {
        return list;
    }
    public File getIndex(int i) {
        return list.get(i);
    }
}