import java.util.Scanner;

public class BankAcc {
	int accno;
	String accname;
	int balance;
	
	BankAcc(int accno, String accname, int balance){
		this.accno = accno;
		this.accname = accname;
		this.balance = balance;
	}	
	
	void withdraw(int amount) {
		if(amount < balance) {
			balance -= amount;
		}
		else {
			System.out.println("Not enough balance");
		}
	}
	void deposit(int amount) {
		balance += amount;
	}
	void showbalance() {
		System.out.println(balance);
	}
	void interest() {
		System.out.println("Enter interest rate");
		Scanner s = new Scanner(System.in);
		int interest = s.nextInt();
		this.balance += this.balance*(interest/100);
	}
}
