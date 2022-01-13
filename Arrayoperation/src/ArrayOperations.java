import java.util.Scanner;
public class ArrayOperations {
   Scanner sc=new Scanner(System.in);
   int i = 0;
   public int[] createarray(int arr1[],int n)
	{
		
	   // int i;
	    
	    //System.out.println("Enter elements in array:");
	    //for(i=0;i<n;i++)
	    //{
	    	//arr1[i]=sc.nextInt();
		//}
	    //return arr1;
	   arr1=new int[20];
	   System.out.println("Enter elements in array:");
	   for(i=0;i<n;i++)
	   {
	    	arr1[i]=sc.nextInt();
	   }
	   
	   return arr1;
	   
	}
	public void displayarray(int arr1[],int n) 
	{
		System.out.println("Elements in array are:\n");
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println("Elements in array are:"+arr1[i]);
	    }
	}
	public boolean search(int arr1[],int n,int ele)
	{
		boolean b=false;
		for(int i=0;i<n;i++)
		{
			if(arr1[i]==ele)
			{
				b=true;
				break;
			}
		}
		return b;
	}
	public void reverse(int arr1[],int n)
	{
		int i=0;	
		for(i=n-1;i>=0;i--)
		{
			System.out.print(arr1[i]+"\t\n");
		}
	}
	public void insertion(int arr1[],int n,int newele,int pos) 
	{
		for(i=n-1;i>=pos-1;i--)
		{
			arr1[i+1]=arr1[i];
		}
		arr1[pos-1]=newele;
		System.out.println("Elements gets Inserted Succesfully");
	}
	public int deletion(int arr1[],int n,int loc)
	{
		int temp=arr1[loc-1];
		for(i=loc-1;i<n;i++)
		{
			arr1[i]=arr1[i+1];
		}
		n--;
		return n;
	}
}
