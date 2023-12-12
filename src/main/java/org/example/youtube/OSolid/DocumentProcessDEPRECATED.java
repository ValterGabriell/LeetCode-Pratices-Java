package org.example.youtube.OSolid;

public class DocumentProcessDEPRECATED {
    public void ProcessJSONDocument(String fileContent){
        String encrypt = encrypt(fileContent);
        System.out.println("Processando JSON: " + encrypt);
    }

    public void ProcessXMLDocument(String fileContent){
        String encrypt = encrypt(fileContent);
        System.out.println("Processando XML: " + encrypt);
    }

    private String encrypt(String fileContent){
        System.out.println("Encriptando " + fileContent);
        return fileContent.substring(0,3);
    }
}
