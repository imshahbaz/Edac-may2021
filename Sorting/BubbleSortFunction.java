package com.CdacMumbai;

public class BubbleSortFunction {
	public void Sort(int arr[])
	{
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
				
			}
		}
		
	}
	public void display(int arr[])
	
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		
		BubbleSortFunction b1=new BubbleSortFunction();
		int arr[]= {90,80,70,60,50,40,30,20,10};
		b1.Sort(arr);
		System.out.println("Sorted Array Elements are:");
		b1.display(arr);
	}
}

