package org.example.youtube.MD;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ExplainMD {
    public static void main(String[] args) {
        String code = "3213";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(code.getBytes());
            byte[] digest = md.digest();

            System.out.println("Mensagem original: " + code);
            System.out.println("Array de Bytes digerido: " + digest.toString());
            String toHex = bytesToHex(digest);
            System.out.println("Salvando HEX: " + toHex);

            String codeEnterByUser = "9bd5ee6fe55aaeb673025dbcb8f939c1";
            if (codeEnterByUser.equals(toHex)) System.out.println("Código válidado!");
            if (!codeEnterByUser.equals(toHex)) System.out.println("Código incorreto!");

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }


    // Método para converter um array de
    // bytes em uma representação hexadecimal
    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

}
