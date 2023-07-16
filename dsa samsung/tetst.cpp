#include<bits/stdc++.h>
using namespace std;
void check(vector<char> a, vector<char> b)
{
    for(int i=0;i<a.size();i++){
        if(a[i]!=b[i]) {
            cout<<"NO"<<endl;
            return;
        }
    }
    cout<<"YES"<<endl;
}
int main()
{
    string s;cin>>s;
    s="0"+s;
    int q;
    cin>>q;
    while(q--)
    {
        int a, b, c, d;
        cin>>a>>b>>c>>d;
        vector<char> r1;
        vector<char> r2;
        for(int i=a;i<=b;i++){
            r1.push_back(s[i]);
        }
        for(int i=c;i<=d;i++){
            r2.push_back(s[i]);
        }
       sort(r1.begin(),r1.end());
       sort(r2.begin(), r2.end());
        check(r1, r2);
    }
}