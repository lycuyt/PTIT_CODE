
#include<bits/stdc++.h>
using namespace std;
int n,m;
vector<int>ke[1005];
int vs[1005];
int h;
int k;
void DFS(int u){
    // cout<<u<<" ";
    vs[u]=1;
    for(auto v: ke[u]){
        if(vs[v]==0 ){
            DFS(v);
        }
    }
}
int tpltdfs()
{
    k=0;
    
    for(int u=1;u<=n;u++)
    {
        if(vs[u]==0){
            k++;
            DFS(u);
        }
    }
    return k;

}
void xetcacdinh()
{
    
    for(int i=1;i<=n;i++)
    {
        memset(vs,0,sizeof(vs));
        vs[i]=1;
        int dem=0;
        int l= tpltdfs();
        if(l> h) cout<<i<<" ";
    }   
}
int main()
{
    int t;cin>>t;
    while(t--)
    {
        cin>>n>>m;
        for(int i=1;i<=n;i++){
            vs[i]=0;
            ke[i].clear();
        }
        for(int i=0;i<m;i++){
            int u, v;
            cin>>u>>v;
            ke[v].push_back(u);
            ke[u].push_back(v);
        }
        h=tpltdfs();
        xetcacdinh();
        cout<<endl;
    }
}