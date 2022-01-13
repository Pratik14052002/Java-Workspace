import java.util.Scanner;

public class CarAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int b;
		b=sc.nextInt();
		SportClassCar sobj1=new SportClassCar(b);
		
		sobj1.display();
		

	}

}
