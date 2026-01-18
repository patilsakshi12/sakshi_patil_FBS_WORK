class Employee
{
  int id;
  String name;
  double salary;
 // default constructor
   Employee() {
        this.id = 110;
        this.name = "Pooja";
        this.salary = 15000;
     System.out.println("Default constructor");
    }
    // parameter
    Employee(int i,String n,double s) {
        this.id = i;
        this.name = n;
        this.salary = s;
     System.out.println("Parameter constructor");
    }
  void setId(int i)
  {
    this.id=i;
  }

  void setName(String str)
  {
    this.name=str;
  }
  
  void setSalary(double sal)
  { 
     salary=sal;
  }
  
  int getId()
  {
    return id;
  }
  String getName()
  {
    return name;
  }
  double getSalary()
  {

   return salary;
  }
 
  void display()
  {
    System.out.println("ID is:"+id);
    System.out.println("Name is:"+name);
    System.out.println("Salary is:"+salary);
}
}// class employee end here

class Test
{
  public static void main1(String args[])
  {
    //default constructor
     Employee e1=new Employee();
     // set value using setter
     e1.setId(101);
     e1.setName("Sakshi");
     e1.setSalary(20000);
     
    // get the value using getter
    System.out.println("Using Getters:");
    System.out.println(e1.getId());
    System.out.println(e1.getName());
    System.out.println(e1.getSalary());

   // Display using display() method
        System.out.println("\nUsing display() method:");
        e1.display();
       
        // Using Parameterized Constructor
        Employee e2 = new Employee(102, "Kalyani", 25000);

        System.out.println("\nSecond Employee (Using Parameterized Constructor):");
        e2.display();
       
      
}

public static void main(String args[])
{
    int arr[]=new int[5];
    int i;
    for(i=0;i<arr.length;i++)
     System.out.print(arr[i]+ " ");
   
   System.out.printf("\n");


   Employee[] brr=new Employee[5];  
    // array of reference which has null at all the array location
    for(i=0;i<brr.length;i++)
     System.out.print(brr[i]+ " "); // this code prints 5 times null

     /*  for(i=0;i<brr.length;i++)
       brr[i].display(); */   // this gives NullpointerException

    //what Should we do
    brr[0]=new Employee();
    brr[1]=new Employee(105,"Shubham",30000); // parameterised

    //and so on then
    for(i=0;i<brr.length;i++)
    brr[i].display(); 
  
}
      
}