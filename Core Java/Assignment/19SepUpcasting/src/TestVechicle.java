class Vehicle{
	String brand;
	String model;
	
	 Vehicle() {
		this.brand="None";
		this.model="unkonwn";
	}

	Vehicle(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}
	 
	void brake()
	{
		System.out.println("Vechicle brake ");
	}
	
	void display()
	{
		System.out.println("Brand: "+this.brand);
		System.out.println("Model: "+this.model);
	}
}// class Vehicle end here

class Car extends Vehicle {
	int noOfDoors;
	String fuleType;
	
	 Car() {
		this.noOfDoors=0;
		this.fuleType="none";
	}

	Car(String brand, String model,int noOfDoors, String fuleType) {
		super( brand, model);
		this.noOfDoors = noOfDoors;
		this.fuleType = fuleType;
	}

	int getNoOfDoors() {
		return noOfDoors;
	}

	void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	String getFuleType() {
		return fuleType;
	}

	void setFuleType(String fuleType) {
		this.fuleType = fuleType;
	}
	 
	 void brake()
	 {
		 System.out.println("Car Brakes");
	 }
	 
	 void display() {
		 super.display();
		 System.out.println("No Of Doors: "+this.noOfDoors);
		 System.out.println("fule Type: "+this.fuleType);
	 }
	
}// class car  end here

class Bike extends Vehicle{
	int engineCapacity;
	
	 Bike() {
		this.engineCapacity=0;
	}

	Bike(String brand, String model,int engineCapacity) {
		super( brand, model);
		this.engineCapacity = engineCapacity;
	}

	int getEngineCapacity() {
		return engineCapacity;
	}

	void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	 
	void brake()
	{
		System.out.println("Bike Brakes");
	}
	void display()
	{
		super.display();
		System.out.println("Engine Capacity: "+this.engineCapacity);
	}
}
class TestVechicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1=new Vehicle();
		v1.display();
        v1.brake();
        System.out.println();
        
        v1=new Car("Toyota","camry",4,"Petrol");
        v1.display();
        v1.brake();
        System.out.println();
        
        v1=new Bike("Yamaha","R15",155);
        v1.display();
        v1.brake();
	}

}
