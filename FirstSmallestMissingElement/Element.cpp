#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"Enter the size of the array: ";
    cin>>n;
    int arr[n];;
    cout<<"Enter the elements of the array: ";
    for(int i=0;i<n;i++)
        cin>>arr[i];
    int i=0;
    while(i<n)
    {
        if(arr[i]>0 && arr[i]<=n && arr[i]!=arr[arr[i]-1])
            swap(arr[i],arr[arr[i]-1]);
        else
            i++;
    }
    for(int i=0;i<n;i++)
    {
        if(arr[i]!=i+1)
        {
            cout<<"The smallest missing element is: "<<i+1;
            break;
        }
    }
    return 0;
}