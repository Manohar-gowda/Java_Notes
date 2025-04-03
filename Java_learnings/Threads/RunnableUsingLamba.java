package Threads;

public class RunnableUsingLamba {

    public static void main(String[] args) {
        Runnable task1 = () -> {
            System.out.println("Hello this is runnable implementaion using lamba.");
        };

        Thread t1 = new Thread(task1);
        t1.start();
    }
}