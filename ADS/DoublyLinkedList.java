package ADS;


public class DoublyLinkedList {
	
	Node head;
	Node tail;
	static class Node{
		int data;
		Node next;
		Node prev;
		public Node(int a) {
			data=a;
			next=null;
			prev=null;
		}
	}

	void add(int a) {
		Node newNode=new Node(a);
		if(head==null) {
			head=newNode;
			tail=newNode;
			
		}
		else
		{	newNode.prev=tail;
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	void display() {
		Node current=head;
		while(current!=null) {
		System.out.println(current.data);
		current=current.next;
		}
	}
	
	void remove(int a) {
		if(head==null) {
			System.out.println("List empty");
		}
		else 
		{
			Node current=head,prev=null;
			
				if(current==head&&current.data==a) {
					System.out.println("Removed element : "+current.data);
					head=current.next;
					head.prev=prev;
				}
				else {
					while(current!=null&&current.data!=a) {
					
						prev=current;
						current=current.next;
					}
					if(current!=null) {
						System.out.println("Removed element : "+current.data);
						prev.next=current.next;
						current=current.next;
						current.prev=prev;
					}
					else if(current==null) {
						System.out.println("Not found");
					}
				}
			}
		}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList d=new DoublyLinkedList();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
		d.add(50);
		d.remove(40);
		d.display();
		
	}

}
