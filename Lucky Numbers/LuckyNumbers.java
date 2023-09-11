import java.util.Scanner;

public class LuckyNumbers {

    public static int Solve(int n)
    {
        int x = 2;
        
        while(x <= n){
            if(n % x == 0)
                return 0;
                
            n -= n / x;
            x++;
        }
        
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int num = sc.nextInt();
        sc.close();
        int result = Solve(num);
        
        System.out.println((result == 1 ? true : false));
    }
}
