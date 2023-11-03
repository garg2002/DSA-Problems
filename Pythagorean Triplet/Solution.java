import java.util.*;
public class Solution {

     static boolean  checkTriplet(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();
         
            
            for(int i = 0 ; i<n ; i++){
                arr[i] = arr[i] * arr[i];
                set.add(arr[i]);
            }
            
            for(int i = 0 ; i<n-1 ; i++){
                for(int j = 0 ; j<n ; j++){
                
                int sum = arr[i] + arr[j];
                
                    if(set.contains(sum)){
                        return true;
                    }
                }    
            }
            
            return false;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean res = checkTriplet(arr,n);
        sc.close();
        if (res == true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
    }
}
