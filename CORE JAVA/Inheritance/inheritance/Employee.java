package inheritance;


class Employee
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
	
	
	void display() {
		System.out.println("ID:"+this.Id);
		System.out.println("NAME:"+this.Name);
		System.out.println("SALARY:"+this.Salary);
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

	
	void display() {
		System.out.println("\n--------SALESMANAGER--------");
		super.display();
		System.out.println("INCENTIVE:"+this.Incentive);
		System.out.println("TARGET:"+this.Target);
		
	}
}
class AreaSalesManager extends Employee{
	String Area;
	
	AreaSalesManager() {
		super();
		Area="Not Given";
		System.out.println("AreaSalesManager default constructor");
	}
	
	AreaSalesManager(int Id,String Name,double Salary,String Area) {
		super(Id,Name,Salary);// Step 3 b
		System.out.println("AreaSalesManager para constructor");
		this.Area=Area;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}
	
	void display() {
		System.out.println("\n--------AREASALESMANAGER--------");
		super.display();
		System.out.println("AREA:"+this.Area);
		
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

		void display() {
			System.out.println("\n--------HR--------");
			super.display();
			System.out.println("COMMISSION:"+this.Commission);
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

		void display() {
			System.out.println("\n--------ADMIN--------");
			super.display();
			System.out.println("ALLOWANCE:"+this.Allowance);
		}
	}

class TestEmployee{
	public static void main(String[] args)
	{

		SalesManager s1 = new SalesManager(101,"Tejas",10000,500,10);
		s1.display();
		
		AreaSalesManager b1 = new AreaSalesManager(101,"Tejas",10000,"Nanded");
		b1.display();
		
		HR h1 = new HR(102,"Shubham",20000,500);
		h1.display();
		
		Admin a1 = new Admin(103,"Om",50000,250);
		a1.display();
		
		
		System.out.println("\n--------COUNT--------");
		System.out.println(Employee.getCount());
	}
}

