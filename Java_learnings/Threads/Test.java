package Threads;

public class Test {
    public static void main(String[] args) throws InterruptedException{
        WorldByExtendingThread world = new WorldByExtendingThread();
//        world.start();
//        for(int i=0;i<100000;i++) {
//            System.out.println("Hello");
//        }
//        WorldUsingInterface wui = new WorldUsingInterface();
//        Thread t1 = new Thread(wui);
//        t1.start();
//        System.out.println("World");

//        ---------------------------------------------------------------------------------
//        System.out.println(world.getState());
//        world.start();
//        System.out.println(world.getState());
//        Thread.sleep(100);
//        System.out.println(world.getState());
//        world.join();
//        System.out.println(world.getState());

//        ---------------------------------------------------------------------------------

        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (Exception e) {

        }
        System.out.println(counter.getCount());
    }
}