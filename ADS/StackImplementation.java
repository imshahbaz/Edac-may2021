package ADS;

import java.util.Scanner;

public class StackImplementation {
int size;
int top;
int arr[];
	public StackImplementation(int a){//5
		size =a;
		top=-1;
		arr =new int [a];
	}
	
	void push(int b) {//top==size 
		if(isFull()) {
			System.out.println("Stack is full");
		}
		else 
		arr[++top]=b;
	}
	
	public void pop() {//top==size
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println(arr[top]);
		top--;}
	}
	
	public int peek() {
	return arr[top];
	}
	
	public boolean isEmpty() {
		if(top==-1)
			return true;
		else return false;
	}
	
	public boolean isFull() {
		if(top==size-1)
			return true;
		else return false;
	}
	public void display() {
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void menu() {
		Scanner sn=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter choice :");
			System.out.println("1 : insert\n 2 : delete \n 3 : get element on top\n 4 : check empty stack \n 5 : check stack is full \n 6 : display\n 0 : exit");
			choice =sn.nextInt();
			switch(choice) {
		case 1:System.out.println("Enter the element you want to insert");
			   int c=sn.nextInt();
			   push(c);
			   break;
		case 2:pop();
				break;
		case 3:System.out.println(peek());
				break;
		case 4:if(isEmpty()) 
				System.out.println("Stack is empty");
		else System.out.println("Stack is not empty");
		break;
		
		case 5:if(isFull()) 
			System.out.println("Stack is full");
	else System.out.println("Stack is not full");
	break;
		case 6:display();
		break;
		default:System.out.println("invalid choice");
		}}while(choice>0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackImplementation s=new StackImplementation(5);
		s.menu();
	}

}
