package Abstract;

abstract class Ticket {
	int ticketId;
	double ticketPrice;
	String seatNo;




	int getTicketId() {
		return ticketId;
	}
	void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	double getTicketPrice() {
		return ticketPrice;
	}
	void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	String getSeatNo() {
		return seatNo;
	}
	void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}//getters and setters ends here
	
	Ticket(){
		this.ticketId=00;
		this.ticketPrice=00;
		this.seatNo="Null";
		
	}
	
	Ticket(int i,double p,String s){
		this.ticketId=i;
		this.ticketPrice=p;
		this.seatNo=s;
		
	}//constructors ends here
	
	abstract void book();
	
	public String toString() {
	 	return "ticketId is :"+this.ticketId+"/"+this.ticketPrice+"/"+this.seatNo;
}
}

class BusTicket extends Ticket{
	int busNo;

	int getBusNo() {
		return busNo;
	}

	void setBusNo(int busNo) {
		this.busNo = busNo;
	}//getters and setters ends here
	
	BusTicket(){
		super();
		busNo=00;
	}
	
	BusTicket(int ti,double p,String sn,int bn){
		super(ti,p,sn);
		busNo=bn;
	}
	
	public String toString() {
	 	return super.toString()+"busNo is :"+this.busNo;
}
	void book() {
		System.out.println("Bus Ticket booked bus no:"+this.busNo);
	}
	
}//class bus ends here

class TrainTicket extends Ticket{
	int trainNo;
	String coachNO;
	
	int getTrainNo() {
		return trainNo;
	}
	void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	String getCoachNO() {
		return coachNO;
	}
	void setCoachNO(String coachNO) {
		this.coachNO = coachNO;
	}//getters and setter ends here
	
	TrainTicket(){
		super();
		this.trainNo=00;
		this.coachNO="Null";
	}
	
	TrainTicket(int ti,double p,String sn,int bn,String cn){
		super(ti,p,sn);
		trainNo=bn;
		this.coachNO=cn;
	}//constructors ends here
	
	public String toString() {
	 	return super.toString()+ "trainNo is :"+this.trainNo+"/"+this.coachNO;
}
	void book() {
		System.out.println("Train Ticket booked bus no:"+this.trainNo+"coachNO:"+this.coachNO);
	}
	
}//class TrainTicket ends here

class FlightTicket extends Ticket{
	int gateNo;

	int getGateNo() {
		return gateNo;
	}

	void setGateNo(int gateNo) {
		this.gateNo = gateNo;
	}//getters and setters ends here
	

	FlightTicket(){
		super();
		this.gateNo=00;
		
	}
	
	FlightTicket(int ti,double p,String sn,int bn){
		super(ti,p,sn);
		gateNo=bn;
	}//constructors ends here
	
	public String toString() {
	 	return super.toString()+ "gateNo is :"+this.gateNo;
}
	void book() {
		System.out.println("gateNo:"+this.gateNo);
	}
	
}

class TestTicket{
	public static void main(String[] args) {
		Ticket b1= new BusTicket(101,2550.87,"36",123);
		b1.book();
		System.out.println(b1.toString());
		System.out.println("\n******************************************");
		
		
		b1= new TrainTicket(101,2550.87,"32",123,"S2");
		b1.book();
		System.out.println(b1.toString());
		System.out.println("\n******************************************");
		
		b1= new FlightTicket(101,2550.87,"GEN11",12);
		b1.book();
		System.out.println(b1.toString());
		System.out.println("\n******************************************");
		
		
	}
}

