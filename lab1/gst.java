package lab1;
import java.util.*;


public class gst {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total bill: ");
		float gstp,maintanancep,gst, maintanance, dis,bill, totalbill,billamount;
		bill = sc.nextFloat();
		gstp = sc.nextFloat();
		maintanancep = sc.nextFloat();
		gst = (gstp*bill)/100;
		maintanance = (maintanancep*bill)/100;	
		
		billamount = bill+gst+maintanance;
		if(billamount > 1000) {
			dis = (10*billamount)/100;
		}
		else {
			dis = (5*billamount)/100;
		}
		totalbill = billamount - dis;
		System.out.println("Bill: "+bill);
		System.out.println("gst: "+gst);
		System.out.println("maintanance: "+maintanance);
		System.out.println("discount: "+dis);
		System.out.println("Total Amount: "+totalbill);
		
		
		
		
		
		
		
		
		


	}

}
