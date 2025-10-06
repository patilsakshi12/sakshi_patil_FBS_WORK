// Static keyword

class BankAccount
{  
    int accNo;
    String name;
    double balance;
   static double interestRate; //step1

   static{
           interestRate=9.3;  //step2
        }  
       
    //default constructor
    BankAccount()   //step 3 remove  interestRate for a constructor
    {
      this.accNo=12344556;
      this.name="Rashmi";
      this.balance=20000;
     System.out.println("This is a default constructor");
    }
     BankAccount(int accNo,String name,double balance)  //step 4 remove static var interestRate for a constructor
    {
      this.accNo=accNo;
      this.name=name;
      this.balance=balance;
      
   
      System.out.println("This is a parameterized constructor");
    }
    
    //setter
    void setAccNo(int accNo)
    {
       this.accNo=accNo;
    }
    void setName(String name)
    {
       this.name=name;
    }
    void setBalance(double b)
    {
       this.balance=b;
    }
   static void setInterestRate(double i)
    {
       interestRate=i;
       
      
       
   }
    // getter
    int getAccNo()
   {
      return this.accNo;
    }
   String getName()
  {
     return this.name;
   }
  double getBalance()
  {
    return this.balance;
  }
  double getInterestRate()
 {
  return this.interestRate;
 }

void display()
{
  System.out.println("Account no is: "+this.accNo);
   System.out.println("Account  Name is: "+this.name);
    System.out.println("Balance is: "+this.balance);
 System.out.println("InterestRate is: "+interestRate);
}

}//class BankAccount end here
class Test
{
   public static void main(String args[])
   {
    BankAccount b=new BankAccount();
    b.display();
    BankAccount b1=new BankAccount(101,"Sakshi",50000);
    b1.display();
    System.out.println("\n");
    BankAccount b2=new BankAccount(102,"Pooja",100000);
    b2.display();
     System.out.println("\n");
    BankAccount b3=new BankAccount(103,"sneha",1);
      b3.display();

    BankAccount.setInterestRate(4.7);   // setter call class name using static keyword
    b1.display();
    System.out.println("\n");

    b2.display();
 System.out.println("\n");
   b3.display();
      
    
    }
}
   