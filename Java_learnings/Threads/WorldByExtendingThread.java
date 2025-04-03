package Threads;

public class WorldByExtendingThread extends Thread{
    @Override
    public void run() {
        System.out.println("RUNNING");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
