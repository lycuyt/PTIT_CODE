#include<bits/stdc++.h>
using namespace std;
vector<string> res;
void chuyen(int n, char a, char b)
{
    // cout<<a<<b<<endl;
    string s="";
    s+=a;
    s+=b;
    res.push_back(s);
}
void tower1(int n, char a, char b, char c){
    if (n==1) {
        chuyen(1, a, c);
        chuyen(1, a, c);
    }
    else{
        tower1(n-1, a, c, b);
        chuyen(1, a, c);
        chuyen(1, a, c);
        tower1(n-1, b, a, c);
    }
}
int main()
{
    int n;
    cin>>n;
    n=n/2;
    char a='A', b='B', c='C';
    tower1(n, a, b, c);
    cout<<res.size()<<endl;
    for ( string x: res) cout<<x<<endl;
}