import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
static int availablePermits = 5; // Total number of permits
static Semaphore semaphore = new Semaphore(availablePermits); // Semaphore with 5 permits
public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
        new Thread(new Task(i)).start();
    }
}

static class Task implements Runnable {
    int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        try {
            // Acquire permit
            semaphore.acquire();
            System.out.println("Task " + taskId + " has acquired a permit.");

            // Simulate work
            Thread.sleep(1000);

            // Release permit
            semaphore.release();
            System.out.println("Task " + taskId + " has released a permit.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


}
