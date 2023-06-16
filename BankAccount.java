// public TASK: write a java program to implement private Interest class nested in BankAccout to calculate interest to be added to your balance having balance as mem of BankAccount class and method Authenticate for password if it match ram then calculate interest and show balance

// HINT: private inner class/outerclass Relationship 
public class BankAccount {
    private double balance;
    private String password;
    private Interest interest;

    public BankAccount(double balance, String password) {
        this.balance = balance;
        this.password = password;
        this.interest = new Interest();
    }

    public boolean authenticate(String password) {
        if (this.password.equals(password)) {
            double interest = this.interest.calculate();
            this.balance += interest;
            System.out.println("Interest added to balance. New balance: " + this.balance);
            return true;
        } else {
            System.out.println("Incorrect password");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    private class Interest {
        private double rate = 0.05;

        public double calculate() {
            return balance * rate;
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000, "password123");
        boolean authenticated = account.authenticate("password123");
        if (authenticated) {
            System.out.println("Balance: " + account.getBalance());
        }
    }
}
