#include <iostream>
using namespace std;
int main()
{
    int n ;
    cout<<"Enter the number:-";
    cin>>n;
    cout<<endl;
    int arr[n];
    cout<<"Enter the Elements of an array :-"<<endl;

    for (int  i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    
    cout<<endl;


    //Wave form of above array*****

    for(int i=0;i<n;i+=2)
    {
        if(i<n-1)
        {
            swap(arr[i], arr[i+1]);
        }
    }

    cout<<"Wave form of an array -"<<endl;
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }

    return 0;
}

    