#include <iostream>
#include <vector>
using namespace std;

string convert(string s, int numRows)
{
    if (numRows <= 1)
        return s;
    vector<string> v(numRows, "");

    int j = 0;

    for (int i = 0; i < s.length(); i++)
    {

        if (j == numRows - 1 || j == 0)
        {
            j++;
        }
        else
        {
            j--;
        }

        v[j] += s[i];
    }

    string res;

    for (auto &it : v)
        res += it;

    return res;
}

int main()
{
    string s = "PAYPALISHIRING";
    int numRows = 4;
    cout << convert(s, numRows) << endl;
    return 0;
}
