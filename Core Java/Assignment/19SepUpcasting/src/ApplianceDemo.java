class Appliance
{
	String brand;
	int power;
	
	Appliance()
	{
		System.out.println("Default Appliance constructor");
		this.brand="none";
		this.power=0;
	}

	Appliance(String brand, int power) {
	
		System.out.println("Para Appliance constructor");

		this.brand = brand;
		this.power = power;
	}

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	int getPower() {
		return power;
	}

	void setPower(int power) {
		this.power = power;
	}
	
	void turnOn()
	{
		System.out.println("Appliance is turned on");
	}
	
	void display()
	{
		System.out.println("Brand: "+this.brand);
		System.out.println("Power: "+this.power);
	}
	
}// class Appliance end here

class Fan extends Appliance
{
	int speed;
	String type;
	
	Fan()
	{
		System.out.println("Default Fan constructor");
		this.speed=0;
		this.type="unknows";
	}

	Fan(String brand, int power,int speed, String type) {
		super( brand,  power);
		System.out.println("Para Fan constructor");
		this.speed = speed;
		this.type = type;
	}

	int getSpeed() {
		return speed;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	String getType() {
		return type;
	}

	void setType(String type) {
		this.type = type;
	}
	
	void turnOn()
	{
		System.out.println("Fan is turned on");
	}
	
	void display()
	{
		super.display();
		System.out.println("Speed: "+this.speed);
		System.out.println("Type: "+this.type);
	}
	
}//class Fan end here

class Light extends Appliance{
	int brightness;
	String color;
	
	Light()
	{
		System.out.println("Default light constructor");
		this.brightness=0;
		this.color="None";
	}

	Light(String brand, int power,int brightness, String color) {
		super( brand,  power);
		System.out.println("Para Light constructor");
		this.brightness = brightness;
		this.color = color;
	}

	int getBrightness() {
		return brightness;
	}

	void setBrightness(int brightness) {
		this.brightness = brightness;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}
	
	void turnOn()
	{
		System.out.println("Light is turned on");
	}
	
	void display()
	{
		super.display();
		System.out.println("Brightness: "+this.brightness);
		System.out.println("Color: "+this.color);
	}
}// class light end here




class ApplianceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Appliance a1=new Appliance();
		a1.display();
		a1.turnOn();
		System.out.println();
		
		
		a1=new Fan();
		System.out.println("-------Fan---------");
		a1.display();
		a1.turnOn();
		System.out.println();
		
		a1=new Fan("Bajaj",75,3,"Ceiling");
		System.out.println("-------Fan---------");
		a1.display();
		a1.turnOn();
		System.out.println();
	
		a1=new Light();
		System.out.println("---------Light---------");
		a1.display();
		a1.turnOn();
		System.out.println();
		
		a1=new Light("Philips",12,800,"White");
		System.out.println("---------Light---------");
		a1.display();
		a1.turnOn();
	}

}
