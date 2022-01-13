import java.util.Scanner;
public class Doublearray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[4][];
		arr[0]=new int[3];
		arr[1]=new int[4];
		arr[2]=new int[2];
	    arr[3]=new int[3];
	System.out.println("Enter elements in matrix");
	for(int i=0;i<arr.length;i++)
	 {
		for(int j=0;j<=arr[i].length;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	 }
	for(int i=0;i<arr.length;i++)
	 {
		for(int j=0;j<=arr[i].length;j++)
		{
			System.out.println(arr[i][j]);
		}
	 }
		
  }	
          	
}
	



