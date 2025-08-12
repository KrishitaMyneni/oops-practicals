package lab3;
import java.util.Scanner;

public class palindromesb {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();

        if (input.equals(reversed))
            System.out.println("Yes, it is a palindrome");
        else
            System.out.println("No, it is not a palindrome");
    }
}
