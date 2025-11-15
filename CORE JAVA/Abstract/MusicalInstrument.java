package Abstract;


abstract class MusicalInstrument {
    String name;
    String type;
    double price;

    MusicalInstrument() {
        name = "Unknown";
        type = "General";
        price = 0.0;
    }

    MusicalInstrument(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
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
    double getPrice() {
        return price;
    }
    void setPrice(double price) {
        this.price = price;
    }

	public String toString() {
	 	return "name is :"+this.name+"/"+this.type+"/"+this.price;
}


    abstract void playSound();
}

class Guitar extends MusicalInstrument {
    int numberOfStrings;

    Guitar() {
        super();
        numberOfStrings = 0;
    }

    Guitar(String name, String type, double price, int numberOfStrings) {
        super(name, type, price);
        this.numberOfStrings = numberOfStrings;
    }
    
    public int getNumberOfStrings() {
		return numberOfStrings;
	}

	public void setNumberOfStrings(int numberOfStrings) {
		this.numberOfStrings = numberOfStrings;
	}

	public String toString() {
	 	return  super.toString()+"numberOfStrings is :"+this.numberOfStrings;
}
	
    void playSound() {
        System.out.println(" Guitar is strumming...");
    }
}

class Piano extends MusicalInstrument {
    int numberOfKeys;

    Piano() {
        super();
        numberOfKeys = 0;
    }

    Piano(String name, String type, double price, int numberOfKeys) {
        super(name, type, price);
        this.numberOfKeys = numberOfKeys;
    }
    
    public int getNumberOfKeys() {
		return numberOfKeys;
	}

	public void setNumberOfKeys(int numberOfKeys) {
		this.numberOfKeys = numberOfKeys;
	}

	public String toString() {
	 	return  super.toString()+"numberOfKeys is :"+this.numberOfKeys;
}

    void playSound() {
        System.out.println("🎹 Piano is playing a melody...");
    }
}

class Flute extends MusicalInstrument {
    String material;

    Flute() {
        super();
        material = "Unknown";
    }

    Flute(String name, String type, double price, String material) {
        super(name, type, price);
        this.material = material;
    }

    public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String toString() {
	 	return super.toString()+"material is :"+this.material;
}

    void playSound() {
        System.out.println("🎶 Flute is producing a soothing tone...");
    }
}

class TestInstrument {
    public static void main(String[] args) {
        MusicalInstrument m1 = new Guitar("Yamaha F310", "String", 8500, 6);
        m1.playSound();
        System.out.println(m1.toString());
        System.out.println("***************************************************************");

        m1 = new Piano("Casio CTK-3500", "Keyboard", 12000, 61);
        m1.playSound();
        System.out.println(m1.toString());
        System.out.println("***************************************************************");

        m1 = new Flute("Bamboo Flute", "Wind", 800, "Bamboo");
        m1.playSound();
        System.out.println(m1.toString());
        System.out.println("***************************************************************");
    }
}
