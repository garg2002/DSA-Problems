import java.util.*;

public class Solution{
    static int isPerfectNumber(long N) {
        long sum=1;
        for(long i=2;i<=Math.sqrt(N);i++)
        {
            if(N%i==0)
            {
                sum+=i;
            }
        }
        if(sum==1) return 0;
        
        if(N%sum==0)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:- ");
        long num = sc.nextLong();
        sc.close();

        int result = isPerfectNumber(num);
        int ans = result==1?1:0;
        System.out.println("Result:-"+ ans);

    }
}