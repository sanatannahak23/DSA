package com.tp.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\user\\Documents\\java.txt");
        if (!file.exists()) file.createNewFile();
        String str = "Hello everyone nice to meet with you.";
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        if (file.canWrite())
            fileOutputStream.write(str.getBytes());

        fileOutputStream.close();
    }
}
