package student_new;


import java.util.Scanner;

class Code2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st side");
    int a = sc.nextInt();
    System.out.println("Enter 2nd side");
    int b = sc.nextInt();
    System.out.println("Enter 3rd side");
    int c = sc.nextInt();
    if (a < (b + c) && b < (a + c) && c < (a + b)) {
      if (a == b && a == c) {
        System.out.println("This is equilateral");
      } else if (a != b && a != c && b != c) {
        System.out.println("This is a scalene");
      } else {
        System.out.println("This is isosceles");
      }
    } else {
      System.out.println("Not a triangle");
    }
  }
}

