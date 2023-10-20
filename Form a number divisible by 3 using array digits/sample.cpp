#include<iostream>
using namespace std;

int isPossible(int N, int arr[]) {
            long sum=0;
            for(int i=0;i<N;i++){
                sum=sum+arr[i];
            }
            if(sum%3==0){
                return 1;
            }
            else{
                return 0;
            }
    }
int main()
{
    int n;
    cout<<"Enter any number: ";
    cin>>n;
    int arr[n];
    cout<<"Array Elements are: ";
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    
    int res = isPossible(n,arr);
    cout<<"Result= "<<res;
    return 0;
}