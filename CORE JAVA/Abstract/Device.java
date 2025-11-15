package Abstract;


abstract class Device {
    String brand;
    String model;
    double price;

    Device() {
        brand = "Unknown";
        model = "No Model";
        price = 0.0;
    }

    Device(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
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
    double getPrice() {
        return price;
    }
    void setPrice(double price) {
        this.price = price;
    }

    abstract void operate();
    
	public String toString() {
	 	return  "brand is :"+this.brand+"/"+this.model+"/"+this.price;
}
}

class Mobile extends Device {
    int storage;

    Mobile() {
        super();
        storage = 0;
    }

    Mobile(String brand, String model, double price, int storage) {
        super(brand, model, price);
        this.storage = storage;
    }
    

    public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public String toString() {
	 	return  super.toString()+"storage is :"+this.storage;
}
    void operate() {
        System.out.println("📱 Mobile is making a call and browsing internet...");
    }
}

class Laptop extends Device {
    int ram;
    String processor;

    Laptop() {
        super();
        ram = 0;
        processor = "Unknown";
    }

    Laptop(String brand, String model, double price, int ram, String processor) {
        super(brand, model, price);
        this.ram = ram;
        this.processor = processor;
    }

    

    public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public String toString() {
	 	return  super.toString()+"ram is :"+this.ram+"/"+"processor is :"+this.processor;
}

	void operate() {
        System.out.println("💻 Laptop is running applications and compiling code...");
    }
}

class SmartWatch extends Device {
    boolean heartRateMonitor;

    SmartWatch() {
        super();
        heartRateMonitor = false;
    }

    SmartWatch(String brand, String model, double price, boolean heartRateMonitor) {
        super(brand, model, price);
        this.heartRateMonitor = heartRateMonitor;
    }
    
    

    public boolean isHeartRateMonitor() {
		return heartRateMonitor;
	}

	public void setHeartRateMonitor(boolean heartRateMonitor) {
		this.heartRateMonitor = heartRateMonitor;
	}

	public String toString() {
	 	return  super.toString()+"heartRateMonitor is :"+this.heartRateMonitor;
}

    void operate() {
        System.out.println("⌚ SmartWatch is tracking steps and monitoring heart rate...");
    }
}

class TestDevice {
    public static void main(String[] args) {
        Device d1 = new Mobile("Samsung", "Galaxy S23", 75000, 256);
        d1.operate();
        System.out.println(d1.toString());
        System.out.println("***************************************************************");

        d1 = new Laptop("HP", "Pavilion 15", 68000, 16, "Intel i7");
        d1.operate();
        System.out.println(d1.toString());
        System.out.println("***************************************************************");

        d1 = new SmartWatch("Apple", "Watch Series 9", 42000, true);
        d1.operate();
        System.out.println(d1.toString());
        System.out.println("***************************************************************");
    }
}
