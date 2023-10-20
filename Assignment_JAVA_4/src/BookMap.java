import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Book{
	String name;
	int price;
	String authorName;
	int isbn;
	String publication;
	
	Book(){
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter Book name : ");
		this.name = s.next();
		System.out.println("Enter Book Price : ");
		this.price = s.nextInt();
		System.out.println("Enter Author name : ");
		this.authorName = s.next();
		System.out.println("Enter Book isbn : ");
		this.isbn = s.nextInt();
		System.out.println("Enter Publication: ");
		this.publication = s.next();
		
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", authorName=" + authorName + ", isbn=" + isbn
				+ ", publication=" + publication + "]";
	}
	
}
class BookManagement {
	static void getBookById(HashMap<Integer,Book>b) {
		System.out.println("Enter the isbn : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(b.get(n));
	}
	static void reducePrice(HashMap<Integer,Book>b) {
		System.out.println("Enter the isbn : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Book  b1 = b.get(n);
		b1.price += b1.price*0.1;
		System.out.println(b.get(n));
	}
}

public class BookMap {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		Book b2 = new Book();
		
		HashMap<Integer,Book> bookList = new HashMap<>();
		
		bookList.put(b1.isbn, b1);
		bookList.put(b2.isbn, b2);
		
		for(Map.Entry m : bookList.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue());
		}
		BookManagement.getBookById(bookList);
		BookManagement.reducePrice(bookList);
	}

}
