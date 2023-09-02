#include<iostream>
#include <bits/stdc++.h>
#include<cmath>
using namespace std;
int height(int arr[], int n ,int k)
{
    sort(arr, arr+n);
    int max = 0, min = 0;
    int res = arr[n-1]-arr[0];

    for(int i=1;i<n;i++)
    {
        if(arr[i]>=k)
        {
            max = (arr[i-1]+k ) >(arr[n-1]-k) ? (arr[i-1]+k ) : (arr[n-1]-k);
            min = (arr[0]+k) < (arr[i]-k) ? (arr[0]+k) : (arr[i]-k);

            res = (res)>(max-min) ? (max-min) : res;
        }
    }
    return res;
    
}

int main()
{
    int n;
    cout<<"Enter the size of an array:- ";
    cin>>n;
    cout<<"Enter the elements of an array:- "<<endl;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }

    int k ;
    cout<<"Enter the value of k:-";
    cin>>k;

    int ans = height(arr,n,k);

    cout<<"Result:-"<<ans;

    return 0;
}