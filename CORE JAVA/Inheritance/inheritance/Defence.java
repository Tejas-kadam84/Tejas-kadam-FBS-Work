package inheritance;



class Defence {
	    String NameOfHead;
	    int NoOfVehicle;
	    String LocationOfHeadQuartor;
	    String CountryName;
	    int NoOfBoss;
	    double Budgets;
	    int NoOfDepartment;
	    int NoOfMissionPerformed;
	    int ManPowerCount;
	    int NoOfProof;
	    
	    Defence(){
	    	     NameOfHead = "General Anil Chauhan";
	    	     NoOfVehicle = 5000;
	    	     LocationOfHeadQuartor = "New Delhi";
	    	     CountryName = "India";
	    	     NoOfBoss = 10;
	    	     Budgets = 3500000.50;
	    	     NoOfDepartment = 8;
	    	     NoOfMissionPerformed = 120;
	    	     ManPowerCount = 1450000;
	    	     NoOfProof = 75;
	    	}
		
	    Defence(String NameOfHead,int NoOfVehicle, String LocationOfHeadQuartor,String CountryName,int NoOfBoss,double Budgets,int NoOfDepartment,int NoOfMissionPerformed, int ManPowerCount,int NoOfProof){
			this.NameOfHead=NameOfHead;
			this.NoOfVehicle=NoOfVehicle;
			this.LocationOfHeadQuartor=LocationOfHeadQuartor;
			this.CountryName=CountryName;
			this.NoOfBoss=NoOfBoss;
			this.Budgets=Budgets;
			this.NoOfDepartment=NoOfDepartment;
			this.NoOfMissionPerformed=NoOfMissionPerformed;
			this.ManPowerCount=ManPowerCount;
			this.NoOfProof=NoOfProof;
		}
	    
	    
		public String getNameOfHead() {
			return NameOfHead;
		}
		public void setNameOfHead(String nameOfHead) {
			NameOfHead = nameOfHead;
		}
		public int getNoOfVehicle() {
			return NoOfVehicle;
		}
		public void setNoOfVehicle(int noOfVehicle) {
			NoOfVehicle = noOfVehicle;
		}
		public String getLocationOfHeadQuartor() {
			return LocationOfHeadQuartor;
		}
		public void setLocationOfHeadQuartor(String locationOfHeadQuartor) {
			LocationOfHeadQuartor = locationOfHeadQuartor;
		}
		public String getCountryName() {
			return CountryName;
		}
		public void setCountryName(String countryName) {
			CountryName = countryName;
		}
		public int getNoOfBoss() {
			return NoOfBoss;
		}
		public void setNoOfBoss(int noOfBoss) {
			NoOfBoss = noOfBoss;
		}
		public double getBudgets() {
			return Budgets;
		}
		public void setBudgets(double budgets) {
			Budgets = budgets;
		}
		public int getNoOfDepartment() {
			return NoOfDepartment;
		}
		public void setNoOfDepartment(int noOfDepartment) {
			NoOfDepartment = noOfDepartment;
		}
		public int getNoOfMissionPerformed() {
			return NoOfMissionPerformed;
		}
		public void setNoOfMissionPerformed(int noOfMissionPerformed) {
			NoOfMissionPerformed = noOfMissionPerformed;
		}
		public int getManPowerCount() {
			return ManPowerCount;
		}
		public void setManPowerCount(int manPowerCount) {
			ManPowerCount = manPowerCount;
		}
		public int getNoOfProof() {
			return NoOfProof;
		}
		public void setNoOfProof(int noOfProof) {
			NoOfProof = noOfProof;
		}
		
		
		void display() {
	        System.out.println("===== Defence Details =====");
	        System.out.println("Name of Head: " + NameOfHead);
	        System.out.println("Number of Vehicles: " + NoOfVehicle);
	        System.out.println("Location of Headquarters: " + LocationOfHeadQuartor);
	        System.out.println("Country Name: " + CountryName);
	        System.out.println("Number of Bosses: " + NoOfBoss);
	        System.out.println("Budget: " + Budgets);
	        System.out.println("Number of Departments: " + NoOfDepartment);
	        System.out.println("Number of Missions Performed: " + NoOfMissionPerformed);
	        System.out.println("Man Power Count: " + ManPowerCount);
	        System.out.println("Number of Proofs: " + NoOfProof);
	    }
		
}		
		
		class Army extends Defence{
			
			    int NoOfTank;
			    int NoOfGun;
			    int NoOfGrander;
			    int NoOfBatallian;

			
			
			    Army() {
				super();
				NoOfTank = 3500;
				NoOfGun = 12000;
				NoOfGrander = 50000;
				NoOfBatallian = 45;

				System.out.println("Army default constructor");
			}
			
			    Army(String NameOfHead,int NoOfVehicle, String LocationOfHeadQuartor,String CountryName,int NoOfBoss,double Budgets,int NoOfDepartment,int NoOfMissionPerformed, int ManPowerCount,int NoOfProof,int NoOfTank,int NoOfGun,int NoOfGrander,int NoOfBatallian) {
				super( NameOfHead, NoOfVehicle,  LocationOfHeadQuartor, CountryName, NoOfBoss, Budgets, NoOfDepartment, NoOfMissionPerformed,  ManPowerCount, NoOfProof);
				System.out.println("Army para constructor");
				 this.NoOfTank = NoOfTank;
				 this.NoOfGun = NoOfGun;
				 this.NoOfGrander = NoOfGrander;
				 this.NoOfBatallian = NoOfBatallian;
			}

				public int getNoOfTank() {
					return NoOfTank;
				}

				public void setNoOfTank(int noOfTank) {
					NoOfTank = noOfTank;
				}

				public int getNoOfGun() {
					return NoOfGun;
				}

				public void setNoOfGun(int noOfGun) {
					NoOfGun = noOfGun;
				}

				public int getNoOfGrander() {
					return NoOfGrander;
				}

				public void setNoOfGrander(int noOfGrander) {
					NoOfGrander = noOfGrander;
				}

				public int getNoOfBatallian() {
					return NoOfBatallian;
				}

				public void setNoOfBatallian(int noOfBatallian) {
					NoOfBatallian = noOfBatallian;
				}
			    
				void display() {
					super.display();
			        System.out.println("===== Army Details =====");
			        System.out.println("Number of Tanks: " + NoOfTank);
			        System.out.println("Number of Guns: " + NoOfGun);
			        System.out.println("Number of Grenades: " + NoOfGrander);
			        System.out.println("Number of Battalions: " + NoOfBatallian);
			    }
	}
		
		class Navy extends Defence{
			    int NoOfShip = 150;
			    int NoOfSubmariens = 20;
			    int NoOfTorpedes = 500;


		
		
		    Navy() {
			super();
			NoOfShip = 150;
		    NoOfSubmariens = 20;
		    NoOfTorpedes = 500;

			System.out.println("Navy default constructor");
		}
		
		    Navy(String NameOfHead,int NoOfVehicle, String LocationOfHeadQuartor,String CountryName,int NoOfBoss,double Budgets,int NoOfDepartment,int NoOfMissionPerformed, int ManPowerCount,int NoOfProof,int NoOfShip, int NoOfSubmariens,int NoOfTorpedes) {
			super( NameOfHead, NoOfVehicle,  LocationOfHeadQuartor, CountryName, NoOfBoss, Budgets, NoOfDepartment, NoOfMissionPerformed,  ManPowerCount, NoOfProof);
			System.out.println("Navy para constructor");
			 this.NoOfShip = NoOfShip;
			 this.NoOfSubmariens = NoOfSubmariens;
			 this.NoOfTorpedes = NoOfTorpedes;
		}

			public int getNoOfShip() {
				return NoOfShip;
			}

			public void setNoOfShip(int noOfShip) {
				NoOfShip = noOfShip;
			}

			public int getNoOfSubmariens() {
				return NoOfSubmariens;
			}

			public void setNoOfSubmariens(int noOfSubmariens) {
				NoOfSubmariens = noOfSubmariens;
			}

			public int getNoOfTorpedes() {
				return NoOfTorpedes;
			}

			public void setNoOfTorpedes(int noOfTorpedes) {
				NoOfTorpedes = noOfTorpedes;
			}
		    
			void display() {
				super.display();
		        System.out.println("===== Navy Details =====");
		        System.out.println("Number of Ships: " + NoOfShip);
		        System.out.println("Number of Submarines: " + NoOfSubmariens);
		        System.out.println("Number of Torpedoes: " + NoOfTorpedes);
		    }
			
		}
		class AirForce  extends Defence{
			    int NoOfMissiles = 800;
			    int Aircraft = 300;
			    int NoOfSquadron = 15;



	
	
	    AirForce () {
		super();
		 NoOfMissiles = 800;
	     Aircraft = 300;
	     NoOfSquadron = 15;

		System.out.println("AirForce  default constructor");
	}
	
		AirForce (String NameOfHead,int NoOfVehicle, String LocationOfHeadQuartor,String CountryName,int NoOfBoss,double Budgets,int NoOfDepartment,int NoOfMissionPerformed, int ManPowerCount,int NoOfProof,int NoOfMissiles,int Aircraft,int NoOfSquadron) {
		super( NameOfHead, NoOfVehicle,  LocationOfHeadQuartor, CountryName, NoOfBoss, Budgets, NoOfDepartment, NoOfMissionPerformed,  ManPowerCount, NoOfProof);
		System.out.println("AirForce  para constructor");
		 this.NoOfMissiles = NoOfMissiles;
		 this.Aircraft = Aircraft;
		 this.NoOfSquadron = NoOfSquadron;
	}

		public int getNoOfMissiles() {
			return NoOfMissiles;
		}

		public void setNoOfMissiles(int noOfMissiles) {
			NoOfMissiles = noOfMissiles;
		}

		public int getAircraft() {
			return Aircraft;
		}

		public void setAircraft(int aircraft) {
			Aircraft = aircraft;
		}

		public int getNoOfSquadron() {
			return NoOfSquadron;
		}

		public void setNoOfSquadron(int noOfSquadron) {
			NoOfSquadron = noOfSquadron;
		}
		
		
		void display() {
			super.display();
	        System.out.println("===== Air Force Details =====");
	        System.out.println("Number of Missiles: " + NoOfMissiles);
	        System.out.println("Number of Aircraft: " + Aircraft);
	        System.out.println("Number of Squadrons: " + NoOfSquadron);
	    }
}
		
class TestDefence{
			public static void main(String[] args) {
				Army a1 = new Army("General Manoj Pande", 5000, "New Delhi", "India",12, 4500000.85, 10, 180, 1300000, 60,3500, 12000, 50000, 45);
				a1.display();
				
				
				Navy n1 = new Navy("Admiral R. Hari Kumar", 1200, "New Delhi", "India",8, 2500000.75, 5, 75, 75000, 30, 150, 20, 500);
				n1.display();
				
				AirForce b1 = new AirForce("Air Chief Marshal Vivek Ram Chaudhari", 900, "New Delhi", "India",7, 3200000.50, 6, 95, 140000, 25, 800, 300, 15);
				b1.display();
			}
		}