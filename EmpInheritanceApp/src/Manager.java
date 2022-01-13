
public class Manager extends Employee {
  private int bonus;

public Manager(int empId, String empNAme, int bonus) {
	super(empId, empNAme);
	this.bonus = bonus;
}

public int getBonus() {
	return bonus;
}

public void setBonus(int bonus) {
	this.bonus = bonus;
} 
  
}
