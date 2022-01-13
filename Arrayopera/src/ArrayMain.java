import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=null;
		int ch=0,s;
		Arrayinfo a=new Arrayinfo();
		do {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("\n1-create array\n2-display array\n3-search");
			ch=sc.nextInt();
			if(ch==1)
			{   
				
				int n;
				System.out.println("ENter number of elements that you WANT TO ADD IN AN ARRAY:\n");
			    n=sc.nextInt();	
			    arr=a.create(arr,n);
			}
			
			else if(ch==2)
			{
				a.display(arr);
			}
			else if(ch==3)
			{
				System.out.println("Eneter element that you want to insert:\n");
				s=sc.nextInt();
				int i=a.search(arr,s);
				System.out.println("%d\n"+i);
			}
			System.out.println("Do you want to continue press 1:\n");
			ch=sc.nextInt();
		}while(ch==1);
		System.out.println("---Thank you---");
	}
	}


