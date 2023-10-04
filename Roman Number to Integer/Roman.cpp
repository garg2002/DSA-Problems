#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int romanToDecimal(string &str) {
         int res{0};
        map<char,int> mp;
        mp['I']=1;
        mp['V']=5;
        mp['X']=10;
        mp['L']=50;
        mp['C']=100;
        mp['D']=500;
        mp['M']=1000;
        
        res = mp[str[str.size()-1]];
        for(int i{str.size()-1}; i > 0;i--){
            if(mp[str[i-1]] < mp[str[i]])
                res -= mp[str[i-1]];
            else
                res += mp[str[i-1]];
        }
        return res;
    }

int main()
{
    string str;
    cout<<"Enter a string in Roman Number:- ";
    cin>>str;
    int res = romanToDecimal(str);
    cout<<"Result:-"<<res;

}