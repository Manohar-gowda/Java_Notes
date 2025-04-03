package MultiThreading;

  /*
       - MultiThreading: is the ability of a program to execute multiple threads simultaneously.
       - A Thread: is a smallest unit of execution within the process. (Its like having multiple workers inside a single
              java program, each handling a different task, all running at the same time.)
       - In java, multithreading is built into language and supported by the
           1. java.lang.Thread class
           2. java.lang.Runnable interface
           They are particularly useful for tasks like:
             * Performing background operations.
             * Parallelize computations to speed up processing.
             * Handling multiple client requests in a server application.

           Why use multithreading:
             * Efficiency
             * Responsiveness
             * Resource sharing
             * Scalability

         However, it comes with challenges like thread synchronization, race conditions and deadlocks.

       - The JVM manages threads, and the underlying operating system schedules them.
         Every java program starts with at least one thread: the main thread, which runs the main() method. From there, you
            can create additional threads to handle other tasks.

       - Creating Threads in Java:
          1. Extending the Thread class
          2. Implementing the Runnable interface

          Key methods of the Thread:
             * start(): Begins thread execution.
             * run(): contains the thread's task (override this)
             * sleep(long millis): Pauses the thread for a specified time.
             * join(): Waits for the thread to finish
             * setPriority(int p): Sets thread priority(1 to 10, default 5)
             * interrupt(): Signals the thread to stop

          - Thread Synchronization:
             When multiple threads access a shared resources, we will run into problems:
                * Race Condition: Unpredictable results due to un-synchronized access.
                * Data Corruption: One thread overwrites anothers changes.

            Java provides synchronization mechanisms:
            1. Synchronized Methods:
               public synchronized void increment() {
                  count++;
               }

             * only one thread can execute this method at a time on the same object.

            2. Synchronized blocks:
               public void increment()  {
                  synchronized(this){
                      count++;
                  }
               }
             * Locks only a specific block. offering finer control.

            3. Locks (java.util.concurrent.locks):
              import java.util.concurrent.locks.ReentrantLock;
              ReentrantLock lock = new ReentrantLock();

              public void increment() {
                 lock.lock();
                 try {
                    count++;
                 }finally {
                   lock.unlock();
                 }
              }
             * More flexible than synchronized.

        - Thread communication:
           * wait():
             Pauses a thread until another thread calls notify() or notifyAll() on the same object.

           * notify(): Wakes up one waiting thread.
           * notifyAll(): Wakes up all waiting threads.

           synchronized(this) {
              wait();  // waits for notification
           }
           synchronized(this) {
              notify(); // Notifies one waiting thread
           }

        - Thread pools:
            Creating threads manually is fine for small tasks, but for efficiency, use a thread pool via the ExecutorService
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;

            ExecutorService executor = Executors.newFixedThreadPool(2);
            executor.submit(() -> sout("Task 1"));
            executor.submit(() -> sout("Task 2"));

            * Reuses threads, reducing overhead.

        - Common Issues:
             1. Deadlock: Two or more threads waiting for each other to release resources, causing a standstill.
                 solution: Avoid nested locks, use timeouts

             2. Thread Starvation: Low-priority threads never get CPU time.
                 solution: Adjust priorities or use fair scheduling.

             3. Livelock: Threads keep responding to each other but make no progress.
                 solution: Introduce randomness or back-off mechanisms.

        - Modern Concurrency:
           Java's java.util.concurrent package offers advanced tools:
              * ForkJoinPool: For recursive, divide-and-conquer tasks.
              * CompletableFuture: For asynchronous programming.
              * Concurrent Collections: Like ConcurrentHashMap, safe for multithreaded access.

       - Example: Producer-consumer problem: (Below code)
   */

import java.util.LinkedList;
import java.util.Queue;

public class Topic1 {
    public static void main(String[] args) {
        SharedBuffre buffer = new SharedBuffre();
        Thread producer = new Thread(() -> {
            for (int i=0;i<10;i++) {
                try {
                    buffer.produce(i);
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for(int i=0;i<10;i++) {
                try {
                    buffer.consume();
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();

    }
}

class SharedBuffre {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity = 5;

    public synchronized void produce(int item) throws InterruptedException {
        while(queue.size() == capacity) wait();
        queue.add(item);
        System.out.println("Produced: " + item);
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) wait();
        int item = queue.poll();
        System.out.println("Consumed: " + item);
        notify();
        return item;
    }
}
