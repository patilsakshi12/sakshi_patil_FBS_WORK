class BankAccount
{
  long acc_no;
  String holderName;
  double balance;
  String branch;
 
 /*void setAccNo(long acc)
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
 
long getAccNo()
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
}*/

}// class bank end here
class Test
{
  public static void main (String args[])
 {
   BankAccount b=new BankAccount();
  
//set the value
 b.setAccNo(1234567890);
 b.setHolderName("Sakshi patil");
 b.setBalance(15000);
 b.setBranch("Pune Main Branch");

//get the value
System.out.println(b.getAccNo());
System.out.println(b.getHolderName());
System.out.println(b.getBalance());
System.out.println(b.getBranch());

// display
b.display();



}


void setAccNo(long acc)
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
 
long getAccNo()
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


}