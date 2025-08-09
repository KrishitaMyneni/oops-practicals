package lab1;
import java.util.*;
public class perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		int sum=0;
		num = sc.nextInt();
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==num) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not a Perfect Number");
		}

	}

}
