#include<iostream>
using namespace std;

int RearrangingElements(int arr[], int n)
{
    int ans[n];
    int positive =0;
    int negative = 1;
    for(int i=0;i<n;i++)
    {
        if(arr[i]<0)
        {
            ans[negative] = arr[i];
            negative = negative + 2;
        }
        else
        {
            ans[positive] = arr[i];
            positive = positive + 2;
        }
    }
    for(int i=0;i<n;i++)
    {
        cout<<ans[i]<<" ";
    }
    return 0;
    
}
int main()
{
    int n;
    cout<<"Enter the size of array: ";
    cin>>n;
    int arr[n];

    cout<<"Enter the elements of array: ";
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
       
     RearrangingElements(arr, n);
    
    return 0;
}