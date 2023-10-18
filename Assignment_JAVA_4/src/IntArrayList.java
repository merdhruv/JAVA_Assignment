import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

class ArrayManagement{
	static void addArrayElements(ArrayList <Integer> al) {
		System.out.println("Enter the number to be added : ");
		Scanner s = new Scanner(System.in);
		al.add(s.nextInt());
	}
	
	static void removeElement(ArrayList<Integer> al) {
		System.out.println("Enter the position to be deleted : ");
		Scanner s = new Scanner(System.in);
		al.remove(s.nextInt());
	}
	static void modifyElement(ArrayList<Integer> al) {
		System.out.println("Enter the position to be modified : ");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		System.out.println("Enter the new number : ");
		int num = s.nextInt();
		al.add(i, num);
		
	}
	
	static void veiwAll(ArrayList <Integer> al) {
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	static int viewIndex(ArrayList<Integer>al) {
		System.out.println("Enter the position to be viewed : ");
		Scanner s = new Scanner(System.in);
		return al.get(s.nextInt());
	}
	static void sortArray(ArrayList<Integer>al) {
		Collections.sort(al);
	}
}
public class IntArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Enter the number of elements to be added : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 0; i<n ; i++) {
			ArrayManagement.addArrayElements(al);
		}
		System.out.println(ArrayManagement.viewIndex(al));
		
		ArrayManagement.removeElement(al);
		ArrayManagement.veiwAll(al);
		
		ArrayManagement.modifyElement(al);
		ArrayManagement.veiwAll(al);
		
		ArrayManagement.sortArray(al);
		
	}

}
