

interface creditCard{
	void rupees();
	void dollars();
	void pounds();
}

class BankAccount implements creditCard{
	
	public void dollars() {
		System.out.println("payment using dollars");
	}
	public void pounds() {
		System.out.println("payment using pounds");
	}

	public void rupees() {
		System.out.println("payment using ruppes");
	}
}


public class Main7 {

	public static void main(String[] args) {
		
		BankAccount sbi = new BankAccount();
		BankAccount axis = new BankAccount();
		BankAccount icici = new BankAccount();
		
		sbi.rupees();
		axis.pounds();
		icici.dollars();
		
	}

}
