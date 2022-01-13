import java.util.Arrays;

public class Devloper extends Employee {
	private int bonuse;
    int i;
    Employee eobj[];
    
	public Devloper(int empId, String empName, int empSalary, int bonuse) {
		super(empId, empName, empSalary);
		this.bonuse = bonuse;
	}

	public int getBonuse() {
		return bonuse;
	}

	public void setBonuse(int bonuse) {
		this.bonuse = bonuse;
	}

	@Override
	public String toString() {
		return "Devloper [bonuse=" + bonuse + ", i=" + i + ", eobj=" + Arrays.toString(eobj) + ", getBonuse()="
				+ getBonuse() + ", getEmpId()=" + getEmpId() + ", getEmpName()=" + getEmpName() + ", getEmpSalary()="
				+ getEmpSalary() + "]";
	}

}