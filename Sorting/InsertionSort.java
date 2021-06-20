package com.CdacMumbai;

public class InsertionSort {

	public static void main(String[] args) {
		int temp,j;
		int arr[]={44,55,66,77,99,22,11};
		for(int i=1;i<arr.length;i++){
			
			temp=arr[i];
			j=i;
			while(j>0 && arr[j-1]>temp)
			{
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
			
		}
		System.out.println("Sotred Array: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}

	}
	
}
