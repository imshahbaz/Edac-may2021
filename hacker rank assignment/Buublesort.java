import java.io.*;
import java.util.*;

public class Buublesort {

    public static void main(String[] args) {
        Buublesort b1=new Buublesort();
        int arr[]= {3,5,8,4,1,9,-2};
        b1.Sort(arr);
       // System.out.println("Sorted Array Elements are:");
       // b1.display(arr);
        System.out.println(Arrays.toString(arr));

    }
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
        System.out.println(Arrays.toString(arr));

       /* System.out.print("[");
        for(int i=0;i<arr.length;i++)
        {
            if(i==arr.length-1)
            {
                                
                System.out.print(arr[i]);

            }
            else
            System.out.print(arr[i]+", ");
            
        }
         System.out.print("]");
        System.out.println();*/
    }
}