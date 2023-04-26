package org.example.excecoes.teste.runtime;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro IndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro RunTimeException");
        }
    }

    private static void talvezLance() throws SQLException, FileNotFoundException{

    }
}
