package lab1;
import java.util.*;
public class vowelorconsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch;
		ch = sc.next().charAt(0);
		if((ch >= 'a' && ch<= 'z') || (ch >= 'A' && ch<= 'Z')) {
			if(ch == 'A'|| ch =='a'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
				System.out.println("Vowel");
			}
			else {
				System.out.println("consonent");
			}
		}
		else
			System.out.println("Not an Alphabet!!");
		

	}

}
