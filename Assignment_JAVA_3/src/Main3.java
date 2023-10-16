class Person{
	String name;
	int age;
	
	Person(){
		
	}
}

class Employee extends Person{
	void myProfession() {
		System.out.println("Employee");
	}
}
class Teacher extends Person{
	void myProfession() {
		System.out.println("Teacher");
	}
}
class PermanentEmp extends  Employee{
	void myProfession() {
		System.out.println("Permanent Employee");
	}
}

class ContractEmp extends Employee{
	void myProfession() {
		System.out.println("Contract Employee");
	}
} 

public class Main3 {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.myProfession();
		
		PermanentEmp p = new PermanentEmp();
		p.myProfession();
		
		ContractEmp c = new ContractEmp();
		c.myProfession();
	}
}
