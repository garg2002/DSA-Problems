import java.util.Scanner;

/**
 * Solution
 */
public class Solution {

    public static void frequencyCount(int arr[], int N, int P)
    {
        int[] freq=new int[N];
        
        for(int i=0;i<N;i++){
            if(arr[i]<=N){
                freq[arr[i]-1]++;
                
            }
        }
        
        for(int i=0;i<N;i++){
            arr[i]=freq[i];
        }

        System.out.println("Output:-");
        for(int i=0;i<N;i++){
            System.out.println(arr[i]);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        frequencyCount(arr, n, p);
        sc.close();
    }
}