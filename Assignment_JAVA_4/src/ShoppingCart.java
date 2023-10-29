import java.util.ArrayList;
import java.util.Scanner;

class Item{
	int itno;
	String iname;
	int price;
	int quantity;
	
	Item(int itno, String iname, int price, int quantity){
		this.itno = itno;
		this.iname = iname;
		this.price = price;
		this.quantity = quantity;
	}
	
	void display() {
		System.out.println(this.itno +" " +this.iname + " "+ this.price + " "+this.quantity);
	}
}

class Shop{
	static ArrayList<Item> shopItems = new ArrayList<>();
	static ArrayList<Item> shopItemsAdd() {

		
		shopItems.add(new Item(1, "eggs", 44, 6));
		shopItems.add(new Item(2, "milk", 25, 1));
		shopItems.add(new Item(3, "bread", 20, 2));
		shopItems.add(new Item(4, "biscuts", 10, 3));
		shopItems.add(new Item(5, "banana", 25, 6));
		shopItems.add(new Item(6, "chips", 20, 3));
		
		return shopItems;
	}
	static void displayShopItems() {
		for(Item it : shopItems) {
			it.display();
		}
	}
	
}

class Cart{
	static ArrayList<Item> cartItems = new ArrayList<>();
	static ArrayList<Item> si = Shop.shopItemsAdd();
	static void addItems(int itno) {
		
		for(Item it : si) {
			if(it.itno == itno) {
				cartItems.add(it);
			}
		}
	}
	static void removeItems(int itno) {
		for(Item it : cartItems) {
			if(it.itno == itno) {
				cartItems.remove(it);
			}
		}
	}
	static void emptyCart() {
		cartItems.clear();
	}
	static void displayCartItems() {
		for(Item it : cartItems) {
			it.display();
		}
	}
	static int totalPrice() {
		int total = 0;
		for(Item it : cartItems) {
			total += it.price;
		}
		return total;
	}
	
}

public class ShoppingCart {

	public static void main(String[] args) {
		
		int token = 1;
		Scanner s = new Scanner(System.in);
		while(token == 1) {
			System.out.println("Enter your choice :-  ");
			System.out.println("1: Add Items to cart,  2: Remove Items from cart, 3: Empty Cart ");
			System.out.println("4: View Items in cart,  5: View Items in Shop, 6: checkout");
			int choice = s.nextInt();
			switch(choice) {
				case 1: 	
					System.out.println("Enter the itemNo to be added : ");
					int itno = s.nextInt();
					Cart.addItems(itno);
				break;
				
				case 2:
					System.out.println("Enter the itemNo to be removed : ");
					int itno2 = s.nextInt();
					Cart.removeItems(itno2);
				break;
				
				case 3 : 
					Cart.emptyCart();
				break;
				
				case 4:
					Cart.displayCartItems();
				break;
				
				case 5:
					Shop.displayShopItems();
				break;
				
				case 6:
					int total = Cart.totalPrice();
					System.out.println("Your Total price to be paid : " + total);
					token = 0;
			}
		}
		
		
	}

}
