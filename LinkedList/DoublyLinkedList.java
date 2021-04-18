public class DoublyLinkedList {

	static Node head;
	
	static class Node{
		
		int data;
		Node next;
		Node prev;
		
		Node(int _data){
			
			data = _data;
			next = null;
			prev = null;
		}
	}
	
	public void append(int data) {
		
		Node new_node = new Node(data);
		
		if(head == null) {
			head = new Node(data);
			return;
		}
		
		Node n = head;
		while(n.next != null) {
			n = n.next;
		}
		
		n.next = new_node;
		new_node.prev = n;
	}
	
	public void printList() {
		
		Node n = head;
		
		while(n != null) {
			System.out.println("Prev: " + n.prev + " ");
			System.out.println("Data: " + n.data + " ");
			System.out.println("next: " + n.next + " ");
			System.out.print("\n");
			n = n.next;
		}
		
		return;
	}
	
	public void appendAtStart(int data) {
		
		Node new_node = new Node(data);
		
		new_node.next = head;
		head.prev = new_node;
		head = new_node;
		
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.append(4);
		list.append(5);
		list.append(6);
		list.append(8);
		list.appendAtStart(1);
		
		list.printList();

	}

}
