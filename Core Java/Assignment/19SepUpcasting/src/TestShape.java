class Shape{
	double area;
	
	Shape() {
		this.area=0;
	}

	Shape(double area) {
		super();
		this.area = area;
	}

	double getArea() {
		return area;
	}

	void setArea(double area) {
		this.area = area;
	}
	
	void calculateArea()
	{
		 this.area=0;
	}
	void display()
	{
		System.out.println("Area: "+this.area);
	}
}// class shape end here

class Triangle extends Shape{
	double height;
	double base;
	
	 Triangle() {
		this.height=0;
		this.base=0;
	}

	Triangle(double height, double base) {
		
		this.height = height;
		this.base = base;
	}

	double getHeight() {
		return height;
	}

	void setHeight(double height) {
		this.height = height;
	}

	double getBase() {
		return base;
	}

	void setBase(double base) {
		this.base = base;
	}
	 
	void calculateArea()
	{
		 this.area=0.5*base*height;
		 System.out.println("Area of Triangle "+this.area);
	}
	
	void display()
	{
		System.out.println("Base: "+this.base);
		System.out.println("Height: "+this.height);
	}
	  
	
}//class Triangle end here

class Circle extends Shape{
	double radius;
	
	 Circle() {
		this.radius=0;
	}

	Circle(double radius) {
		
		this.radius = radius;
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}
	 
	void calculateArea()
	{
		 this.area=3.14 * radius;
		 System.out.println("Area of Circle: "+this.area);
	}
	void display()
	{
		System.out.println("Radius: "+this.radius);
	}
}//class Circle end here

class Rectangle extends Shape{
	double length;
	double width;
	
  Rectangle() {
	this.length=0;
	this.width=0;
}

Rectangle(double length, double width) {
	
	this.length = length;
	this.width = width;
}

double getLength() {
	return length;
}

void setLength(double length) {
	this.length = length;
}

double getWidth() {
	return width;
}

void setWidth(double width) {
	this.width = width;
}

void calculateArea()
{
	 this.area=getLength()*getWidth();
	 System.out.println("Area of Rectangle "+this.area);
}
void display()
{
	System.out.println("Length: "+this.length);
	System.out.println("Width: "+this.width);
}
  
}// class Rectangle end here
class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1;
		s1=new Shape(4);
		s1.display();
		s1.calculateArea();
		System.out.println();
		
		s1=new Triangle (5,3);
		s1.display();
		s1.calculateArea();
		System.out.println();
		
		s1=new Circle(5);
		s1.display();
		s1.calculateArea();
		System.out.println();
		
		s1=new Rectangle(8,4);
		s1.display();
		s1.calculateArea();
		
		

	}

}
