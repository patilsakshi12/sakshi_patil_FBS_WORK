package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MainAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      List<Student> allStudent=new ArrayList();
      allStudent.add(new Student(1,"Sakshi",95,"F"));
      allStudent.add(new Student(2,"Pooja",90,"F"));
      allStudent.add(new Student(3,"Rohan",80,"M"));
      allStudent.add(new Student(4,"Ram",85,"M"));
      
     // allStudent.stream().forEach(ref->System.out.println(ref.getName()));
      
      //Filtering
      //allStudent.stream().filter(merimazi-> merimazi.getMarks()>90).forEach(ref-> System.out.println(ref.getName()));
      
      //pipline
      double avgMarks=allStudent.stream().filter(ref->ref.getGender().equals("M")).mapToDouble(ref->ref.getMarks()).average().getAsDouble();
	
	System.out.println(avgMarks);}

}
