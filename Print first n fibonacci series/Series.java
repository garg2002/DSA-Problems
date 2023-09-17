import java.util.*;
public class Series {

    public static long[] Fibonacci(int n) 
    {
          if(n == 1){
            long[] fib = {1};
            return fib;
        }
        
        long[] temp=new long[n];
        temp[0]=1;
        temp[1]=1;
        for(int i=2;i<n;i++)
        {
            temp[i] = temp[i-1]+temp[i-2];
            
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n = sc.nextInt();
        sc.close();
        long [] res =Fibonacci(n);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
        System.out.println();

    }
}
