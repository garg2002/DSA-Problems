import java.util.*;
public class Solution {

    public static boolean checkRotation(String s1, String s2){
        if (s1 == null || s2 == null) return false;
        if (s1.length() != s2.length()) return false;
        String s3 = s1 + s1;
        return s3.contains(s2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();
        // Checking the rotation of string 1 in string 2
        System.out.println(checkRotation(s1, s2));
    }
}
