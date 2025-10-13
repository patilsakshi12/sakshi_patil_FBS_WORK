package employee.model;


public class Admin extends Employee{
  double allowance;
  Admin() {
	
	this.allowance=0;
 }
 public Admin(int id,String name,double salary,double allowance) {
	super(id,name,salary);
	
	this.allowance = allowance;
 }
 double getAllowance() {
	return allowance;
 }
 void setAllowance(double allowance) {
	this.allowance = allowance;
 }

 public double calculateSalary()
  {
	  return this.getSalary()+this.allowance;
  }
 
 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nAllowance: "+this.allowance;
	}
}
