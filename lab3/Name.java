package lab3;
import java.util.Scanner;

public class Name {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.next();
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        sc.close();
    }
}
