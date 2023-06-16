package student_new;

import java.util.*;

class Greater {
  public static void main(String[] args) {
    Scanner st = new Scanner(System.in);
    System.out.println("Enter first number");
    int num1 = st.nextInt();
    System.out.println("Enter second number");
    int num2 = st.nextInt();
    System.out.println("Enter third number");
    int num3 = st.nextInt();
    int max = num1;
    if (num2 > max) {
      max = num2;
    }
    if (num3 > max) {
      max = num3;
    }
    System.out.println("The greatest number is " + max);
  }
}

