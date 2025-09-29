class BankAccount
{
  double acc_no;
  String holderName;
  double balance;
  String branch;
 
BankAccount()
{
  this.acc_no=34678674;
  this.holderName="Shubham";
  this.balance=78000;
  this.branch="Jalgaon Branch";
}

BankAccount(double a,String n,double b,String branch)
{
  this.acc_no=a;
  this.holderName=n;
  this.balance=b;
  this.branch=branch;
}
void setAccNo(double acc)
{
  this.acc_no=acc;
}
void setHolderName(String h)
{
  this.holderName=h;
}
void setBalance(double bal)
{
  this.balance=bal;
}
void setBranch(String branch)
{
  this.branch=branch;
}
 
double getAccNo()
{
  return this.acc_no;
}
String getHolderName()
{
  return this.holderName;
}
double getBalance()
{
 return this.balance;
}
String getBranch()
{
  return this.branch;
}

void display()
{
  System.out.println("Account no is:"+this.acc_no);
   System.out.println("Account Holder Name is:"+this.holderName);
    System.out.println("Account Balance is:"+this.balance);
 System.out.println(" Branch is :"+this.branch);
}

}// class bank end here
class Test
{
  public static void main (String args[])
 {
   BankAccount b=new BankAccount();  //default constructor call
  
//set the value
 b.setAccNo(12345678);
 b.setHolderName("Sakshi patil");
 b.setBalance(15000);
 b.setBranch("Pune Main Branch");

//get the value
System.out.println("Using Getter");
System.out.println(b.getAccNo());
System.out.println(b.getHolderName());
System.out.println(b.getBalance());
System.out.println(b.getBranch());

// display
System.out.println("\nUsing display() method:");
b.display();

BankAccount b1=new BankAccount(45789034,"pooja singh",45000,"Mumbai Branch"); 

System.out.println("\nSecond Employee (Using Parameterized Constructor):");
        b1.display();
}
}


