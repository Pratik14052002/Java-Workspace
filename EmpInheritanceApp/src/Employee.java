
public class Employee {
   private int empId;
   private String empNAme;

  
   public Employee(int empId, String empNAme) {
	
	this.empId = empId;
	this.empNAme = empNAme;
}

public int getEmpId() {
	return empId;
   }
 
   public void setEmpId(int empId) {
	this.empId = empId;
   }

   public String getEmpNAme() {
	return empNAme;
  }

   public void setEmpNAme(String empNAme) {
	this.empNAme = empNAme;
  }
  

}
