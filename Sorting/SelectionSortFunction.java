package com.CdacMumbai;

public class SelectionSortFunction {
	public void Sort(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
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
		int arr[]= {50,60,70,40,30,20,10};
		SelectionSortFunction s1=new SelectionSortFunction();
		s1.Sort(arr);
		System.out.println("Sorted array is: ");
		s1.display(arr);
	}
}
