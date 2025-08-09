package lab1;
import java.util.*;
public class Alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch;
		ch = sc.next().charAt(0);
		if((ch >= 'a' && ch<= 'z') || (ch >= 'A' && ch<= 'Z'))
			System.out.println("Alphabet");
		else
			System.out.println("not an Alphabet");
		

	}

}
