import java.util.Scanner;

public class ElectricityBill {
	int custNo;
	String custName;
	int units;
	
	void readData() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the customer id : ");
		this.custNo = s.nextInt();
		System.out.println("Enter the customer Name : ");
		this.custName = s.next();
		System.out.println("Enter the Units Consumed : ");
		this.units = s.nextInt();
	}
	void showData() {
		System.out.println("Enter the customer id : " + custNo);
		System.out.println("Enter the customer Name : " + custName);
		System.out.println("Enter the Units Consumed : " + units);
	}
	float computeBill() {
		float charges = 0;
		if(units > 600) {
			charges = (float) (100*1.2 + 200*2 + 300*3 + (units-600)*5);
		}
		else if(units > 300) {
			charges = (float) (100*1.2 + 200*2 + (units-300) * 3);
		}
		else if(units > 100) {
			charges += (float)(100*1.2 + (units - 100)*2);
		}
		else {
			charges += units*1.2;
		}
		
		return charges;
	}
}
