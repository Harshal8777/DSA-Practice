package Patterns;


//import java.util.*;


//pattern1
/*   *
   ***
  *****
 *******
*********    */        
class Patterns{
     public  static void pattern1(int n)
    {
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1; j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    //pattern2
    /*1234
1234
1234
1234
1234 */
    public static void pattern2(int n)
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    //pattern3
     /*1  2  3  4  5  
6  7  8  9  10
11  12  13  14  15
16  17  18  19  20
21  22  23  24  25
26  27  28  29  30 */
     public static void pattern3(int n)
    {
        int count=1;
        for(int i=0;i<=n;i++)
        {
           // int count;
            for(int j=1;j<=n;j++)
            {
               // count++;
                System.out.print(count + "  ");
                count++;
            }
            System.out.println();
        }
    }


}

public class Pattern{
    public static void main(String[] args) {


        Patterns.pattern3(5);

}
}