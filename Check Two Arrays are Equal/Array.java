/**
 * arrray
 */
import java.util.*;
public class Array {

    public static void check(long A[],long B[],int N)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        
        boolean result=Arrays.equals(A,B);
        System.out.println("Result:- "+result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:- ");
        int n = sc.nextInt();
        long arr1[] = new long[n];
        System.out.print("Enter the Elements in arr1:- ");
        for(int i=0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
        }
        long arr2[] = new long[n];
        System.out.print("Enter the Elements in arr2:- ");
        for(int i=0;i<n;i++)
        {
            arr2[i] = sc.nextInt();
        }

        sc.close();


     check(arr1,arr2, n) ;

    }
}