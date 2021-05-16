import java.util.*;
class WithoutTemp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("Enter the second number");
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapping:");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}