#include<bits/stdc++.h>
using namespace std;
int n,p,s;
int m;
int prime[205];
int x[205];
int a[205];
void sang()
{
    for(int i=0;i<=200;i++) prime[i]=1;
    prime[0]=0;
    prime[1]=0;
    for(int i=2;i<=sqrt(200);i++)
    {
        if(prime[i])
        {
            for(int j=i*i;j<=200;j=j+i)
            {
                prime[j]=0;
            }
        }
    }
}
int cnt=0;
vector<vector<int>> v;
void Try(int i,int sum, int limit, vector<int> c)
{
    if(i>n) return;
    if(sum> s) return;
    if(i==n && sum==s){
        cnt++;
        v.push_back(c);
    }

    for(int j=i;j<m;j++){
        if(sum+a[j]<=s && a[j]>limit){
            c.push_back(a[j]);
            Try(i+1,sum+a[j],a[j],c);
            c.pop_back();
        }
    }

}
// co n chu so, lon hon 7 va tong bang 28
int main()
{
    sang();
    int t;
    cin>>t;
    while(t--)
    {
        cin>>n>>p>>s;
        int j=1;
        cnt=0;
        v.clear();
        for(int i=p+1;i<=s ;i++){
            if(prime[i]==1){
                a[j]=i;
                j++;
            }
        }
        // mang a chua cac so nguyen to co the, mang a co m chu so
        m=j-1;
        vector<int> c;
        Try(0,0,0,c);
        cout<<cnt<<endl;
        for(int i=0;i<v.size();i++)
        {
            for(int j=0;j<v[i].size();j++){
                cout<<v[i][j]<<" ";
            }
            cout<<endl;
        }
        
    }
}