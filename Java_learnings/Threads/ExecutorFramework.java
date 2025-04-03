package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFramework {

    public static void main(String[] args) {

        ExecutorService exec = Executors.newFixedThreadPool(3);
        for(int i=1;i<9;i++) {
            int finalI = i;
            exec.submit(() -> {
                long res = 0;
                try {
                    res = factorial(finalI);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(res);
            });
        }
        exec.shutdown();
    }

    public static long factorial(int num) throws InterruptedException {
        long res = 1;
        Thread.sleep(1000);
        for(int i=1;i<=num;i++) {
            res *= i;
        }
        return res;
    }
}
