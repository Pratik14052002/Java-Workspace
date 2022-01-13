import java.util.Scanner;
public class Arrayinfo {
	public int[] create(int arr[],int n)
	{   
		Scanner sc=new Scanner(System.in);
		int i;
	    arr=new int [n];
	    System.out.println("Elements in array are\n");
		for(i=0;i<arr.length;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		
		return arr;
		}

   public void display(int arr[])
	{
	  
	   for(int i=0;i<arr.length;i++)
	   {
		   System.out.println("Elements in array are as follows:"+arr[i]);
	   }
   }
   public int search(int arr[],int s)
   {
	   int i;
	   for(i=0;i<arr.length;i++)
	   {
		  if(arr[i]==s)
		  {
			  break;
		  }
			  
	   }
	   return i;
   }
}
