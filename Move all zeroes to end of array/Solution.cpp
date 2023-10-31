#include <iostream>
using namespace std;

void moveZeroToEnd(int arr[], int n)
{
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] != 0)
        {
            swap(arr[i], arr[count]);
            count++;
        }
    }
}
int main()
{
    int n;
    cout<<"Enter the number:-";
    cin >> n;
    int arr[n];
    cout<<"Enter the elements:-";
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
   moveZeroToEnd(arr, n);
    cout<<"After moving all zero to end:-";
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
}