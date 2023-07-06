#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        int len= s.size();
        int i=len-1;
        while(s[i]=='1' && i>=0){
            s[i]='0';
            i--;
        }
        if(i>=0) s[i]='1';
        for(int i=0;i<s.size();i++){
            cout<<s[i];
        }
        cout<<endl;
    }
}