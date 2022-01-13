import java.lang.reflect.AccessibleObject;
import java.util.Arrays;

public class Manager extends Employee {
	private int noHr;
    int i;
	Employee eobj1[]=null;

	public Manager(int empId, String empName, int empSalary, int noHr) {
		super(empId, empName, empSalary);
		this.noHr = noHr;
	}

	public int getNoHr() {
		return noHr;
	}

	public void setNoHr(int noHr) {
		this.noHr = noHr;
	}

	@Override
	public String toString() {
		return "Manager [noHr=" + noHr + ", i=" + i + ", eobj1=" + Arrays.toString(eobj1) + ", getNoHr()=" + getNoHr()
				+ ", getEmpId()=" + getEmpId() + ", getEmpName()=" + getEmpName() + ", getEmpSalary()=" + getEmpSalary()
				+ "]";
	}

	

	//@Override
	//public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
	//}

	//@Override
	//public String toString() {
		//return "Manager [noHr=" + noHr + ", getNoHr()=" + getNoHr() + ", getEmpId()=" + getEmpId() + ", getEmpName()="
			//	+ getEmpName() + ", getEmpSalary()=" + getEmpSalary() + "]";
	//}

	

	
	

}
