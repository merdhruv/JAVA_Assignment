import java.util.LinkedList;
import java.util.Scanner;


class LinkedListManagement{
	static void addElements(LinkedList<Integer>ll) {
		System.out.println("Enter the number to be added : ");
		Scanner s =  new Scanner(System.in);
		ll.add(s.nextInt());
	}
	static void addElementsAtPos(LinkedList<Integer>ll) {
		System.out.println("Enter the Position : ");
		Scanner s =  new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Enter the number to be added : ");
		int num = s.nextInt();
		ll.add(n, num);
	}
	static void addElementsAfterNode(LinkedList<Integer>ll) {
		System.out.println("Enter the Position : ");
		Scanner s =  new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Enter the number to be added : ");
		int num = s.nextInt();
		ll.add(n, num);
	}
	
	
	static void deleteElement(LinkedList<Integer>ll) {
		ll.remove();
	}
	static void deleteElementAtPos(LinkedList<Integer>ll) {
		System.out.println("Enter the position to be deleted : ");
		Scanner s =  new Scanner(System.in);
		ll.remove(s.nextInt());
	}
	static void deleteAfterNode(LinkedList<Integer>ll) {
		
	}
	static void reverseList(LinkedList <Integer> ll) {
		LinkedList <Integer> newll = new LinkedList<>();
		for(int i = 0; i < ll.size() ;i++) {
			newll.add(ll.get(ll.size()-i-1));
		}
		for(int i = 0; i < ll.size() ;i++) {
			ll.set(i, newll.get(i));
		}
		
	}
	static void displayList(LinkedList <Integer> ll) {
		System.out.println(ll);
	}
	
	
}


public class IntegerLinkedList {
	public static void main(String[] args) {
		LinkedList <Integer> ll = new LinkedList<>();
		
		LinkedListManagement.addElements(ll);
		LinkedListManagement.addElements(ll);
		LinkedListManagement.addElements(ll);
		LinkedListManagement.addElements(ll);
		LinkedListManagement.displayList(ll);
		LinkedListManagement.reverseList(ll);
		LinkedListManagement.displayList(ll);
		
	}
}
