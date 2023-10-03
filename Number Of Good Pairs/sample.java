import java.util.Scanner;

public class sample {
    public static int numIdenticalPairs(int []arr)
    {
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int res = numIdenticalPairs(arr);
        System.out.println(res);
        sc.close();
    }
}
