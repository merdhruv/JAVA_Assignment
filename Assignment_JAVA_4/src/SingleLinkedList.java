
class Node{
	int val;
	Node next;
	
	Node(int val){
		this.val = val;
		this.next = null;
	}
	
	Node(int val, Node next){
		this.val = val;
		this.next = next;
	}
}
class NodeManagement{
	
	static void displayLL(Node head) {
		Node temp = new Node(0,head);
		while(temp.next!=null) {
			temp = temp.next;
			System.out.println(temp.val);
		}
	}
	
	static void addNodeAtBegin(Node head, int n) {
		Node newNode = new Node(n, head);
		head = newNode;
	}
	static void addNodeAtPos(Node head, int val, int pos) {
		Node temp = new Node(0, head);
		while(pos!=0) {
			if(temp.next!=null) {
				temp = temp.next;
			}
			pos--;
		}
		Node newNode = new Node(val, temp.next);
		temp.next = newNode;
		
	}
}



public class SingleLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10, null);
		
		NodeManagement.displayLL(head);
		NodeManagement.addNodeAtBegin(head, 20);
		NodeManagement.addNodeAtBegin(head, 30);
		System.out.println("-------------------------------------------------");
		NodeManagement.displayLL(head);
	}

}
