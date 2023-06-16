// write a java program to print the number pattern for the term entered 1*2*3*4*17*18*19*20 pn next line 5*6*7*14*15*16 on next line 8*9*12*13 on next line 10*11

public class NumberPattern {
    public static void main(String[] args) {
    int n = 20;
    for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) {
    if (j == i || j == n - i + 1) {
    System.out.print(j + "*");
    } else {
    System.out.print(" ");
    }
    }
    System.out.println();
    }
    }
    }
    
    