import java.util.*;
public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<nums.length;i++)
        {
            sb.append(nums[i].charAt(i) == '0'? "1": "0");
        }
        return new String(sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
        int n = sc.nextInt();
        String[] nums = new String[n];
        System.out.println("Enter the strings: ");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.next();
        }
        sc.close();
        String res = findDifferentBinaryString(nums);
        System.out.println("The different binary string is : "+res);
        System.out.println(res);
    }
}