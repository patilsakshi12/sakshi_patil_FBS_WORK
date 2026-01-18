class Device {
     String brand;
    double price;

   

  
    // Default Constructor
     Device() {
        System.out.println("Default Device Constructor");
        this.brand = "Unknown";
        this.price = 0.0;
       
    }

    // Parameterized Constructor
    Device(String brand, double price) {
        System.out.println("Parameterized Device Constructor");
        this.brand = brand;
        this.price = price;
     
    }

    // Getters
     String getBrand() {
        return brand;
    }

     double getPrice() {
        return price;
    }

   

    // Setters
     void setBrand(String brand) {
        this.brand = brand;
    }

     void setPrice(double price) {
        this.price = price;
    }

    // Display method
     void display() {
        System.out.println("Brand: " +this. brand);
        System.out.println("Price: " + this.price);
    }
}//class Device end here

class Smartphone extends Device {
     String os;
     int ram;

    // Default Constructor
     Smartphone() {
        super(); 
        System.out.println("Default Smartphone Constructor");
        this.os = "Unknown";
        this.ram = 0;
    }

    // Parameterized Constructor
     Smartphone(String brand, double price, String os, int ram) {
        super(brand, price); 
        System.out.println("Parameterized Smartphone Constructor");
        this.os = os;
        this.ram = ram;
    }

    // Getters
     String getOs() {
        return os;
    }

    int getRam() {
        return ram;
    }

    // Setters
     void setOs(String os) {
        this.os = os;
    }

    void setRam(int ram) {
        this.ram = ram;
    }

    
 
     void display() {
        super.display(); // Call Device display
        System.out.println("Operating System: " + os);
        System.out.println("RAM: " + ram + " GB");
    }
}


class TestDivce {

	public static void main(String[] args) {
		Device d1=new Device();
		d1.display();
		
		Device d2=new Device("Realme",15000);
		 Smartphone s1 = new Smartphone();
	        s1.display();
	        System.out.println();

	       
	        Smartphone s2 = new Smartphone("Samsung", 24999, "Android", 8);
	        s2.display();
	        System.out.println();

	}

}
