class Account {
    int accNo;
    String name;

    Account() {
    	System.out.println("Default Account");
        this.accNo = 0;
        this.name = "not given";
    }

    Account(int accNo, String name) {
    	System.out.println("Para Account");
        this.accNo = accNo;
        this.name = name;
    }

    int getAccNo() {
        return accNo;
    }

    void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Account No: " + this.accNo);
        System.out.println("Name: " + this.name);
    }
}

class SavingAccount extends Account {
    double interestRate;

    SavingAccount() {
    	  System.out.println("Default Saving Account:");
        this.interestRate = 0;
    }

    SavingAccount(int accNo, String name, double interestRate) {
        super(accNo, name);
        System.out.println("Parameterized Saving Account:");
      
        this.interestRate = interestRate;
    }

    double getInterestRate() {
        return interestRate;
    }

    void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    void showSaving() {
        super.show();
        System.out.println("Interest Rate: " + this.interestRate);
    }
}//class Saving account end here

class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount() {

        System.out.println("Default Current Account:");
        this.overdraftLimit = 0;
    }

    CurrentAccount(int accNo, String name, double overdraftLimit) {
        super(accNo, name);
        System.out.println("Parameterized Current Account:");
        this.overdraftLimit = overdraftLimit;
    }

    double getOverdraftLimit() {
        return overdraftLimit;
    }

    void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    void showCurrent() {
        super.show();
        System.out.println("Overdraft Limit: " + this.overdraftLimit);
    }
}

public class TestAccount {
    public static void main(String[] args) {
        
       
        SavingAccount sa1 = new SavingAccount();
        sa1.showSaving();
        System.out.println();

     
      
        SavingAccount sa2 = new SavingAccount(101, "Sakshi", 4.5);
        sa2.showSaving();
        System.out.println();
      
       
        CurrentAccount ca1 = new CurrentAccount();
        ca1.showCurrent();
        System.out.println();
      
       
        CurrentAccount ca2 = new CurrentAccount(102, "Pooja", 10000);
        ca2.showCurrent();
    }
}
