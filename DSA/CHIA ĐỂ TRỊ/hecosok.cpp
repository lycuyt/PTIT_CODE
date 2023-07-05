#include<bits/stdc++.h>
using namespace std;
void solve(int k, string a, string b){
    
    while(a.size()<b.size())
    {
        a="0"+a;
    }
    while(b.size()<a.size()){
        b="0"+b;
    }
    int len=a.size();
    int nho=0;
    string res="";
    for(int i=len-1;i>=0;i--){
        int tong=a[i]-'0'+b[i]-'0'+nho;
        int so=tong%k;
        res=char(so+'0')+res;
        nho=tong/k;
    }
    if(nho>0) res=char(nho+'0')+res;
    cout<<res<<endl;
}
int main()
{
    int t;
    cin>>t;
    while (t--)
    {
        int k;
        string a, b;
        cin>>k>>a>>b;
        solve(k,a,b);
        /* code */
    }
    
}