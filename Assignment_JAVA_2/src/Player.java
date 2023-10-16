import java.util.Scanner;

public class Player {
	String name;
	int age;
	String country;
	int runs;
	
	Player() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name of player: ");
		this.name = s.next();
		System.out.println("Enter the age of player: ");
		this.age = s.nextInt();
		System.out.println("Enter the Country of player: ");
		this.country = s.next();
		System.out.println("Enter the total runs scored by the player: ");
		this.runs = s.nextInt();
	}
	
}
