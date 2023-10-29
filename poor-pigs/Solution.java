import java.util.Scanner;

class Solution
{
    public static int poorPigs(int buckets, int tdie, int ttest)
    {
        int test = ttest/tdie;
        int i=0;
        while(Math.pow(test+1,i)< buckets)
        {
            i++;
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of buckets:- ");
        int buckets = sc.nextInt();
        System.out.println("Enter the total number of die:- ");
        int tdie = sc.nextInt();
        System.out.println("Enter the total number of test:- ");
        int ttest = sc.nextInt();
        System.out.println("The minimum number of pigs is "+poorPigs(buckets,tdie,ttest));
        
        sc.close();
    }
}