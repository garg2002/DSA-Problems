#include <iostream>
using namespace std;

// Function to find the first occurrence of the target element

/*
Time Complexity : O(logn)
 Space Complexity O(1)
 */
int binarySearch(int arr[], int n, int target)
{
    int start = 0;
    int end = n - 1;
    int firstOcc = -1;
    while (start <= end)
    {
        int mid = start + (end - start) / 2;
        if (target == arr[mid])
        {
            firstOcc = mid;
            end = mid - 1;
        }
        else if (target < arr[mid])
        {
            end = mid - 1;
        }
        else
        {
            start = mid + 1;
        }
    }
    return firstOcc;
}

int numberOccurrence(int arr[], int n, int target)
{
    int index = binarySearch(arr, n, target);
    int temp = index;
    int count = 0;
    while (temp >= 0 && arr[temp] == target)
    {
        count++;
        temp--;
    }

    temp = index + 1;
    while (temp < n && arr[temp] == target)
    {
        count++;
        temp++;
    }
    return count;
}

int main()
{
    int n;
    cout << "Enter the size of array: ";
    cin >> n;
    int arr[n];
    cout << "Enter the elements of array: ";
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int target;
    cout << "Enter the target element: ";
    cin >> target;
    int max1 = numberOccurrence(arr, n, target);
    cout << "The number " << target << " occurs " << max1 << " times.";
    return 0;
}