import java.util.Scanner;

public class Solution {
    public int getWinner(int[] A, int k) {
        int cur = A[0];
        int win = 0;
        
        for (int i = 1; i < A.length; ++i) {
            if (A[i] > cur) {
                cur = A[i];
                win = 0;
            }
            if (++win == k) {
                break;
            }
        }
        
        return cur;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array and k: ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution s = new Solution();
        sc.close();
        System.out.println("The winner is: ");
        System.out.println(s.getWinner(arr, k));
    }
}