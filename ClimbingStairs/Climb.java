import java.util.Scanner;

public class Climb {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int ans = climbStairs(n,arr);
        System.out.println(ans);
        sc.close();
    }

    public static int climbStairs(int n, int arr[]) {
        if( n <= 1) return 1;
        if(arr[n] > 0) return arr[n];

        int ans = climbStairs(n-1,arr) + climbStairs(n-2,arr);
        arr[n] = ans;
        return ans;
        
        
    }
}
