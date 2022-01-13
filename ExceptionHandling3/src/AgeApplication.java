import java.util.Scanner;

public class AgeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch;
		int age = 0;
	    double balance=0;
	    int qty;
    
      do {
    	  System.out.println("\n1-Enter age\n2-Enter Balance\n3-Enter qty");
    	  System.out.println("Enter your choice");
    	  ch=sc.nextInt();
    	  switch(ch)
    	  {
    	  case 1:
    		  System.out.println("Enter your age");
  		          age=sc.nextInt();
  		        try {
  					if(age<18) {
  						throw new InvalidAgeExp(age);
  						//InvalidAgeExp aobj=new InvalidAgeExp(); 	
  					}
  					else
  					{
  					System.out.println("Valid data");
  					}
  				}catch(InvalidAgeExp e)
  				{
  					System.out.println(e);
  				}
    		  break;
    	  case 2:
    		  System.out.println("Enter your Balance:");
    			balance=sc.nextDouble();
    			try {
    				if(balance<1000) {
    					throw new InvalidBalanceExp(balance);
    				}
    				else
    				{
    				System.out.println("valid amount");
    				}
    			}catch(InvalidBalanceExp ex)
    			{
    				System.out.println(ex);
    			}
    		  break;
    	  case 3:
    		  System.out.println("ENter quantity:");
    		  qty=sc.nextInt();
    		  try {
    			  if(qty<5)
    			  {
    				  throw new Invalidqty(qty);
    			  }
    			  else
    			  {
    				  System.out.println("valiod qty");
    			  }
    		  }
    		  catch (Invalidqty eq) {
    			  System.out.println(eq);
				// TODO: handle exception
			}
    	  }
    	  System.out.println("Do you want to continue press 1:");
    	  
      }while(sc.nextInt()==1);
       
		
		
		
	System.out.println("Thank you");
	}

}
