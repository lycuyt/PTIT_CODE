#include<bits/stdc++.h>
using namespace std;
int cnt=0;
void Try(int n, int step)
{
    if(step>cnt) return;
    if(n==1){
        cnt=min(cnt,step);
        return;
    }
    if(n%3==0) Try(n/3,step+1);
    if(n%2==0) Try(n/2,step+1);
    if(n>=1) Try(n-1,step+1);
}
void solve()
{
    int n;
    cin>>n;
    cnt=INT_MAX;
    Try(n,0);
    cout<<cnt<<endl;
}
void Test()
{
    int t;
    cin>>t;
    while(t--)
    {
        solve();
    }
}
int main()
{
    Test();
}