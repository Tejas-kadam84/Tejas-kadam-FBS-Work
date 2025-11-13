package Polymorphism;



class BankAccount
{
	int accountNumber;
	String accHoldername;
	double currentbalance;
	static double interestRate;
static
{
	interestRate=7.8;
}

void setaccountNumber(int a){ 
  this.accountNumber=a;
}

void setaccHoldername(String n){
  this.accHoldername=n;
}
void setcurrentbalance(double c){
 this.currentbalance=c;
}
static void setinterestRate(double i){
  interestRate=i;
}



int getaccountNumber(){
  return this.accountNumber;
}

String getaccHoldername(){ 
 return this.accHoldername;
}

double getcurrentbalance(){
  return this.currentbalance;
}
static double getinterestRate(){
 return interestRate;
}



BankAccount()
{
this.accountNumber=1001;
this.accHoldername="Tejas";
this.currentbalance=10000.00;
 //this.interestRate=500.00;
}


BankAccount(int accountNumber,String accHoldername,double currentbalance)
{
this.accountNumber=accountNumber;
this.accHoldername=accHoldername;
this.currentbalance=currentbalance;
//this.interestRate=i;
}

void display()
{

    System.out.println("AC NO : "+this.accountNumber);
    System.out.println("AC HOLDER NAME : "+this.accHoldername);
    System.out.println("CURRENT BALANCE : "+this.currentbalance);
    System.out.println("INTERST RATE : "+this.interestRate + "%");

}
}// BankAccount class ends here



class SavingAccount extends BankAccount{

	    double interestRate;
	    double minBalance;
	    boolean isATMCardIssued;
	    int withdrawalLimitPerMonth;


	    SavingAccount() {
	    	super();
	        interestRate = 4.5;
	        minBalance = 1000;
	        isATMCardIssued = true;
	        withdrawalLimitPerMonth = 5;
	    }

	    
	    SavingAccount(int accountNumber,String accHoldername,double currentbalance,double interestRate, double minBalance, boolean isATMCardIssued, int withdrawalLimitPerMonth) {
	    	super( accountNumber, accHoldername, currentbalance);
	        this.interestRate = interestRate;
	        this.minBalance = minBalance;
	        this.isATMCardIssued = isATMCardIssued;
	        this.withdrawalLimitPerMonth = withdrawalLimitPerMonth;
	    }
	    
	    

	    public double getInterestRate() {
			return interestRate;
		}


		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}


		public double getMinBalance() {
			return minBalance;
		}


		public void setMinBalance(double minBalance) {
			this.minBalance = minBalance;
		}


		public boolean isATMCardIssued() {
			return isATMCardIssued;
		}


		public void setATMCardIssued(boolean isATMCardIssued) {
			this.isATMCardIssued = isATMCardIssued;
		}


		public int getWithdrawalLimitPerMonth() {
			return withdrawalLimitPerMonth;
		}


		public void setWithdrawalLimitPerMonth(int withdrawalLimitPerMonth) {
			this.withdrawalLimitPerMonth = withdrawalLimitPerMonth;
		}


		void display() {
			super.display();
	        System.out.println("---- Saving Account Details ----");
	        System.out.println("Interest Rate: " + interestRate + "%");
	        System.out.println("Minimum Balance: " + minBalance);
	        System.out.println("ATM Card Issued: " + isATMCardIssued);
	        System.out.println("Withdrawal Limit/Month: " + withdrawalLimitPerMonth);
	    }
	}
class CurrentAccount extends BankAccount{

	    double overdraftLimit;
	    String businessName;
	    boolean hasChequeBook;
	    double transactionLimitPerDay;


