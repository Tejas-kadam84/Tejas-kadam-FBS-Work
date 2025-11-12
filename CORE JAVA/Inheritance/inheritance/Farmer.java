package inheritance;


class Farmer {
    int farmerId;            
    String farmerName;       
    double landArea;         
    String city;            
    double annualIncome;     
    int noOfEquipment;       
    double insuranceAmt;     

   
    Farmer() {
        this.farmerId = 0;
        this.farmerName = "Unknown";
        this.landArea = 0.0;
        this.city = "Not Specified";
        this.annualIncome = 0.0;
        this.noOfEquipment = 0;
        this.insuranceAmt = 0.0;
    }

    
    Farmer(int farmerId, String farmerName, double landArea, String city,double annualIncome, int noOfEquipment, double insuranceAmt) {
        this.farmerId = farmerId;
        this.farmerName = farmerName;
        this.landArea = landArea;
        this.city = city;
        this.annualIncome = annualIncome;
        this.noOfEquipment = noOfEquipment;
        this.insuranceAmt = insuranceAmt;
    }
    
    

    
    public int getFarmerId() {
		return farmerId;
	}


	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}


	public String getFarmerName() {
		return farmerName;
	}


	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}


	public double getLandArea() {
		return landArea;
	}


	public void setLandArea(double landArea) {
		this.landArea = landArea;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public double getAnnualIncome() {
		return annualIncome;
	}


	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}


	public int getNoOfEquipment() {
		return noOfEquipment;
	}


	public void setNoOfEquipment(int noOfEquipment) {
		this.noOfEquipment = noOfEquipment;
	}


	public double getInsuranceAmt() {
		return insuranceAmt;
	}


	public void setInsuranceAmt(double insuranceAmt) {
		this.insuranceAmt = insuranceAmt;
	}


	void display() {
        System.out.println("Farmer ID: " + farmerId);
        System.out.println("Farmer Name: " + farmerName);
        System.out.println("Land Area: " + landArea + " acres");
        System.out.println("City: " + city);
        System.out.println("Annual Income: ₹" + annualIncome);
        System.out.println("Number of Equipment: " + noOfEquipment);
        System.out.println("Insurance Amount: ₹" + insuranceAmt);
    }

}
	class DairyFarmer extends Farmer {
    int noOfCattles;           
    double milkProducedPerDay; 
    String dairyLicenseNo;    

    
    DairyFarmer() {
        this.noOfCattles = 0;
        this.milkProducedPerDay = 0.0;
        this.dairyLicenseNo = "Not Assigned";
    }

    DairyFarmer(int farmerId, String farmerName, double landArea, String city,double annualIncome, int noOfEquipment, double insuranceAmt,int noOfCattles, double milkProducedPerDay, String dairyLicenseNo) {
    	super(farmerId,farmerName,landArea,city,annualIncome,noOfEquipment,insuranceAmt);
        this.noOfCattles = noOfCattles;
        this.milkProducedPerDay = milkProducedPerDay;
        this.dairyLicenseNo = dairyLicenseNo;
    }
    

    public int getNoOfCattles() {
		return noOfCattles;
	}

	public void setNoOfCattles(int noOfCattles) {
		this.noOfCattles = noOfCattles;
	}

	public double getMilkProducedPerDay() {
		return milkProducedPerDay;
	}

	public void setMilkProducedPerDay(double milkProducedPerDay) {
		this.milkProducedPerDay = milkProducedPerDay;
	}

	public String getDairyLicenseNo() {
		return dairyLicenseNo;
	}

	public void setDairyLicenseNo(String dairyLicenseNo) {
		this.dairyLicenseNo = dairyLicenseNo;
	}

	void display() {
		System.out.println("\n---------------DAIRY FARMER----------------");
    	super.display();
        System.out.println("Number of Cattles: " + noOfCattles);
        System.out.println("Milk Produced Per Day: " + milkProducedPerDay + " liters");
        System.out.println("Dairy License Number: " + dairyLicenseNo);
    }

 
}
class PoultryFarmer extends Farmer {
	    int noOfChickens;        
	    int noOfHens;            
	    int noOfSheds;          
	    int eggsProducedPerDay;  
	    int shedCapacity;              

	   
	    PoultryFarmer() {
	        this.noOfChickens = 0;
	        this.noOfHens = 0;
	        this.noOfSheds = 0;
	        this.eggsProducedPerDay = 0;
	        this.shedCapacity = 0;
	    }

