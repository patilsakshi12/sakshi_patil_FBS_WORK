package p1;

public class Student {
	int rollNo;
	String name;
	float marks;
	String gender;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Student(int rollNo, String name, float marks, String gender) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.gender = gender;
	}



	public int getRollNo() {
		return rollNo;
	}



	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public float getMarks() {
		return marks;
	}



	public void setMarks(float marks) {
		this.marks = marks;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	

}
