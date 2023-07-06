#include<bits/stdc++.h>
using namespace std;
int check( string s){
    for(int i=0;i<s.size();i++){
        if(s[i]=='1') return 0;
    }
    return 1;
}
int main()
{
    int t;cin>>t;
    while(t--)
    {
        string s;cin>>s;
        int len = s.size();
        if(check(s)){
            for(int i=0;i<len;i++) cout<<1;
            cout<<endl;
        }else{
            if(s[len-1]=='1'){
                s[len-1]='0';
                cout<<s<<endl;
            }else{
                int i=len-1;
                while(s[i]=='0'&& i>=0)
                {
                    s[i]='1';
                    i--;
                }
                s[i]='0';
                cout<<s<<endl;
            }
        }
        
    }
}