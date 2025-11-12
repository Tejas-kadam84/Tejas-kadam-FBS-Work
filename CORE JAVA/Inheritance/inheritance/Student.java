package inheritance;



class Student {
	int FbId;
	String Name;
	int Distance;
	static int count=0;
  
	Student(){
		FbId=100;
		Name="Tejas" ;
		Distance=10;
		count++;
	}
	
	Student(int fbId,String name,int distance){
		this.FbId=fbId;
		this.Name=name ;
		this.Distance=distance;
		count++;
	}
	public void setFbid(int fbId) {
		FbId = fbId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getDistance() {
		return Distance;
	}
	public void setDistance(int distance) {
		Distance = distance;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Student.count = count;
	}
	
	void display() {
		System.out.println("\n--------STUDENT--------");
		System.out.println("FIRSTBIT ID:"+this.FbId);
		System.out.println("NAME:"+this.Name);
		System.out.println("DISTANCE:"+this.Distance);
	}
}

class PlaceStudent extends Student{
	//step 2 remove state and behavior which is avilable in super class
	String CompanyName;
	String Designation;
	
	
	
	PlaceStudent() {
		super();// step 3 a
		CompanyName ="AGRO";
		Designation="CEO";
		System.out.println("PlaceStudent default constructor");
	}
	
	PlaceStudent(int fbId,String name,int distance,String companyname,String designation) {
		super(fbId,name,distance);// Step 3 b
		System.out.println("PlaceStudent para constructor");
		this.CompanyName ="AGRO";
		this.Designation="CEO";
	}

	public int getFbId() {
		return FbId;
	}

	public void setFbId(int fbId) {
		FbId = fbId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getDistance() {
		return Distance;
	}

	public void setDistance(int distance) {
		Distance = distance;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}
	
	void display() {

		System.out.println("\n--------PLACESTUDENT--------");
		System.out.println("FIRSTBIT ID:"+this.FbId);
		System.out.println("NAME:"+this.Name);
		System.out.println("DISTANCE:"+this.Distance);
		System.out.println("COMPANY NAME:"+this.CompanyName);
		System.out.println("DESIGNATION:"+this.Designation);
	}
}

class demoInheristance{
		public static void main(String[] args)
		{

			PlaceStudent ps1= new PlaceStudent(101,"Om",500,"BCCI","coach");
			ps1.display();

			System.out.println("\n--------COUNT--------");
			System.out.println(Student.getCount());
		}
}

