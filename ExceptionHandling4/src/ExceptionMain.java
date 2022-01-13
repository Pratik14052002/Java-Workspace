import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //Scanneer sc=new Scanner (System.in);
     Scanner scanner = new Scanner(System.in);
     int age;
     System.out.println("ENter your age");
     age=scanner.nextInt();
     try {
    	 if(age<20)
    	 {
    		 throw new AgeException();
    	 }
    	 else {
    		 System.out.println("valid age "+age);
    	 }
		
	} catch (AgeException e) {
		System.out.println(e);
		// TODO: handle exception
	}            
     
     
    
    
    
	}

}
