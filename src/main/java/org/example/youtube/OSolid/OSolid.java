package org.example.youtube.OSolid;

public class OSolid {
    public static void main(String[] args) {
        var content = "KLJDHFKLASJDF";
        ProcessJSONDocument processJSONDocument = new ProcessJSONDocument();
        EncryptDocument document = new EncryptDocument(processJSONDocument);
        process(content, document);
    }
    public static void process(String fileContent, IDocumentProcess iDocumentProcess){
        iDocumentProcess.execute(fileContent);
    }
}
