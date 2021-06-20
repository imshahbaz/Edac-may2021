package com.CdacMumbai;

public class InsertionFunction {
	public void sort(int arr[])
	{
		int temp,j;
		for(int i=0;i<arr.length;i++)
		{
			temp=arr[i];
			j=i;
			while(j>0 && arr[j-1]>temp)
			{
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
	}
	public void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		int arr[]= {70,80,60,50,40,30,10,20};
		InsertionFunction I1=new InsertionFunction();
		I1.sort(arr);
		System.out.println("Sorted array is : ");
		I1.display(arr);
		
	}
}
