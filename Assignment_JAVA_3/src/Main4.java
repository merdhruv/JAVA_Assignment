
class Author{
	private String name;
	private String email;
	private char gender;
	
	Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	String getName() {
		return name;
	}
	String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}
	char getGender() {
		return gender;
	}
	public String toString() {
		return name + " " + gender + " at "+ email;
	}
}

class Book {
	
	private String name;
	private Author author;
	private double price;
	private int quantity;

	Book(String name, Author author, double price, int quantity) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	String getName() {
		return name;
	}
	Author getAuthor() {
		return author;
	}
	double getPrice() {
		return price;
	}
	int getQty() {
		return quantity;
	}
	void setPrice(double price) {
		this.price = price;
	}
	void setOty(int q) {
		this.quantity = q;
	}
	public String toString() {
		return name + " by "+ this.author.getName() + " " + this.author.getGender() + " at "+ this.author.getEmail();
	}

}

public class Main4 {

	public static void main(String[] args) {
		Author a = new Author("James Clear",  "jamesclear@gmail.com", 'M');
//		System.out.println(a.toString());
		
		Book b = new Book("Atomic Habits", a, 400, 3);
		System.out.println(b.toString());
		
	}

}
