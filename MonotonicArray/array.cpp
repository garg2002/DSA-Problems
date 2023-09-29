#include<iostream>
using namespace std;
int Monotonic(int nums[], int n)
{   
    bool inc = true;
        bool dec = true;
       for(int i=1;i<n;i++)
       {
           if(nums[i]>nums[i-1]) 
            dec = false;
           else if(nums[i]<nums[i-1])
            inc = false; 
        
            if(!inc && !dec)
                return false;
       } 
       return true;
}
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

    //Monotonic Array
    bool res = Monotonic(arr,n);
    if(res==true){
        cout << "The given array is monotonic";
    }
    else{
        cout <<"The given array is not monotonic";
    }
    

    return 0;
}