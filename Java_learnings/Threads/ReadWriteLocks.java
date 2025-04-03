package Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLocks {

    private int count = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public void getCount() {
        try{
            readLock.lock();
            for(int i=0;i<10;i++) {
                System.out.println(Thread.currentThread().getName() + " Reading counter.......value: " + count);
            }
        }catch (Exception e){

        }finally {
            readLock.lock();
        }
    }

    public void increment() {
        try{
            writeLock.lock();
            for(int i=0;i<10;i++) {
                System.out.println(Thread.currentThread().getName() + " Writing counter.......");
                count++;
            }
        }catch(Exception e) {

        }finally {
            writeLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ReadWriteLocks rwl = new ReadWriteLocks();

        Runnable write = new Runnable() {
            @Override
            public void run() {
                try{
                    rwl.increment();
                }catch (Exception e) {

                }
            }
        };

        Runnable read = new Runnable() {
            @Override
            public void run() {
                try{
                    rwl.getCount();
                }catch (Exception e) {

                }
            }
        };

        Thread t1 = new Thread(write);
        Thread t2 = new Thread(read);
        Thread t3 = new Thread(read);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Read write process completed...........!!!!!!!!!");
    }
}

