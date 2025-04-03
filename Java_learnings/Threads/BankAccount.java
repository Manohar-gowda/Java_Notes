package Threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withDraw(int amount) throws InterruptedException {
        if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
            if(balance >= amount) {
                try{
                    System.out.println(Thread.currentThread().getName() + " Proceeding process....");
                    balance -= amount;
                    Thread.sleep(10000);
                    System.out.println(Thread.currentThread().getName() + " completed process.....");
                }catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }finally {
                    lock.unlock();
                }

            }else {
                System.out.println(MyThread.currentThread().getName() + " Insufficient balance......");
            }
        }else {
            System.out.println(Thread.currentThread().getName() + " could not acquired lock...");
        }
    }
}
