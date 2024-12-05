package Array;

class Rotate{
    public void RotateByN(int[]arr,int d )
    {
        int n = arr.length;
        d = d % n;

        int[] temp = new int[d];
        for(int i = 0; i<d;i++)
        {
            temp[i] = arr[i];
        }

        for(int j=d; j<n;j++)
        {
            arr[j -d] = arr[j];
        }

        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }

        System.out.print("Rotated Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


public class LeftRotateByNplaces{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int d = 3; // Number of places to rotate
        Rotate rotate = new Rotate();
        rotate.RotateByN(arr, d);
    }
}
