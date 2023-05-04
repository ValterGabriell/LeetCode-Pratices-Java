package org.example.classes_utilitarias.Path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\vgabr\\Documents\\GABRIEL\\Programacao\\BackendJava\\oop\\file.txt");
        Path p2 = Paths.get("C:\\Users\\vgabr\\Documents\\GABRIEL\\Programacao\\BackendJava\\oop", "file.txt");
        Path p3 = Paths.get("C:\\Users\\vgabr\\Documents\\GABRIEL\\Programacao\\BackendJava", "oop", "file.txt");
        System.out.println(p1.getFileName().toFile());
    }
}
