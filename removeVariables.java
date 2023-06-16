import java.util.Scanner;

public class removeVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String withoutVowels = input.replaceAll("[aeiouAEIOU]", "");
        System.out.println("String without vowels: " + withoutVowels);
    }
}
