package Array;

import java.util.Arrays;

class  ArrayOne{
    public  void LeftRotateByOnePlace(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
        int temp =arr[0];
        for(int i = 1; i<arr.length; i++)
        {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }

    
}



public class LeftRotateByOne {
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8};
        ArrayOne obj = new ArrayOne();
        obj.LeftRotateByOnePlace(arr);
    }
}