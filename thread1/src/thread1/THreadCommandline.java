package thread1;

public class THreadCommandline {

	String arr[];
	int sum=0;
	public THreadCommandline(String[] arr) {
		this.arr = arr;
	}
	public void run() {
		display();
	}
	public void display() {
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
			sum=sum+i;
			
		}
		System.out.println("Sum is:"+sum);
	}
	
}
