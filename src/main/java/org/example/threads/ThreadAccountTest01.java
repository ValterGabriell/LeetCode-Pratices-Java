package org.example.threads;

import org.example.threads.dominio.Account;

public class ThreadAccountTest01 implements Runnable{
    private final Account account = new Account();

    public static void main(String[] args) {
       ThreadAccountTest01 t1 = new ThreadAccountTest01();
       Thread thread = new Thread(t1, "Heestia");
       Thread thread2 = new Thread(t1, "Bell Cranel");
       thread.start();
       thread2.start();
    }

    private void withdrawal(int amount) {
        synchronized (account) {
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " está indo sacar dinheiro");
                account.withdrawal(amount);
                System.out.println(getThreadName() + " completou o saque, valor atual da conta " + account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque: " + account.getBalance());
            }
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0){
                System.out.println("FODEO");
            }
        }
    }
}
