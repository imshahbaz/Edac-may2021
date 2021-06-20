import java.io.*;
import java.util.*;

public class InsertionSort {
        
        public void insertionSort(int arr[]){
                
                for(int i = 1 ; i < arr.length ; i++){
                        int n = arr[i];
                        int j = i-1;
                        
                        while(j >= 0 && arr[j] > n){
                                arr[j+1] = arr[j];
                                j--;
                        }arr[j+1] = n;
                        
                        disp(arr);
                }
        }

        public void disp(int arr[]){
                for(int i : arr){
                                System.out.print(i+" ");
                }System.out.println();
        }
        
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int [n];
            
            for(int i = 0 ; i < n ; i++){
                    arr[i] = sc.nextInt();
            }
            
            InsertionSort soln = new InsertionSort();
            soln.insertionSort(arr);
            soln.disp(arr);
    }
}