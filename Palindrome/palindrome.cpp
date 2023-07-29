#include <iostream>
using namespace std;
bool isPalindrome(int x);
int main()
{
    int x;
    cout << "Enter the number: ";
    cin >> x;
    if (isPalindrome(x))
    {
        cout << "The number is palindrome";
    }
    else
    {
        cout << "The number is not palindrome";
    }
    return 0;
}
bool isPalindrome(int x)
{

    int temp = x;
    int rev;
    long int sum = 0;
    if (x < 0)
    {
        return false;
    }
    while (temp > 0)
    {

        rev = temp % 10;
        sum = sum * 10 + rev;
        temp /= 10;
    }
    if (x == sum)
    {
        return true;
    }
    else
    {
        return false;
    }
}