#include<iostream>
#include<string.h>
using namespace std;

int main()
{
    string str = "(()())(())(()(()))";
    int count = 0;
    int n = str.length();

    string res = "";

    for(int i = 0; i < n; i++)
    {
        if(str[i] == '(' && count == 0)
            count++;
        else if(str[i] == '(' && count >=1)
        {
            res += str[i];
            count++;
        }
        else if(str[i] == ')' && count > 1)
        {
            res += str[i];
            count--;
        }
        else if(str[i] == ')' && count == 1)
            count--;
    }
    cout<<res;
    
}