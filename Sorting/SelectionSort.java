package com.CdacMumbai;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {20,70,40,80,74,89};
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
		System.out.println("Sorted Array is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
}
