package javalogic;

import java.util.Scanner;
public class Mainlogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\n1-Factor\n2-Factorial\n3-Prime\n4-Fibbonaci\n5-Reverse number\n6-Sum of Digit\n");
		int ch=0,n;
		Logic l=new Logic();
		do {
		
			
    	System.out.println("\n1-Factor\n2-Factorial\n3-Prime\n4-Fibbonaci\n5-Reverse number\n6-Sum of Digit\n");	
	    System.out.println("Enter your choice");
	    ch=sc.nextInt();
    	
		switch(ch)
	    {
	     case 1:  
	    	 System.out.println("Enter number for factor:");
	    	 n=sc.nextInt();
	    	 l.factor(n);
	   	     break;
	   	 
	         case 2:
	        	 
	    	 System.out.println("Enter number for factorial:");
	    	 n=sc.nextInt();
	    	 
	    	 
	    	 System.out.println("FActorial of number is:"+ l.factorail(n));
	    	 break;
	    }
    	System.out.println("Do you want to continue press 1:\n");	
		ch=sc.nextInt();
		}while(ch==1);
		System.out.println("Thank you\n");

	}

}
