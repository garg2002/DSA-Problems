#include<iostream>
using namespace std;
int kadane(int arr[],int n)
{
    int max_sum=0;
    int curr_sum=0;
    for(int i=0;i<n;i++)
    {
        curr_sum+=arr[i];
        if(curr_sum<0)
        {
            curr_sum=0;
        }
        max_sum=max(max_sum,curr_sum);
    }
    
    return max_sum;
}
int main()
{
    int n;
    cin>>n;
    int arr[n];
    int max_sum=0;
    int curr_sum=0;
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }

    //kadane's algorithm for maximum subarray sum

   int result= kadane(arr,n);
   cout<<result;
    return 0;
}
