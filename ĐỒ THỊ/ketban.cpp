#include<bits/stdc++.h>
using namespace std;
int n, m;
int parent[100005];
int sz[100005];
void make_set()
{
    for(int i=1;i<=n;i++) {
        parent[i]=i;
        sz[i]=1;
    }
}
int find(int v)
{
    if(v==parent[v]) return v;
    return parent[v]=find(parent[v]);
}
int res=0;
void Uni(int c, int d)
{
    int a=find(c);
    int b=find(d);
    if(a != b)
    {
        if(sz[a]<sz[b]) swap(a,b);

        parent[b]=a;
        sz[a]+=sz[b];
        res=max(sz[a],res);
    }
    
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        res=0;
        cin>>n>>m;
        make_set();
        
        for(int i=1;i<=m;i++)
        {
            int x,y;
            cin>>x>>y;
            Uni(x,y);
        }
        cout<<res<<endl;
        // int Max=0;
        // for(int i=1;i<=n;i++)
        // {
        //     Max=max(Max,sz[parent[i]]);
        // }
        // cout<<Max<<endl;
        
    }
}
