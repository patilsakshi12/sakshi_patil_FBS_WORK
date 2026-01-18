class Bank{
	int accNo;
	String bankName;
	String branch;
	
	 Bank() {
		// TODO Auto-generated constructor stub
		 this.accNo=0;
		 this.bankName="None";
		 this.branch="Not given";
	}

	Bank(int accNo, String bankName, String branch) {
		super();
		this.accNo = accNo;
		this.bankName = bankName;
		this.branch = branch;
	}

	int getAccNo() {
		return accNo;
	}

	void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	String getBankName() {
		return bankName;
	}

	void setBankName(String bankName) {
		this.bankName = bankName;
	}

	String getBranch() {
		return branch;
	}

	void setBranch(String branch) {
		this.branch = branch;
	}
	 
	double rateOfInterest()
	{
		return 0;
	}
	
	void display()
	{
		System.out.println("AccNo: "+this.accNo);
		System.out.println("Bank: "+this.bankName);
		System.out.println("Branch "+this.branch);
	}
}// class bank end here

class SBI extends Bank
{
	int noofEmployee;
	String managerName;
	
     SBI() {
		this.noofEmployee=0;
		this.managerName="Unknow";
	}

	SBI(int accNo, String bankName, String branch,int noofEmployee, String managerName) {
		super( accNo,  bankName,  branch);
		this.noofEmployee = noofEmployee;
		this.managerName = managerName;
	}

	int getNoofEmployee() {
		return noofEmployee;
	}

	void setNoofEmployee(int noofEmployee) {
		this.noofEmployee = noofEmployee;
	}

	String getManagerName() {
		return managerName;
	}

	void setManagerName(String managerName) {
		this.managerName = managerName;
	}
     
	double rateOfInterest()
	{
		return 6.5;
	}
	
	
	void display()
	{
		super.display();
		System.out.println("NO of Employee: "+this.noofEmployee);
		System.out.println("Manager Naem: "+this.managerName);
	}
	
}// class SBI end here

class HDFC extends Bank{
	String headOffice;
	
	 HDFC() {
		this.headOffice="none";
	}

	HDFC(int accNo, String bankName, String branch,String headOffice) {
		super(accNo,  bankName,  branch);
		this.headOffice = headOffice;
	}

	String getHeadOffice() {
		return headOffice;
	}

	void setHeadOffice(String headOffice) {
		this.headOffice = headOffice;
	}
	 
	double rateOfInterest()
	{
		return 7.6;
	}
	
	void display()
	{
		super.display();
		System.out.println("Head Office: "+this.headOffice);
	}
	
}
class TestBank {

	public static void main(String[] args) {
		Bank b1=new Bank(1102,"state Bank","Pune");
		b1.display();
		System.out.println("Interest Rate: "+b1.rateOfInterest());
		System.out.println();
		
		b1=new SBI(3454,"SBI bank","Mumbai",5000,"Mr Sharma");
		b1.display();
		System.out.println("Interest Rate: "+b1.rateOfInterest());
		System.out.println();
		
		b1=new HDFC(4567,"HDFC Bank","Delhi","Bandra");
		b1.display();
		System.out.println("Interest Rate: "+b1.rateOfInterest());

	}

}
