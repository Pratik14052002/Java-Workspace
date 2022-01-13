import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner sc=new Scanner(System.in);
		int ch=0;
        int[] arr2=null;
        int n=0;
        int arr1[]=null;
    ArrayOperations a1=new ArrayOperations();
    do {
    	System.out.println("\n1-Create array\n2-Display array\n3-search element in array\n4-reverse array\n5-Insert Array ELement\n6-Delete Arary Element");
    	System.out.println("Enter your choice:");
    	ch=sc.nextInt();
    	
    	int flag=0;
    	switch(ch)
        {
        case 1:
        	
        	// System.out.println("How many elements do you want in array:");
             //n=sc.nextInt();
             //arr1=new int[n];
        	 //arr1=a1.createarray(arr1,n);
	         //flag+=1;
        	
        	System.out.println("How many elements do you want in array:");
        	n=sc.nextInt();
            arr1=a1.createarray(arr1,n);
	         flag++;
	    break;
	    
        case 2:
        	
        	if(flag!=0)//1!=0=t 1!=1=f 1==1=t 0==1=f
        	{//if(flag!=0)
        		System.out.println("create array");
        	}
        	else
        	{
        		a1.displayarray(arr1,n);
        		
        	}
	    break;
	    
        case 3:
        	
        	boolean b;
        	System.out.println("Enter element that you want to search:");
        	b=a1.search(arr1,n,sc.nextInt());
        	if(b)
        	{
        		System.out.println("Element found");
        	}
        	else
        	{
        		System.out.println("Element not found");
        	}
        	break;
        
    	case 4:
    		a1.reverse(arr1,n);
    		break;
    	
    	case 5:
    		System.out.println("Enter Number That you want to insert:");
    		int newele=sc.nextInt();
    		System.out.println("Enter postion where you want to Insert new Element:");
    		int pos=sc.nextInt();
    		a1.insertion(arr1,n,newele,pos);
    		break;
    	case 6:

    		System.out.println("Enter postion where you want to Delete Element:");
    		int loc=sc.nextInt();
    		n=a1.deletion(arr1,n,loc);
    		break;
        }
    	System.out.println("do you want to continue press 1:");
    	ch=sc.nextInt();
    }while(ch==1);
    System.out.println("----Thank you----");
    return;
	}
}
