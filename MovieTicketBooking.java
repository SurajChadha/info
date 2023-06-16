
import java.util.concurrent.Semaphore;

public class MovieTicketBooking {
static int availableSeats = 20; // Total number of seats in the theater
static Semaphore semaphore = new Semaphore(1); // Semaphore to control access to seats {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            new Thread(new Customer(i)).start();
        }
    }
    
    static class Customer implements Runnable {
        int customerId;
    
        public Customer(int customerId) {
            this.customerId = customerId;
        }
    
        @Override
        public void run() {
            try {
                // Acquire lock before checking available seats
                semaphore.acquire();
                if (availableSeats > 0) {
                    System.out.println("Customer " + customerId + " booked a seat.");
                    availableSeats--;
                } else {
                    System.out.println("Sorry, customer " + customerId + " no seats available.");
                }
                // Release lock
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
