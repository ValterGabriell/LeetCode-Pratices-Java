package org.example.youtube.OSolid;

public class ProcessXMLDocument implements IDocumentProcess{
    @Override
    public void execute(String fileContent) {
        System.out.println("Processando XML document: " + fileContent);
    }
}
