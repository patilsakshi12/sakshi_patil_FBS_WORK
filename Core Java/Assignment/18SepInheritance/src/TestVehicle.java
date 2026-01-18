class Vehicle{
	String brand;
	String colour;
	int Wheels;
	double weight;
	
	 Vehicle() {
		  System.out.println("Default vehicle constructor");
		this.brand="none";
		this.colour="Not assign";
		this.Wheels=0;
		this.weight=0;
		}

	Vehicle(String brand, String colour, int wheels, double weight) {
		  System.out.println("para Vehicle constructor");
		this.brand = brand;
		this.colour = colour;
		Wheels = wheels;
		this.weight = weight;
	}

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	String getColour() {
		return colour;
	}

	void setColour(String colour) {
		this.colour = colour;
	}

	int getWheels() {
		return Wheels;
	}

	void setWheels(int wheels) {
		Wheels = wheels;
	}

	double getWeight() {
		return weight;
	}

	void setWeight(double weight) {
		this.weight = weight;
	}
	 
	 void display() {
		 System.out.println("Brand: "+this.brand);
		 System.out.println("Colour: "+this.colour);
		 System.out.println("Wheels: "+getWheels());
		 System.out.println("Weight: "+this.weight);
	 }
}// class Vehicle end here

class Car extends Vehicle{
	int speed;
	int doors;
	String fuelType;
	
	 Car() {
		  System.out.println("Default Car constructor");
		this.speed=0;
		this.doors=0;
		this.fuelType="Not assigned";
	}

	 
	 
	Car(String brand, String colour, int wheels, double weight,int speed, int doors, String fuelType) {
		super(brand,colour,wheels,weight);
		System.out.println("Para Car constructor");
		this.speed = speed;
		this.doors = doors;
		this.fuelType = fuelType;
	}



	int getSpeed() {
		return speed;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	int getDoors() {
		return doors;
	}

	void setDoors(int doors) {
		this.doors = doors;
	}

	String getFuelType() {
		return fuelType;
	}

	void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	void show() {
		super.display();
		System.out.println("Spped: "+this.speed);
		System.out.println("Doors: "+this.doors);
		System.out.println("Fuel Type: "+this.fuelType);
	}
	 
}// class Car end here

class ElectricCar extends Car{
	
	int batteryCapacity;
	int charginigTime;
	
    ElectricCar() {
		this.batteryCapacity=0;
		this.charginigTime=0;
		
	}

	ElectricCar(String brand, String colour, int wheels, double weight,int speed, int doors, String fuelType,int batteryCapacity, int charginigTime) {
		super( brand,  colour, wheels,  weight, speed,  doors,  fuelType);
		this.batteryCapacity = batteryCapacity;
		this.charginigTime = charginigTime;
	}

	int getBatteryCapacity() {
		return batteryCapacity;
	}

	void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	int getCharginigTime() {
		return charginigTime;
	}

	void setCharginigTime(int charginigTime) {
		this.charginigTime = charginigTime;
	}
	
	void display() {
		super.show();
		System.out.println("BatterCapacity: "+this.batteryCapacity);
		System.out.println("ChargininfTime: "+this.charginigTime);
	}
	
    
}
class TestVehicle {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.display();
		System.out.println();
		
		Vehicle v1=new Vehicle("Tesala","Red",6,1800);
		v1.display();
		System.out.println();
		
		Car c=new Car();
		c.show();
		System.out.println();
		
		Car c1=new Car("Tesala","White",4,1400,250,4,"Electric");
		c1.show();
		System.out.println();
		ElectricCar e=new ElectricCar("Nissan", "Blue", 4, 1600, 180, 4, "Electric", 75, 2);
		e.display();

	}

}
