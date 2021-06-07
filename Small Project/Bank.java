package CollectionPractice;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Bank {

	static int bAcc=1000;
	String accNo="BA"+bAcc;
	String name;
	String address;
	String accType;
	double balance;
	int transactions=0;
	static Scanner sn=new Scanner(System.in);
	List<Bank> list=new LinkedList<Bank>();
	
	Bank(){}
	Bank(boolean b){
		bAcc++;
	}
	//add user
	void add() {
		Bank b=new Bank(true);
		System.out.println("Enter name :");
		sn.nextLine();
		b.name=sn.nextLine();
		System.out.println("Enter address :");
		b.address=sn.nextLine();
		System.out.println("Enter account type :");
		b.accType=sn.nextLine();
		System.out.println("Enter balance :");
		b.balance=sn.nextDouble();
		list.add(b);
	}
	//Display
	void display(String n) {
		boolean flag=false;
		for(Bank b:list) {
			if(b.accNo.equals(n)) {
				System.out.println(b.accNo+" "+b.name+" "+b.address+" "+b.accType+" "+b.balance+" "+b.transactions);
				flag=true;
				break;
			}	
		}
		if(flag==false)
			System.out.println("Invalid account number");
	}
	//Deposit
	void deposit(double d,String n) {
		boolean flag=false;
		if(d>0) {
	for(Bank b:list) {
		if(b.accNo.equals(n)) {
			b.balance+=d;
			b.transactions++;
			display(n);
			flag=true;
			break;
		}
		}
	if(flag==false)System.out.println("Invalid account number");
	}
		else System.out.println("invalid amount");
	}
	
	//withdraw
	void withdraw(double d,String n) {
		boolean flag=false;
		if(d>0) {
	for(Bank b:list) {
		if(b.accNo.equals(n)) {
			if(b.balance>d) {
				b.balance-=d;
				b.transactions++;
				display(n);
				flag=true;
				break;
			}
			else {System.out.println("Insufficient balance");flag=true;break;}
		}
		}
	if(flag==false)System.out.println("Invalid account number");
	}
		else System.out.println("invalid amount");
	}
	
	//address change
	void changeAddr(String addr,String n) {
		boolean flag=false;
		for(Bank b:list) {
			if(b.accNo.equals(n)) {
				b.address=addr;
				b.transactions++;
				flag=true;
				break;
			}
		}
		if(flag==false) System.out.println("Invalid account");
	}
	
	void menu() {
		int i=0;
		do {
			System.out.println("Enter your choice :\n 1 : Add information\n 2 : Display information\n 3 : Deposit\n 4 : Withdraw\n 5 : Change Adrdress");
			i=sn.nextInt();
			switch(i) {
			case 1: add();break;
			case 2: System.out.println("Enter account number");sn.nextLine(); String n=sn.nextLine();display(n);break;
			case 3: System.out.println("Enter account number");sn.nextLine(); String n1=sn.nextLine();
					System.out.println("Enter amount"); double d=sn.nextDouble();
					deposit(d,n1);break;
			case 4:	System.out.println("Enter account number");sn.nextLine(); String n3=sn.nextLine();
					System.out.println("Enter amount"); double d1=sn.nextDouble();
					withdraw(d1,n3);break;	
			case 5:System.out.println("Enter account number");sn.nextLine(); String n4=sn.nextLine();
			System.out.println("Enter Address"); String d2=sn.nextLine();
			changeAddr(d2,n4);break;		
			default :System.out.println("Invalid entry");
			}
			
		}while(i>0);
	}
	
	public static void main(String[] args) {
		Bank b=new Bank();
		b.menu();
	}
	
}
