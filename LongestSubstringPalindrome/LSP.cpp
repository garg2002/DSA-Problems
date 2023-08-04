#include<iostream>
using namespace std;
int main()
{
    string str = "cbbd";

    int n = str.length();
    int dp[n][n];


    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            dp[i][j] = 0;
        }
    }

    for(int i=0;i<n;i++)
    {
        dp[i][i] = 1;
    }

    int start = 0;
    int maxLen = 1;

    for(int i=0;i<n-1;i++)
    {
        if(str[i] == str[i+1])
        {
            dp[i][i+1] = 1;
            start = i;
            maxLen = 2;
        }
    }

    for(int k=3;k<=n;k++)
    {
        for(int i=0;i<n-k+1;i++)
        {
            int j = i+k-1;

            if(dp[i+1][j-1] && str[i] == str[j])
            {
                dp[i][j] = 1;

                if(k > maxLen)
                {
                    start = i;
                    maxLen = k;
                }
            }
        }
    }

    cout<<str.substr(start,maxLen)<<endl;

}