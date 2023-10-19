import java.util.Scanner;
import java.util.Stack;

class StackManagement{
	static void pushStack(Stack<Integer> st) {
		System.out.println("Enter the number to be pushed : ");
		Scanner s = new Scanner(System.in);
		st.push(s.nextInt());
	}
	static void popStack(Stack<Integer>st) {
		st.pop();
	}
	static void displayStack(Stack<Integer>st) {
		for(int i : st) {
			System.out.println(i);
		}
	}
}


public class IntegerStack {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		int session = 0;
		while(session == 0) {
			System.out.println("Enter choice :  \n   1 : push, 2 : pop, 3 : display, 4 : exit");
			Scanner s = new Scanner(System.in);
			int token = s.nextInt();
			
			switch(token) {
			case (1):
				StackManagement.pushStack(st);
				break;
			case (2):
				StackManagement.popStack(st);
				break;
			case (3):
				StackManagement.displayStack(st);
				break;
			case (4):
				session =1;
				break;
			default : System.out.println("enter a valid input");

			}
		}
		
		
	}

}
