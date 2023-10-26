import java.util.*;
class Solution
{
    public static int minOperation(int n)
    {
       int count= 0;
       while(n>0){
           if (n%2==1){
               n=n-1;
               count++;
           }
           
           else if (n%2==0){
               n=n/2;
               count++;
           }
           
       }
       return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of inputs:- ");
        int n = sc.nextInt();
        System.out.println("Minimum operations required:- ");
        System.out.println(minOperation(n));
        sc.close();
    }
}
