package lab3;
import java.util.*;

public class Vowels {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int c = 0;
        name = name.toLowerCase();  // optional, for case insensitivity

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                c++;
            }
        }
        System.out.println(c);
        sc.close();
    }
}
