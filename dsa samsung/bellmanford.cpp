#include<bits/stdc++.h>
using namespace std;
// dung thuat toan bellman ford
int n,m, u;
struct canh
{
    int x, y, w;
    /* data */
};
int d[1005];
struct canh a[100005];
void bellman_ford(int u){
    for(int i=1;i<=n;i++){
        d[i]=INT_MAX;
    }
    d[u]=0;
    for(int i=1;i<=n-1;i++){
        for(int j=1;j<=m;j++){
            int u= a[j].x;
            int v= a[j].y;
            int we= a[j].w;
            if(d[u]!= INT_MAX && d[u]+we<d[v]){
                d[v]=d[u]+we;
            }
        }
    }
    for(int i=1;i<=n;i++){
        int u= a[i].x;
        int v= a[i].y;
        int we= a[i].w;
        if(d[u]!=INT_MAX && d[u]+we<d[v]){
           cout<<"-1"<<endl;
            return;
        }
    }
    for(int i=1;i<=n;i++){
        if(d[i]!=INT_MAX) cout<<d[i]<<" ";
        else cout<<"INFI"<<" ";
    }
        cout<<endl;
}
int main()
{
    int t;cin>>t;
    while(t--)
    {
        cin>>n>>m>>u;
       
        for(int i=1;i<=m;i++){
            int u, v,k;
            cin>>u>>v>>k;
            a[i].x=u;
            a[i].y=v;
            a[i].w=k;
        }
        bellman_ford(u);
    }
} 