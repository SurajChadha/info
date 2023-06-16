public class MutexSemaphoreDemo {
        static int counter = 0;
        static Semaphore semaphore = new Semaphore(1); // Mutex semaphore with 1 permit
        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
                new Thread(new Incrementer()).start();
            }
        }
        
        static class Incrementer implements Runnable {
            @Override
            public void run() {
                try {
                    // Acquire lock before incrementing counter
                    semaphore.acquire();
                    counter++;
                    System.out.println("Counter value: " + counter);
                    // Release lock
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        
}
