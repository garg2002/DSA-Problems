/**
 * Solution
 */
import java.util.*;
public class Solution {

        public static int knapSack(int N, int W, int val[], int wt[])
        {
            int[] dp = new int[W + 1];
            
            for(int i=1;i<=W;i++)
            {
                for(int j=0;j<N;j++)
                {
                    if(wt[j]<=i)
                    {
                        dp[i] = Math.max(dp[i], dp[i-wt[j]]+val[j]);
                    }
                }
            }
            return dp[W];
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of inputs:- ");
        int N = sc.nextInt();
        System.out.println("Enter the number of weights:- ");
        int W = sc.nextInt();

        int wt[] = new int[N];
        for (int i = 0; i < wt.length; i++) {
            wt[i] = sc.nextInt();
        }
        int val[] = new int[N];
        for (int i = 0; i < val.length; i++) {
            val[i] = sc.nextInt();
        }

        int res = knapSack(N, W, val, wt);
        System.out.println("Maximum value that can be put in a knapsack of capacity " + W + " is: "+res);
         sc.close();
        
    }
}