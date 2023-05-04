package org.example.classes_utilitarias.File;

import java.io.File;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\vgabr\\Documents\\GABRIEL\\Programacao\\BackendJava\\oop\\src\\teste.txt");
        try {
            boolean created = file.createNewFile();
            System.out.println(created);
            System.out.println("path: " + file.getPath());
            System.out.println("path absolute " + file.getAbsolutePath());
            System.out.println("is directory " + file.isDirectory());
            System.out.println("is file " + file.isFile());
            System.out.println("is hidden " + file.isHidden());
            System.out.println("last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDate());
            boolean exists = file.exists();
            if (exists) {
                System.out.println(file.delete());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
