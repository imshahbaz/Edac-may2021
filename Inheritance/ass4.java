import java.util.Scanner;

class vechicles
{
	int milage;
	long price;
	
	void details()
	{
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  Milage");
		milage = sc.nextInt();
		sc.nextLine();
		
		System.out.println(" Enter price ");
		price = sc.nextInt();
		sc.nextLine();
		
	}
	void show()
	{
		
		System.out.println(" Milage of vechicle is "+milage);
		System.out.println(" Price of vechicle is "+price);
	}
		
				
			
	
}
class car extends vechicles
{
	long ocost;
	int warntyear;
	int seatcap;
	String Ftype;
	
	void details()
	{
		super.details();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  Owenrship cost");
		ocost = sc.nextLong();
		sc.nextLine();
		
		System.out.println(" Enter NUmber Of warntyear");
		warntyear = sc.nextInt();
		sc.nextLine();
		
		System.out.println(" Enter seatcapicity ");
		seatcap= sc.nextInt();
		
		System.out.println(" Enter Fueltype");
		Ftype= sc.nextLine();
	}	
		void show()
		{
			super.show();
		System.out.println(" Owenership cost is  "+ocost);
		System.out.println(" Warntyear "+warntyear);
		System.out.println(" Seating Capicity "+seatcap);
		System.out.println(" Fuel TYpe "+Ftype);
		
		}
	
	
}
class bike extends vechicles
{
	Scanner sc = new Scanner(System.in);
	int noOfCylinder;
	int numofgears;
	String coolingtype;
	String Wheeltype;
	float tanksize;
	///super.
	void details()
	{	
		super.details();
		System.out.println("Enter  No of Cyilnder");
		noOfCylinder = sc.nextInt();
		sc.nextLine();
		
		System.out.println(" Enter NUmber Of geras");
		numofgears = sc.nextInt();
		sc.nextLine();
		
		System.out.println(" Enter Coolingtype");
		coolingtype= sc.nextLine();
		
		System.out.println(" Enter Wheeltype");
		Wheeltype= sc.nextLine();
		
		System.out.println(" Enter Tankksize");
		tanksize= sc.nextFloat();
	}
	void show()
	{
		super.show();
		System.out.println(" No of Cyilnder "+noOfCylinder);
		System.out.println(" No of gears "+numofgears);
		System.out.println(" Coolingtype "+coolingtype);
		System.out.println(" Wheeltype "+Wheeltype);
		System.out.println(" tanksize "+tanksize);
		
	}
	
}
class Ford extends car
{
	String Model;
	
	
	void details()
	{
		super.details();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter Model");
		Model= sc.nextLine();
				
	}
	
	void show()
	{
		super.show();
		System.out.println(" Model Name is "+Model);
	}
	
}
class Audi extends car
{
	String Model;
	void details()
	{
		Scanner sc = new Scanner(System.in);
		
		super.details();
		System.out.println(" Enter Model");
		Model= sc.nextLine();
		
	}
	void show()
	{
		super.show();
		System.out.println("Model Name is "+Model);
	}
	
}
class Bajaj extends bike
{
	String maketype;
	void details()
	{
		super.details();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter Maketype");
		maketype= sc.nextLine();
		super.show();
			
	}
	
	void show()
	{
		super.show();
		System.out.println(" Maketype "+maketype);
	}
	
}

class TVS extends bike
{
	String maketype;
	
	
	void details()
	{
		super.details();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter Maketype");
		maketype= sc.nextLine();	
			
	}
	void show()
	{
		super.show();
		System.out.println(" Make type "+maketype);
	}
	
}

public class ass4 {

	public static void main(String[] args) {
		//vechicles ve =  new vechicles();
		//ve.details();
		
		TVS tv = new TVS();
		 tv.details();
		 System.out.println("..Details of TVS are Below..");
		 tv.show();
		 
		 Bajaj bj = new Bajaj();
		 bj.details();
		 System.out.println("..Details of Bajaj are Below..");
		 tv.show();

	}

}
