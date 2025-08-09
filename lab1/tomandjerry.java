package lab1;
import java.util.*;


public class tomandjerry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int tom, jerry;
		System.out.println("Enter tom and jerrys first picks: ");
		tom = sc.nextInt();
		jerry = sc.nextInt();
		tom = tom^jerry;
		jerry = tom^jerry;
		tom = tom^jerry;
		System.out.println("After swapping,");
		System.out.println("Tom: " +tom +" "+ "Jerry: " +jerry);
		
		

	}

}
