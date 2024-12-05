package Patterns;

import java.util.ArrayList;
import java.util.Arrays;

class Array {

    public void sort(int[] arr, int n)
    {
        for(int j=0 ; j<n; j++ )
        {
            for(int i=j+1 ; i<n ; i++)
            {
                if(arr[j] > arr[i])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}


public class ArrayClass{
    public static void main(String[] args)
    {
        int[] arr1 = {5,6,8,2,9,1,4,3,0,7};
        int n = arr1.length;

        Array arr = new Array();
        arr.sort(arr1,n);
        System.out.println(Arrays.toString(arr1));
        int largest = arr1[n-1];
        int smallest = arr1[0];
        System.out.println("Largest : "+largest+" Smallest : "+smallest);
    }
}
