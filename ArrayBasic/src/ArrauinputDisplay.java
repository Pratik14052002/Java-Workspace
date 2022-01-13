import java.util.Scanner;

public class ArrauinputDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		int arr[]=new int[6];
		int i;
		System.out.println("Enter array Elements:");
		for(i=0;i<=6;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements in array are:");
		for(i=0;i<=6;i++)
		{
			System.out.println("Array :\n"+arr[i]);
		}
	}

}
