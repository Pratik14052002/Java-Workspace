class Calculation{
	//here ... means array
	public static void sum(int ...x) {
     System.out.println("Length if given int is:"+x.length);
	int sum=0;
     for(int i:x)
		{
			sum=sum+i;
			
		}
     System.out.println("Sum of int is:"+sum);
	}
}
//public static void greater(int ...y) {
public class Vararga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Calculation.sum(10,20);
   Calculation.sum(10,20,30);
	}

}
