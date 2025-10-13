package employee.model;


public class HR extends Employee {
	double commission;

	public HR() {
		// TODO Auto-generated constructor stub
		this.commission=0;
	}
	public HR(int id,String name,double salary,double commission) {
		super( id, name,salary);
		this.commission = commission;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	public double calculateSalary() {
		return this.getSalary()+ commission;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nCommission: "+this.commission;
	}
	
	
	

}
