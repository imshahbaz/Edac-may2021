import java.util.*;
class Multiplication
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		int num,i;
		System.out.println("Enter a number:");
		num=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(num+ "*" + i + "=" +num*i);
		}
	}
}
