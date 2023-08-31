import java.util.*;

public class NumberOfOpenTaps {
    public static int minTaps(int n, int[] ranges) {
        int min = 0, max = 0, count = 0; 
        while (max < n) { 
            for (int i = 0; i < ranges.length; i++) {
                
                if (i - ranges[i] <= min && i + ranges[i] >= max) {
                    max = i + ranges[i]; 
                }
            }
            if (max == min) return -1; 
            count++;
            min = max;
        }
        return count; 
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] ranges = new int[m];

        for(int i=0;i<m;i++)
        {
            ranges[i]=sc.nextInt();
        }
        int n = sc.nextInt();
        sc.close();

        int result = minTaps(n, ranges);
        
        //Minimum Number of taps to open a water a Garden
        System.out.println(result);
    }
}
