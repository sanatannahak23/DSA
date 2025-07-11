package com.tp.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\user\\Documents\\java.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        if (file.canRead()) {
            int n = fileInputStream.read();
            while (n != -1) {
                System.out.print((char) n);
                n = fileInputStream.read();
            }
        } else System.out.println("Can't read data...");
        fileInputStream.close();
    }
}
