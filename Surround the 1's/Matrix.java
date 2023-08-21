import java.util.Scanner;

public class Matrix
{
    public static int CountZero(int arr[][])
    {
        int n=arr.length;
        int m=arr[0].length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int flag =0;

                if(arr[i][j]==1)
                {
                    if(i-1>=0 && arr[i-1][j]==0)
                    {
                        flag++;
                    }
                    if(i+1<n && arr[i+1][j]==0)
                    {
                        flag++;
                    }
                    if(j-1>=0 && arr[i][j-1]==0)
                    {
                        flag++;
                    }
                    if(j+1<m && arr[i][j+1]==0)
                    {
                        flag++;
                    }

                    if(i-1>=0 && j-1>=0 && arr[i-1][j-1]==0)
                    {
                        flag++;
                    }
                    if(i-1>=0 && j+1<m && arr[i-1][j+1]==0)
                    {
                        flag++;
                    }
                    if(i+1<n && j-1>=0 && arr[i+1][j-1]==0)
                    {
                        flag++;
                    }
                    if(i+1<n && j+1<m && arr[i+1][j+1]==0)
                    {
                        flag++;
                    }

                }
                if(flag>0 && flag%2==0)
                {
                    count++;
                }

            }

        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("Enter the elements of the matrix: ");
        int arr[][] = new int[row][col];
        int i,j;
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print the matrix
        System.out.println("The matrix is: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // Count the number of 0's
        System.out.println("Result:");
        int res = CountZero(arr);
        System.out.println(res);
    }
}