	    CurrentAccount() {
	    	super();
	        overdraftLimit = 50000;
	        businessName = "Unknown";
	        hasChequeBook = true;
	        transactionLimitPerDay = 200000;
	    }

	 
	    CurrentAccount(int accountNumber,String accHoldername,double currentbalance,double overdraftLimit, String businessName, boolean hasChequeBook, double transactionLimitPerDay) {
	    	super( accountNumber, accHoldername, currentbalance);
	        this.overdraftLimit = overdraftLimit;
	        this.businessName = businessName;
	        this.hasChequeBook = hasChequeBook;
	        this.transactionLimitPerDay = transactionLimitPerDay;
	    }
	    
	    

	    public double getOverdraftLimit() {
			return overdraftLimit;
		}


		public void setOverdraftLimit(double overdraftLimit) {
			this.overdraftLimit = overdraftLimit;
		}


		public String getBusinessName() {
			return businessName;
		}


		public void setBusinessName(String businessName) {
			this.businessName = businessName;
		}


		public boolean isHasChequeBook() {
			return hasChequeBook;
		}


		public void setHasChequeBook(boolean hasChequeBook) {
			this.hasChequeBook = hasChequeBook;
		}


		public double getTransactionLimitPerDay() {
			return transactionLimitPerDay;
		}


		public void setTransactionLimitPerDay(double transactionLimitPerDay) {
			this.transactionLimitPerDay = transactionLimitPerDay;
		}


		void display() {
			super.display();
	        System.out.println("---- Current Account Details ----");
	        System.out.println("Business Name: " + businessName);
	        System.out.println("Overdraft Limit: " + overdraftLimit);
	        System.out.println("Cheque Book Available: " + hasChequeBook);
	        System.out.println("Daily Transaction Limit: " + transactionLimitPerDay);
	    }
	}


class SalaryAccount extends BankAccount{

	    String employerName;
	    boolean isZeroBalanceAccount;
	    String employeeId;
	    String salaryCreditDate;

	    SalaryAccount() {
	    	super();
	        employerName = "TCS";
	        isZeroBalanceAccount = true;
	        employeeId = "EMP000";
	        salaryCreditDate = "1st of every month";
	    }

	    SalaryAccount(int accountNumber,String accHoldername,double currentbalance,String employerName, boolean isZeroBalanceAccount, String employeeId, String salaryCreditDate) {
	    	super( accountNumber, accHoldername, currentbalance);
	        this.employerName = employerName;
	        this.isZeroBalanceAccount = isZeroBalanceAccount;
	        this.employeeId = employeeId;
	        this.salaryCreditDate = salaryCreditDate;
	    }
	    
	    

	    public String getEmployerName() {
			return employerName;
		}

		public void setEmployerName(String employerName) {
			this.employerName = employerName;
		}

		public boolean isZeroBalanceAccount() {
			return isZeroBalanceAccount;
		}

		public void setZeroBalanceAccount(boolean isZeroBalanceAccount) {
			this.isZeroBalanceAccount = isZeroBalanceAccount;
		}

		public String getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(String employeeId) {
			this.employeeId = employeeId;
		}

		public String getSalaryCreditDate() {
			return salaryCreditDate;
		}

		public void setSalaryCreditDate(String salaryCreditDate) {
			this.salaryCreditDate = salaryCreditDate;
		}

		void display() {
			super.display();;
	        System.out.println("---- Salary Account Details ----");
	        System.out.println("Employer Name: " + employerName);
	        System.out.println("Zero Balance Account: " + isZeroBalanceAccount);
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Salary Credit Date: " + salaryCreditDate);
	    }
	}


class TestBankAccount
{
public static void main(String[] args)
	{
	BankAccount b1;
	
	b1 = new SavingAccount( 20045, "Tejas Kadam", 15000.0,5.0, 2000.0, true, 10);
	b1.display();
	

	
	b1 = new CurrentAccount( 30012, "Tejas Kadam", 150000.0,100000.0, "TechWorld Pvt Ltd", true, 500000.0);
	b1.display();
	


	b1 = new SalaryAccount(20045, "Tejas Kadam", 55000.0, "Infosys", true, "EMP102", "5th of every month");
	b1.display();

	
	}


}//TestBankAccount class ends here


