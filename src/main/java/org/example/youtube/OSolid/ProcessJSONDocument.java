package org.example.youtube.OSolid;

public class ProcessJSONDocument implements IDocumentProcess{
    @Override
    public void execute(String fileContent) {
        System.out.println("Processando JSON: " + fileContent);
    }
}
