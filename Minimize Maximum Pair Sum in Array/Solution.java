import java.util.Arrays;
public class Solution {
    public int minPairSum(int[] nums) {
       // Step 1: Sort the array in ascending order
        Arrays.sort(nums);

        // Step 2: Initialize pointers at the start and end of the sorted array
        int left = 0, right = nums.length - 1;

        // Step 3: Initialize a variable to store the minimum of the maximum pair sum
        int minMaxPairSum = Integer.MIN_VALUE;

        // Step 4: Iterate until the pointers meet
        while (left < right) {
            // Step 5: Calculate the current pair sum
            int currentPairSum = nums[left] + nums[right];

            // Step 6: Update the minimum of the maximum pair sum
            minMaxPairSum = Math.max(minMaxPairSum, currentPairSum);

            // Step 7: Move the pointers towards the center
            left++;
            right--;
        }

        // Step 8: Return the minimum of the maximum pair sum
        return minMaxPairSum;
    }
    public static void main(String[] args) {
        int[] nums = {3, 5, 4, 2, 4, 6};
        int minMaxPairSum = new Solution().minPairSum(nums);
        System.out.println("The minimum max pair sum is " + minMaxPairSum);
        
    }
}