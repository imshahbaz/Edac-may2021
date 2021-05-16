public class Decimal_To_Binary
{
	public static void main(String args[])
	{
		int index=0;
		int n=10;
		int binary[]=new int[20];
		while(n>0)
		{
			binary[index++]=n%2;
			n=n/2;
		
		}
		for (int i=index-1; i>=0; i--)
		{
			System.out.print(binary[i]);
		}
	}
}