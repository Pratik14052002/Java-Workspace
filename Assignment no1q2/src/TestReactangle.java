import java.util.Scanner;

public class TestReactangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values of length and breadth:");
		
		float rl=sc.nextFloat();
		float rb=sc.nextFloat();

		Rectangle robj=new Rectangle(rb,rl);
		robj.area();
	}
	

}
