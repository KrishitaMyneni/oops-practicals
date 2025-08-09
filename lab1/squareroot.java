package lab1;
import java.util.*;
public class squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			double root = Math.sqrt(i);
			System.out.println("Square root of "+i+" is "+root);
			
		}

	}

}
