import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Employee e1 = new Employee() ;
//		Scanner s = new Scanner(System.in);
//
//		e1.readEmpData(s.nextInt(), s.next(), s.next(), s.next(), s.nextInt());
//		e1.displayEmpData();
//		s.close();
//-------------------------------------------------------------------------------------------
//		ElectricityBill e1 = new ElectricityBill();
//		e1.readData();
//		e1.showData();
//		float bill = e1.computeBill();
//		System.out.println("The Electricity Bill is : "+bill);
		
//-----------------------------------------------------------------------------------------------
//		Student s1 = new Student();
//		s1.displayResult();
		
//-----------------------------------------------------------------------------------------------------
//		BankAcc b1 = new BankAcc(12, "Dhruv", 2000);
//		b1.deposit(300);
//		b1.showbalance();
//		b1.withdraw(5000);
//		b1.showbalance();
//		b1.withdraw(400);
//		b1.showbalance();
//		b1.interest();
//		
		
//--------------------------------------------------------------------------------------------------------
		
		Player [] p = new Player[2];
		for(int i = 0; i < p.length; i++) {
			p[i] = new Player();
		}
		for(int i = 0; i < p.length; i++) {
			if(p[i].runs > 5000) {
				System.out.println(p[i].name + p[i].age + p[i].runs);
			}
		}
	}

}
