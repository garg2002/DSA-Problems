#include<iostream>
using namespace std;

//Lower Bound Function
int lower_bound(int arr[],int n, int key)
{
    int low=0;
    int high = n-1;
    int ans=-1;
    while(low<=high)
    {
        int mid=(low+high)/2;
        if(arr[mid]==key)
        {
            ans=mid;
            high=mid-1;
        }
        else if(arr[mid]>key)
            high=mid-1;
        else
            low=mid+1;
    }
    return ans;
}

//Upper Bound Function
int upper_bound(int arr[],int n, int key)
{
    
    int low=0;
    int high = n-1;
    int ans=-1;
    while(low<=high)
    {
        int mid=(low+high)/2;
        if(arr[mid]==key)
        {
            ans=mid;
            low=mid+1;
        }
        else if(arr[mid]>key)
            high=mid-1;
        else
            low=mid+1;
    }
    return ans;
}

//Main Function
int main()
{
    int n,key;
    cin>>n>>key;
    int arr[n];
    for(int i=0;i<n;i++)
        cin>>arr[i];
    
    int result[2];
    result[0] = lower_bound(arr,n,key); 
    result[1] = upper_bound(arr,n,key);

    cout<<result[0]<<" "<<result[1]<<endl;
}