	    PoultryFarmer(int farmerId, String farmerName, double landArea, String city,double annualIncome, int noOfEquipment, double insuranceAmt,int noOfChickens,int noOfHens,int noOfSheds,int eggsProducedPerDay,int shedCapacity){
	    	super(farmerId,farmerName,landArea,city,annualIncome,noOfEquipment,insuranceAmt);
	        this.noOfChickens = noOfChickens;
	        this.noOfHens = noOfHens;
	        this.noOfSheds = noOfSheds;
	        this.eggsProducedPerDay = eggsProducedPerDay;
	        this.shedCapacity = shedCapacity;
	    }
	    

	    
	    public int getNoOfChickens() {
			return noOfChickens;
		}

		public void setNoOfChickens(int noOfChickens) {
			this.noOfChickens = noOfChickens;
		}

		public int getNoOfHens() {
			return noOfHens;
		}

		public void setNoOfHens(int noOfHens) {
			this.noOfHens = noOfHens;
		}

		public int getNoOfSheds() {
			return noOfSheds;
		}

		public void setNoOfSheds(int noOfSheds) {
			this.noOfSheds = noOfSheds;
		}

		public int getEggsProducedPerDay() {
			return eggsProducedPerDay;
		}

		public void setEggsProducedPerDay(int eggsProducedPerDay) {
			this.eggsProducedPerDay = eggsProducedPerDay;
		}

		public int getShedCapacity() {
			return shedCapacity;
		}

		public void setShedCapacity(int shedCapacity) {
			this.shedCapacity = shedCapacity;
		}

		public String getFarmerName() {
			return farmerName;
		}

		public void setFarmerName(String farmerName) {
			this.farmerName = farmerName;
		}

		void display() {
			System.out.println("\n---------------POULTRY FARMER----------------");
	    	super.display();
	        System.out.println("Poultry Farmer Name: " + farmerName);
	        System.out.println("Number of Chickens: " + noOfChickens);
	        System.out.println("Number of Hens: " + noOfHens);
	        System.out.println("Number of Sheds: " + noOfSheds);
	        System.out.println("Eggs Produced Per Day: " + eggsProducedPerDay);
	        System.out.println("Shed Capacity: " + shedCapacity);
	    }

	}
class OrganicFarmer extends Farmer{
		    int organicFarmId;        
		    String cropType;        
		    String fertilizerUsed;    

		    
		    OrganicFarmer() {
		        this.organicFarmId = 0;
		        this.cropType = "Not Specified";
		        this.fertilizerUsed = "No Fertilizer Used";
		    }

		    
		    OrganicFarmer(int farmerId, String farmerName, double landArea, String city,double annualIncome, int noOfEquipment, double insuranceAmt,int organicFarmId, String cropType, String fertilizerUsed) {
		    	super(farmerId,farmerName,landArea,city,annualIncome,noOfEquipment,insuranceAmt);
		        this.organicFarmId = organicFarmId;
		        this.cropType = cropType;
		        this.fertilizerUsed = fertilizerUsed;
		    }
		    

		  
		    public int getOrganicFarmId() {
				return organicFarmId;
			}


			public void setOrganicFarmId(int organicFarmId) {
				this.organicFarmId = organicFarmId;
			}


			public String getCropType() {
				return cropType;
			}


			public void setCropType(String cropType) {
				this.cropType = cropType;
			}


			public String getFertilizerUsed() {
				return fertilizerUsed;
			}


			public void setFertilizerUsed(String fertilizerUsed) {
				this.fertilizerUsed = fertilizerUsed;
			}


			void display() {
				 System.out.println("\n---------------ORGANIC FARMER----------------");
		    	super.display();
		        System.out.println("Organic Farm ID: " + organicFarmId);
		        System.out.println("Crop Type: " + cropType);
		        System.out.println("Fertilizer Used: " + fertilizerUsed);
		    }
		}
class TestFarmer{
	public static void main(String[] args) {
		DairyFarmer a1 = new DairyFarmer(301, "Suresh Pawar", 15.2, "Sangli", 900000.75,10, 200000.50, 25, 180.5, "DL-2025-7890");
		a1.display();
		
		
		PoultryFarmer n1 = new PoultryFarmer(201, "Mahesh Shinde", 10.5, "Kolhapur", 650000.75,6, 120000.50, 500, 300, 5, 1200, 150);
		n1.display();
		
		OrganicFarmer b1 = new OrganicFarmer(101, "Ramesh Patil", 12.5, "Nashik", 850000.50,8, 150000.00, 501, "Sugarcane", "Vermicompost and Biofertilizer");
		b1.display();
	}
}
