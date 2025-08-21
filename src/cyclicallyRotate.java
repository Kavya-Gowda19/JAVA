/*Given an array Arr[ ] of N integers and a positive integer K. The task is to cyclically rotate the array clockwise by K.
Note : Keep the first of the array unaltered.
Example 1:
5  —Value of N
{10, 20, 30, 40, 50}  —Element of Arr[ ]
2  —–Value of K
Output :
40 50 10 20 30
Example 2:
4  —Value of N
{10, 20, 30, 40}  —Element of Arr[]
1  —–Value of K
Output :
40 10 20 30*/
package TCS;
import java.util.*;
public class Tcs3 {
public static  int [] rotate(int arr[],int k) {

    int res[] = new int[arr.length];
    int n=arr.length;

    for (int i = 0; i < k; i++) {
        res[i] = arr[n- k +i];
    }
    for (int i = k; i < n; i++){
        res[i]=arr[i-k];
}

        return res;
}

    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the k");
        int k=s.nextInt();
        int result[]=Tcs3.rotate(arr,k);
       for(int i=0;i<n;i++){
           System.out.print(result[i]+" ");
       }
    }
}
