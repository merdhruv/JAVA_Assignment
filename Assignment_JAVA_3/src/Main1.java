import java.util.Scanner;

class BankAcc {
	private int accno;
	private float totalBal = 0;
	
	BankAcc(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Account Number : ");
		this.accno = s.nextInt();
	}
	
	void deposit(int amount) {
		totalBal += amount;
	}
	void withdraw(int amount) {
		if(amount > totalBal) {
			System.out.println("insufficent balance");
		}
		else {
			totalBal -= amount;
		}		
	}
	
	float getBalance() {
		if(totalBal == 0) {
			System.out.println("zero balance");
		}
		return totalBal;
		
	}
	void setBalance(float totalBal) {
		this.totalBal= totalBal; 
	}
}

class CheckAcc extends BankAcc{
	private int fee;
	
	CheckAcc(){
		System.out.println("Enter fees");
		Scanner s = new Scanner(System.in);
		fee = s.nextInt();
	}
	
	void deductFee() {
		float bal = super.getBalance();
		bal -= fee;
		super.setBalance(bal);
		
	}
}

class SavingAcc extends BankAcc{
	private float rate;
	
	SavingAcc(){
		System.out.println("Enter the interest rate");
		Scanner s = new Scanner(System.in);
		rate = s.nextFloat();
	}
	
	void addInterest() {
		float bal = super.getBalance();
		bal += bal*(rate/100);
		super.setBalance(bal);
	}
}

public class Main1{
	public static void main(String[] args) {
//		BankAcc b1 = new BankAcc();
//		b1.deposit(3000);
//		b1.withdraw(2000);
//		System.out.println(b1.getBalance());
//		
//		CheckAcc c1 = new CheckAcc();
//		c1.deposit(1000);
//		c1.deductFee();
//		System.out.println(c1.getBalance());
		
		SavingAcc s1 = new SavingAcc();
		s1.deposit(1000);
		s1.addInterest();
		System.out.println(s1.getBalance());
		
	}
}
