package com.CdacMumbai;
//Heap Sort
public class sortheap {
	public void sort(int arr[])
	{
		int n = arr.length;

		
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);

		
		for (int i = n - 1; i > 0; i--) {
			
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			
			heapify(arr, i, 0);
		}
	}

	
	void heapify(int arr[], int n, int i)
	{
		int largest = i; 
		int l = 2 * i + 1; 
		int r = 2 * i + 2; 

		
		if (l < n && arr[l] > arr[largest])
			largest = l;

		
		if (r < n && arr[r] > arr[largest])
			largest = r;


		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			heapify(arr, n, largest);
		}
	}

	
	static void display(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}


	public static void main(String args[])
	{
		int arr[] = { 122, 31, 13, 51, 62, 75 };
		int n = arr.length;

		sortheap ob = new sortheap();
		ob.sort(arr);

		System.out.println("Sorted array is");
		display(arr);
	}
}
