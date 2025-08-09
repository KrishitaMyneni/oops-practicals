package lab2;
import java.util.*;
public class stringques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the  original sentence : ");
		    String str1 = sc.nextLine();
		    String str2 = sc.nextLine();
		    int index,sub_str;
		    index = sc.nextInt();
		    
		    System.out.println("The character at "+index+" "+"is : "+str1.charAt(index));
		    System.out.println("The length of the string is : "+str1.length());
		    System.out.println("String in upper case is : "+str1.toUpperCase());
		    System.out.println("String in upper case is : "+str1.toLowerCase());
		    System.out.println("Enter the index to get substring : ");
		     sub_str = sc.nextInt();
		    System.out.println("Substring from the "+sub_str+" "+"is : "+str1.substring(sub_str));
		        System.out.println("Enetr the stirng to check : ");
		    System.out.println("Does the given strinig conatins "+ str2+" ? "+str1.contains(str2));
		    System.out.println("Enter chacacters to replace : ");
		    char ch1 =sc.next().charAt(0);
		    char ch2 =sc.next().charAt(0);
		    System.out.println("The replace string is : "+str1.replace(ch1,ch2));
		    
		    

		  }

		
	}


     