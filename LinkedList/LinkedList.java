public class LinkedList {
	
	static Node head;
	
	static class Node {
		
		int data;
		Node next;
		
		Node(int d){
			
		data = d;
		next =  null;
		}
	}
	
	public void append(int i) {
		
		Node new_node = new Node(i);
		
		if(head == null) {
			head = new Node(i);
			return;
		}
		
		new_node.next = null;
		
		Node n = head;
		while(n.next != null) {
			n = n.next;
		}
		n.next = new_node;
		return ;
	}
	
	public void printList() {
		
		Node n = head;
		while(n != null) {
			
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	public void appendAt(int value, int position) {
		
		Node new_node = new Node(value);
		
		Node n = head;
		for(int i = 0; i < position - 1; i++) {
			n = n.next;
		}
		
		new_node.next = n.next;
		n.next = new_node;
		
		return;
	}
	
	public void appendAtstart(int data) {
		
		Node new_start = new Node(data);
		
		new_start.next = head;
		head = new_start;
		
		return;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		
		list.append(1);
		list.append(2);
		list.append(3);
		list.appendAt(0,2);
		list.appendAtstart(9);
		list.printList();
	}

}
