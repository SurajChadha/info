
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThreadingExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(2); // Create a thread pool with 2 threads {
        // Create and submit a Callable task
        Future<Integer> future1 = executor.submit(new CallableTask());
        // Create and submit a Runnable task
        Future<?> future2 = executor.submit(new RunnableTask());

        // Wait for the tasks to complete
        System.out.println("Result of Callable task: " + future1.get());
        System.out.println("Result of Runnable task: " + future2.get());

        executor.shutdown();
    }

    static class CallableTask implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            // Simulate a long-running task
            Thread.sleep(2000);
            return 1234;
        }
    }

    static class RunnableTask implements Runnable {
        @Override
        public void run() {
            // Simulate a short-running task
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
