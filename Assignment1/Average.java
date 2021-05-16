import java.util.*;
public class Average
{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int a,b,c,d,e,f,avg;
			System.out.println("Enter a 1st number:");
			a=sc.nextInt();
			System.out.println("Enter a 2nd number:");
			b=sc.nextInt();
			System.out.println("Enter a 3rd number:");
			c=sc.nextInt();
			System.out.println("Enter a 4th number:");
			d=sc.nextInt();
			System.out.println("Enter a 5th number:");
			e=sc.nextInt();
			System.out.println("Enter a 6th number:");
			f=sc.nextInt();
			avg=a+b+c+d+e+f/6;
			System.out.println("Average of Number:"+avg);
		}
}
			