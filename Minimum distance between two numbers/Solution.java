import java.util.*;
public class Solution {
    static int  abs(int x, int y) {
        if(x>y)
           return x-y;
        return y-x; 
    }
    int minDist(int a[], int n, int x, int y) {
        // code here
        int min=Integer.MAX_VALUE, ix=-1, iy=-1; 
        for(int i=0; i<n; i++) {
            if(a[i]==x)
               ix=i; 
            if(a[i]==y)
             iy=i;
             if(ix!=-1&&iy!=-1)
              min = Math.min(min,abs(ix,iy));
              
        }
        if(min!=Integer.MAX_VALUE)
            return min; 
        
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N :- ");
        int n = sc.nextInt();
        System.out.println("Enter the value of array :- ");
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        System.out.println("Enter the value of x and y :- ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Solution obj = new Solution();
        sc.close();
        System.out.print("Minimum distance between "+x+" and "+y+": " +obj.minDist(a, n, x, y));
        
    }
}
