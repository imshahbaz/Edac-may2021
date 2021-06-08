package ADS;

public class QueImplementation2 {

	int size;
	int arr[];
	int front;
	int rear;
	int n;
	
	public QueImplementation2(int s) {
		size=s;
		arr=new int[s];
		front=0;
		rear=0;
		n=0;
	}
	
	public void enque(int a) {
		if(rear<=size-1&&n<size) {
			arr[rear]=a;
			rear++;
			n++;
			//System.out.println(n+"  "+rear);
		}
		else 
			System.out.println("Que is full");
	}
	
	
	public void deque() {
		if(isEmpty()) {
			System.out.println("Que is Empty");
		}
		else
		if(n>0) {
			int temp=arr[front];
			front++;
			rear--;
			n--;
			//System.out.println(n+"  "+rear);
			System.out.println("Element removed = " +temp);
		}
		
	}
	public boolean isEmpty() {
		if(n==0)
			return true;
		else return false;
	}
	
	public boolean isFull() {
		if(n==size)
			return true;
		else return false;
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Que empty");
		}
		else {
		for(int i=front;i<rear;i++) {
			if(arr[i]>0) {
				System.out.print(arr[i]+" ");
			}
		}}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueImplementation2 p=new QueImplementation2(10);
		p.enque(10);
		p.enque(20);
		p.enque(30);
		p.enque(40);
		p.enque(50);
		p.enque(60);
		p.enque(70);
		p.enque(80);
		p.enque(90);
		p.enque(100);
		p.enque(101);
		p.display();
		p.deque();
		p.deque();
		p.deque();
		p.deque();
		p.deque();
		p.deque();
		p.deque();
		p.deque();
		p.deque();
		p.deque();
		p.deque();
	
	
	}

}
