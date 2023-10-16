import java.util.Scanner;

public class Student {
	int id;
	String name;
	int marks;
	String result;
	
	Student(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the student id : ");
		this.id = s.nextInt();
		System.out.println("Enter the student Name : ");
		this.name = s.next();
		System.out.println("Enter the student marks : ");
		this.marks = s.nextInt();
	}
	void displayResult() {
		if(marks > 50) {
			result = "passed";
		}
		else {
			result = "failed";
		}
		System.out.println("The student "+ result);
	}
}
