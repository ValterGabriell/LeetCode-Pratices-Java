package org.example.youtube.OSolid;

public class EncryptDocument implements IDocumentProcess {
    private final IDocumentProcess documentProcess;

    public EncryptDocument(IDocumentProcess documentProcess) {
        this.documentProcess = documentProcess;
    }

    @Override
    public void execute(String fileContent) {
         var encryptedDocument = encrypt(fileContent);
         documentProcess.execute(encryptedDocument);
    }

    private String encrypt(String content) {
        System.out.println("Encriptar o documento: " + content);
        return content.substring(0, 3);
    }
}
