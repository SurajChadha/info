package work9;

import java.util.Scanner;


class Bank {
    double balance;

    Bank(double ba) {
        System.out.println("ctor...");
        balance = ba;
    }

    public double getBalance() {
        System.out.println(balance);
        return balance;
    }

    public void Authenticate() {
        System.out.println("enter password: ");
        String pass = new Scanner(System.in).next();
        if (pass.equals("ram")) {
            Interest i = new Interest(5.4);
        } else
            System.out.println("not authorized");
    }

    private class Interest {
        double rate;

        public Interest(double d) {
            rate = d;
        }

        public void calcInterest() {
            double inter = balance * rate / 100;
            balance += inter;
        }

    }
}

public class BankAccount {
    public static void main(String[] args) {
        Bank o = new Bank(1000);
        System.out.println(o.getBalance());
        o.Authenticate();
        System.out.println(o.getBalance());
    }
}