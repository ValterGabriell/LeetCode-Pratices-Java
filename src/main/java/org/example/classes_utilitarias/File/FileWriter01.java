package org.example.classes_utilitarias.File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        {
            try (FileWriter fw = new FileWriter(file, true)) {
                fw.write("vish te sai man to precisn");
                fw.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
