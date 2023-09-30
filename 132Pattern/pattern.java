import java.util.Scanner;
import java.util.Stack;

/**
 * pattern
 */
public class pattern {

    public static boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < third) return true;
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                third = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int n = sc.nextInt();
         System.out.println("Enter the element of an array:-");
        int [] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean res = find132pattern(arr);
         System.out.print(res);
         sc.close();
    }
}