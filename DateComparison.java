
// TASK

// write a java program to take input doj and dor and show if the date is before or after and display.

// show the

// Hint: SDF

// comparison

// Date
// Here is an example of a Java program that takes input for a date of joining (DOJ) and a date of release (DOR) and compares them to determine if the DOR is before or after the DOJ:

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter date of joining (dd/MM/yyyy): ");
        String dojInput = sc.nextLine();

        System.out.print("Enter date of release (dd/MM/yyyy): ");
        String dorInput = sc.nextLine();

        try {
            Date doj = sdf.parse(dojInput);
            Date dor = sdf.parse(dorInput);

            if (dor.before(doj)) {
                System.out.println("Date of release is before date of joining.");
            } else if (dor.after(doj)) {
                System.out.println("Date of release is after date of joining.");
            } else {
                System.out.println("Date of release is the same as date of joining.");
            }
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter dates in the format dd/MM/yyyy.");
        }
    }
}
