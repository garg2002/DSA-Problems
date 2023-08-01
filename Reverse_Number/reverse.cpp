#include <iostream>
using namespace std;

int reverse(int n)
{
    int rev = 0;
    while (n)
    {
        rev = rev * 10 + n % 10;
        n /= 10;
    }

    if(rev < INT64_MIN || rev > INT64_MAX)
        return 0;
    else
        return rev;
    
}
int main()
{
    int n;
    cout << "Enter a number: ";
    cin >> n;

    int result =reverse(n);
    cout << result << endl;

    return 0;
}