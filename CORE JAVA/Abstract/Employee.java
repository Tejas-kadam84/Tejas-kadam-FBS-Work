package Abstract;



abstract class Employee
	{
		int Id;
		String Name;
		double Salary;
		static int count=0;
		
		
		Employee(){
			Id=100;
			Name="Shubham" ;
			Salary=10000;
			count++;
		}
		
		Employee(int Id,String Name,double Salary){
			this.Id=Id;
			this.Name=Name;
			this.Salary=Salary;
			count++;
		}
		
		
		
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public double getSalary() {
			return Salary;
		}
		public void setSalary(double salary) {
			Salary = salary;
		}
		public static int getCount() {
			return count;
		}
		public static void setCount(int count) {
			Employee.count = count;
		}
		
		abstract double calsal();
			
		
		public String toString() {
			 	return "id is :"+this.Id+"/"+this.Name+"/"+this.Salary;
		}
		
	}

	class SalesManager extends Employee{
		
		double Incentive;
		int Target;
		
		
			SalesManager() {
			super();
			Incentive =500;
			Target=10;
			System.out.println("SalesManager default constructor");
		}
		
		SalesManager(int Id,String Name,double Salary,double Incentive,int Target) {
			super(Id,Name,Salary);// Step 3 b
			System.out.println("SalesManager para constructor");
			this.Incentive =Incentive;
			this.Target=Target;
		}
		


		public double getIncentive() {
			return Incentive;
		}

		public void setIncentive(double incentive) {
			Incentive = incentive;
		}

		public int getTarget() {
			return Target;
		}

		public void setTarget(int target) {
			Target = target;
		}
		
		double calsal() {
			return Salary+Incentive;
		}
		
		public String toString() {
		 	return "Incentive is :"+this.Incentive+"/"+this.Target;
	}
	
	}


		class HR extends Employee{
			double Commission;
			
			HR() {
				super();// step 3 a
				Commission =500;
				System.out.println("HR default constructor");
			}
			
			HR(int Id,String Name,double Salary,double Commission) {
				super(Id,Name,Salary);// Step 3 b
				System.out.println("HR para constructor");
				this.Commission =Commission;
			}
			

			public double getCommission() {
				return Commission;
			}

			public void setCommission(double commission) {
				Commission = commission;
			}

			double calsal() {
				return Salary+Commission;
			}			
			
			public String toString() {
			 	return "Commission is :"+this.Commission;
		}
	}
		
		class Admin extends Employee{
			double Allowance;
			

			
			Admin() {
				super();// step 3 a
				Allowance =300;
				System.out.println("Admin default constructor");
			}
			
			Admin(int Id,String Name,double Salary,double Allowance) {
				super(Id,Name,Salary);// Step 3 b
				System.out.println("Admin para constructor");
				this.Allowance =Allowance;
			}
		

			public double getAllowance() {
				return Allowance;
			}

			public void setAllowance(double allowance) {
				Allowance = allowance;
			}
			
			double calsal() {
				return Salary+Allowance;
			}


			public String toString() {
			 	return "Allowance is :"+this.Allowance;
		}
		}

	class TestEmployee{
		public static void main(String[] args)
		{ 
			Employee e1;
			
			e1 = new SalesManager(101,"Om",30000,500,10);
			System.out.println(e1.toString());
			System.out.println(e1.calsal());
			System.out.println("***********************************");
			
			e1 = new HR(101,"Om",60500,200);
			System.out.println(e1.toString());			
			System.out.println(e1.calsal());
			System.out.println("***********************************");

			e1 = new Admin(102,"Tejas",60000,500);
			System.out.println(e1.toString());
			System.out.println(e1.calsal());
			System.out.println("***********************************");
			
			
	
			
			
			
			System.out.println("\n--------COUNT--------");
			System.out.println(Employee.getCount());
		}
	}

