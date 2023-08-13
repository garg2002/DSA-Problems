import java.util.Scanner;
public class POW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and power");
        int num = sc.nextInt();
      boolean res = (isPowerOfTwo(num));
        System.out.println("The result is " + res);
        sc.close();
    }
     public static boolean isPowerOfTwo(int n) {
      if(n<1)
      {
          return false;
      }  
      if(n==1)
      {
          return true;
      }
      if(n%2==1)
      {
          return false;
      }
      return (isPowerOfTwo(n/2));
    }
}