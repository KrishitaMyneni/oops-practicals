package lab2;
import java.util.*;

public class Stringques2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first string: ");
            String s1 = sc.nextLine();

            System.out.print("Enter second string: ");
            String s2 = sc.nextLine();

            System.out.println("Using equals(): " + s1.equals(s2));
            System.out.println("Using == operator: " + (s1 == s2));

            sc.close();
        }


  }

