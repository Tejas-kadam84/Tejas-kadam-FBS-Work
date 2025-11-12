package inheritance;


class Vehicle {
    String BrandName;
    String Model;
    double EngineCapacity;
    String FuelType;
    static int count=0;
    
    
    
    Vehicle(){
    	BrandName="Honda";
    	Model="Activa" ;
    	EngineCapacity=650;
    	FuelType="Petrol";
		count++;
	}
	
    Vehicle(String BrandName,String Model,double EngineCapacity,String FuelType){
		this.BrandName=BrandName;
		this.Model=Model;
		this.EngineCapacity=EngineCapacity;
		this.FuelType=FuelType;
		count++;
	}
    
    
	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public double getEngineCapacity() {
		return EngineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		EngineCapacity = engineCapacity;
	}

	public String getFuelType() {
		return FuelType;
	}

	public void setFuelType(String fuelType) {
		FuelType = fuelType;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Vehicle.count = count;
	}

	void display() {
		System.out.println("BRAND NAME:"+this.BrandName);
		System.out.println("MODEL:"+this.Model);
		System.out.println("ENGINE CAPACITY:"+this.EngineCapacity);
		System.out.println("FUEL CAPACITY:"+this.FuelType);

	}
}

class Car extends Vehicle{
	boolean Airbag;
	
	Car() {
		super();
		Airbag =true;
		System.out.println("Car default constructor");
	}
	
	Car(String BrandName,String Model,double EngineCapacity,String FuelType,boolean Airbag ) {
		super(BrandName,Model,EngineCapacity,FuelType);
		System.out.println("Car para constructor");
		this.Airbag =Airbag;
	}

	public boolean isAirbag() {
		return Airbag;
	}

	public void setAirbag(boolean airbag) {
		Airbag = airbag;
	}

	
	void display() {
		super.display();
		System.out.println("AIRBAG:"+this.Airbag);
	}
}
class Bus extends Vehicle{
		boolean EmergencyDoor;
	
		Bus() {
		super();
		EmergencyDoor = true;
		System.out.println("Bus default constructor");
		}
	
		Bus(String BrandName,String Model,double EngineCapacity,String FuelType,boolean EmergencyDoor) {
		super(BrandName,Model,EngineCapacity,FuelType);
		System.out.println("Bus para constructor");
		this.EmergencyDoor=EmergencyDoor;
		}

		public boolean isEmergencyDoor() {
			return EmergencyDoor;
		}

		public void setEmergencyDoor(boolean emergencyDoor) {
			EmergencyDoor = emergencyDoor;
		}
		
		void display() {
			super.display();
			System.out.println("EMERGENCY DOOR:"+this.EmergencyDoor);
		}
}
class Bike extends Vehicle{
	boolean Stand;

	Bike() {
	super();
	Stand = true;
	System.out.println("Bike default constructor");
	}

	Bike(String BrandName,String Model,double EngineCapacity,String FuelType,boolean Stand) {
	super(BrandName,Model,EngineCapacity,FuelType);
	System.out.println("Bike para constructor");
	this.Stand=Stand;
	}

	public boolean isStand() {
		return Stand;
	}

	public void setStand(boolean stand) {
		Stand = stand;
	}
	
	void display() {
		super.display();
		System.out.println("STAND:"+this.Stand);
	}	
}

class TestVehicle{
	public static void main(String[] args)
	{

		Car c1 = new Car("Tata","Nexon",1197,"Petrol",true);
		c1.display();
		
		Bus b1 = new Bus("Volvo","9x566l",8808,"Disel",false);
		b1.display();
		
		Bike a1 = new Bike("Bajaj","Pulser",220,"Petrol",false);
		a1.display();
		
		
		System.out.println("\n--------COUNT--------");
		System.out.println(Vehicle.getCount());
	}

}