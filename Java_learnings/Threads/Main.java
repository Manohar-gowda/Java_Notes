package Threads;

public class Main {
    public static void main(String[] args) {
     BankAccount sbi = new BankAccount();

     Runnable ask = new Runnable() {
         @Override
         public void run() {
             try {
                 sbi.withDraw(50);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
     };
     Thread t1 = new Thread(ask);
     Thread t2 = new Thread(ask);

     t1.start();
     t2.start();
    }
}
