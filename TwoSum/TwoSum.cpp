/*Objective: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]

Output: Because nums[0] + nums[1] == 9, we return [0, 1].

*/
#include <iostream>
using namespace std;
int TwoSum(int arr[], int n, int target)
{
    int i = 0, j = n - 1;
    while (i < j)
    {
        if (arr[i] + arr[j] == target)
        {
            cout << i << " " << j << endl;
            return 1;
        }
        else if (arr[i] + arr[j] < target)
            i++;
        else
            j--;
    }
    return 0;
}
int main()
{
    int n, target;
    cin >> n >> target;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];

   TwoSum(arr, n, target);
    return 0;
}