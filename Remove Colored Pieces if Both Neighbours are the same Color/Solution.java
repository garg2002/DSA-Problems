import java.util.Scanner;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        int countA = 0;
        int countB = 0;
        for (int i = 1; i < colors.length() - 1; i++) {
            if (colors.charAt(i - 1) == colors.charAt(i) && colors.charAt(i) == colors.charAt(i + 1)) {
                if (colors.charAt(i) == 'A') {
                    countA++;
                } else {
                    countB++;
                }
            }
        }
        return countA > countB;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        boolean res = winnerOfGame(str);
        System.out.println(res);
        obj.close();

    }
}