class Instrument
{
	String name;
	String type;
	
	
	Instrument() {
		this.name="none";
		this.type="Not given";
	}


	Instrument(String name, String type) {
		this.name = name;
		this.type = type;
	}


	String getName() {
		return name;
	}


	void setName(String name) {
		this.name = name;
	}


	String getType() {
		return type;
	}


	void setType(String type) {
		this.type = type;
	}
	
	void play()
	{
		System.out.println("Instrument is playing");
	}
	
	void display()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Type: "+this.type);
	}
}// class Instrument end here

class Guitar extends Instrument{
	String brand;
	
	Guitar()
	{
		this.brand="none";
	}

	Guitar(String name, String type,String brand) {
		super( name, type);
		this.brand = brand;
	}

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}
	
	void play()
	{
		System.out.println("Guitar strums Melodiously");
	}
	
	void display()
	{
		super.display();
		System.out.println("Brand: "+this.brand);
	}
	
}// class Guitar end here

class Piano extends Instrument{
	int keys;
	String material;
	
   Piano() {
		this.keys=0;
		this.material="none";
	}

  Piano(String name, String type,int keys, String material) {
	super( name, type);
	this.keys = keys;
	this.material = material;
  }

 int getKeys() {
	return keys;
 }

 void setKeys(int keys) {
	this.keys = keys;
}

 String getMaterial() {
	return material;
}

 void setMaterial(String material) {
	this.material = material;
}
 
 void play()
 {
	 System.out.println("Piano plays ");
 }
  
 void display()
 {
	 super.display();
	 System.out.println("Keys: "+this.keys);
	 System.out.println("Material: "+this.material);
 }
   
   
}// class piano end here
class InstrumentDemo {

	public static void main(String[] args) {
		Instrument i1=new Instrument();
		i1.display();
		i1.play();
		System.out.println("");
		
		i1=new Guitar("Guitar","String","Yamaha");
		i1.display();
		i1.play();
		System.out.println();
		
		i1=new Piano("Piano","Keyboard",88,"Wood");
		i1.display();
		i1.play();

	}

}
