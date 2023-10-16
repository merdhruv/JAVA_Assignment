import java.util.Scanner;

class Emp{
	int ssn;
	String firstName;
	String lastName;
	
	Emp(){
		System.out.println("Employee created");
	}
	void setssn(int ssn) {
		this.ssn = ssn;
	}
	void setFirstName(String fname) {
		this.firstName = fname;
	}
	void setLastName(String lname) {
		this.lastName = lname;
	}
	int getssn() {
		return ssn;
	}
	void getFirstName() {
		System.out.println("First Name : " + firstName);
	}
	void getLastName() {
		System.out.println("Last Name : "+ lastName);
	}
	void print() {
		System.out.println("SSN : " + ssn);
		System.out.println("First Name : " + firstName);
		System.out.println("Last Name : "+ lastName);
	}	
	
}

class HourlyEmp extends Emp {
	int salary;
	
	HourlyEmp(){
		System.out.println("hourlyEmp created");
	}
	void getSalary() {
		System.out.println("Salary : "+ salary);
	}
	void setSalary(int sal) {
		this.salary = sal;
	}
	void print() {
		System.out.println("SSN : " + ssn);
		System.out.println("First Name : " + firstName);
		System.out.println("Last Name : "+ lastName);
		System.out.println("salary : "+ salary);
	}
	
	void computeNetPay(){
		int netpay = salary*12;
		System.out.println("Net Pay : " + netpay);
	}
	void computeGrossPay() {
		float netpay = salary*12;
		netpay -= netpay*(5.0/100);
		System.out.println("Gross Pay : " + netpay);
	}
	
}
class SalariedEmp extends Emp {
	int salary;
	SalariedEmp(){
		System.out.println("hourlyEmp created");
	}
	void getSalary() {
		System.out.println("Salary : "+ salary);
	}
	void setSalary(int sal) {
		this.salary = sal;
	}
	
	void print() {
		System.out.println("SSN : " + ssn);
		System.out.println("First Name : " + firstName);
		System.out.println("Last Name : "+ lastName);
		System.out.println("salary : "+ salary);
	}
	void computeNetPay(){
		int netpay = salary*12;
		System.out.println("Net Pay : " + netpay);
	}
	void computeGrossPay() {
		float netpay = salary*12;
		netpay -= netpay*(5.0/100);
		System.out.println("Gross Pay : " + netpay);
	}
}

public class Main2 {
	public static void main(String[] args) {
		HourlyEmp h1 = new HourlyEmp();
		h1.setSalary(60000);
		h1.computeNetPay();
		h1.computeGrossPay();
		
		SalariedEmp s1 = new SalariedEmp();
		s1.setSalary(50000);
		s1.computeNetPay();
		s1.computeGrossPay();
		
	}
	
}
