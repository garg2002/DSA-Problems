
public class Remove_Element {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 2, 3};
        int val = 3;

        int result = removeElement(nums, val);
        System.out.println(result);
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;

        while (j < nums.length) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }

            j++;
        }

        return i;
    }
}