package welcome;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		eMployeeManager e=new eMployeeManager();
		Employee eobj=e.getdata();
		e.displaydata(eobj);
		
		eMployeeManager e3=new eMployeeManager();
		Account aobj=e3.data();
		e3.display(aobj);
		
	}

}
