package org.example.classes_utilitarias.File;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File directory = new File("folder");
        boolean mkdir = directory.mkdir();
        System.out.println(mkdir);
        File file = new File(directory, "test.txt");
        try {
            boolean b = file.createNewFile();
            System.out.println(b);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File fileRenamed = new File(directory, "arquivo_renomeado.txt");
        boolean b = file.renameTo(fileRenamed);
        System.out.println(b);

        File directoryRenamed = new File("folder2");
        boolean b1 = directory.renameTo(directoryRenamed);
        System.out.println(b1);
    }
}
