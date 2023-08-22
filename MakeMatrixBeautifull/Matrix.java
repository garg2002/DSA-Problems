import java.util.Scanner;

public class Matrix
{
    public static int MakeMatrixBeautiful(int[][] arr, int n)
    {
        int answer =0;
        for(int i =0; i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                answer = answer + arr[i][j];
            }
        }

        int rowsum = 0;
        int colsum =0;

        for(int i=0;i<n;i++)
        {
            int a =0;
            for(int j=0;j<n;j++)
            {
                a = a + arr[i][j];
            }
            rowsum = Math.max(rowsum, a);

            int b =0 ;
            for(int j=0;j<n;j++)
            {
                b = b + arr[j][i];
            }
            colsum = Math.max(colsum, b);
        }
        int maximum = Math.max(rowsum, colsum);
        
        return maximum*n- answer;
    }
    public static void main (String  args[])
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

        
        System.out.println("Result:");
        int res = MakeMatrixBeautiful(arr, row);
        System.out.println(res);
    }
}
