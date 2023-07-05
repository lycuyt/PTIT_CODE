#include<bits/stdc++.h>
using namespace std;
int n;
int a[16];
vector<int> v;
vector<vector<int> > res;
int prime[2001];
//sang so nguyen to
void sang()
{
    for(int i=0;i<=2000;i++) prime[i]=1;
    prime[0]=0;
    prime[1]=0;
    for(int i=2;i<=sqrt(2000);i++)
    {
        if(prime[i]==1){
            for(int j=i*i;j<=2000;j=i+j)
            {
                prime[j]=0;
            }
        }
    }
}
void Try(int i, int s)
{
    for(int j=i;j<n;j++)
    {
        v.push_back(a[j]);
        s+=a[j];
        if(prime[s]==1)
        {
            res.push_back(v);
        }
        if(j+1<n) Try(j+1,s);
        v.pop_back();
        s-=a[j];
    }
}
bool cmp(int a, int b)
{
    return a>b;
    }
int main()
{
    sang();
    // for(int i=0;i<10;i++) cout<<prime[i]<<" ";
    int t;
    cin>>t;
    while(t--)
    {
        res.clear();
        v.clear();
        cin>>n;
        for(int i=0;i<n;i++) cin>>a[i];
        sort(a,a+n,cmp);
        Try(0,0);
        sort(res.begin(),res.end());
        // cout<<res.size();
        for(int i=0;i<res.size();i++)
        {
            for(int j=0;j<res[i].size();j++)
            {
                cout<<res[i][j]<<" ";
            }
            cout<<endl;
        }
       
    }
}