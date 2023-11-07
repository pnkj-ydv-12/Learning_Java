package Polymorphism;

public class PayYourBills {
	
	int mobile;
	String upiId;
	double accNumber;
	
	public void makePayment(int mobile){
		System.out.println("Payment Done");
	}                                                   //Compile Time Polymorphism.
	                                                    //Method OverLoading.
	public void makePayment(double accNumber){
		System.out.println("check your acc number again.... ");
	}
	
	public void makePayment(String upiId){
		System.out.println("in Progress");
	} 

	public static void main(String[] args) {
		PayYourBills PB=new PayYourBills();
		PB.mobile=9939;
		PB.makePayment(PB.mobile);

	}

}
