package ADS;

public class LinkedListCr {
	Node head;
	Node tail;
	static class Node{
		int data;
		Node next;
		public Node(int a) {
			data=a;
			next=null;
		}
	}
		void add(int a) {
			Node newNode=new Node(a);
			if(head==null) {
				head=newNode;
				tail=newNode;
				
			}
			else
			{	tail.next=newNode;
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
						
					}
					else {
						while(current!=null&&current.data!=a) {
						
							prev=current;
							current=current.next;
						}
						if(current!=null) {
							System.out.println("Removed element : "+current.data);
							prev.next=current.next;
						}
						else if(current==null) {
							System.out.println("Not found");
						}
					}
				}
			}
		
		
		void removeIndex(int a) {
			
			if(a==0) {
				System.out.println("Removed element : "+head.data);
				head=head.next;
			}
			else {
				int counter=0;
				Node current=head,prev=null;
				while(current!=null&&counter!=a) {
					prev=current;
					current=current.next;
					counter++;
				}
				if(current!=null) {
					System.out.println("Removed element : "+current.data);
					prev.next=current.next;
				}
				
				if(current==null) {
					System.out.println("invalid index");
				}
			}
			
		}

		
public static void main(String[] args) {
	LinkedListCr obj=new LinkedListCr();
	obj.add(10);
	obj.add(20);
	obj.add(30);
	//obj.remove(20);
	//obj.removeIndex(1);
	
	obj.display();
}
}
