class Person{
	String name;
	int age;
	
	Person() {
		System.out.println("default Person constructor");
		this.name="None";
		this.age=0;
	}

	Person(String name, int age) {
		System.out.println("Para Person constructor");
		this.name = name;
		this.age = age;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}
	void display()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
	}
}//class person end here

class Teacher extends Person
{
	String subject;
	
	 Teacher() {
		 System.out.println("default Teacher constructor");
		this.subject="not";
	}

	Teacher(String name,int age,String subject) {
		super(name,age);
		System.out.println("Para Teacher constructor");
		this.subject = subject;
	}

	String getSubject() {
		return subject;
	}

	void setSubject(String subject) {
		this.subject = subject;
	}
	 
	 void show()
	 {
		 super.display();
		 System.out.println("Subject: "+this.subject);
	 }
	
}//class Teacher end here

class Student1 extends Person{
	int rollNo;
	double marks;
	
	Student1() {
		System.out.println("default Student constructor");
	   this.rollNo=0;
	   this.marks=0;
	}

	Student1(String name,int age,int rollNo, double marks) {
		super( name, age);
		System.out.println("Para Student constructor");
		this.rollNo = rollNo;
		this.marks = marks;
	}

	int getRollNo() {
		return rollNo;
	}

	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	double getMarks() {
		return marks;
	}

	void setMarks(double marks) {
		this.marks = marks;
	}
	
	void display()
	{
		super.display();
		System.out.println("RollNo: "+this.rollNo);
		System.out.println("Marks: "+this.marks);
	}
}// class student end here
class TestPerson {

	public static void main(String[] args) {
	Person p1=new Person();
	p1.display();
	System.out.println();
	
	Person p2=new Person("Sakshi",23);
	p2.display();
	System.out.println();
	
	Teacher t1=new Teacher();
	t1.show();
	System.out.println();
	
	Teacher t2=new Teacher("Sneha",22,"Java");
	t2.show();
	System.out.println();
	
	Student1 s=new Student1();
	s.display();
	System.out.println();
	
	
	Student1 s1=new Student1("Pooja",24,101,88);
	s1.display();
	System.out.println();
	
	

	}

}
