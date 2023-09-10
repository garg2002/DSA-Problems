/**
     CPDO = Count All Valid Pickup and Delivery Options
 */
import java .util.*;
public class CPDO {

    private static final int MOD = 1000000007;
    public static int Count(int n)
    {
        long count =1;
        int temp = 0;

        if(n == 1) return 1;
        for(int i=2;i<=n;i++)
        {
            temp = (2*i-1)*i;
            count =( count * temp ) % MOD;

        }
        return (int) count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number:- ");
        int num = sc.nextInt();
        sc.close();

        int result = Count(num);
        System.out.println("Count All Valid Pickup And Delivery Options:- ");
        System.out.println("Output- "+result);
    }
}