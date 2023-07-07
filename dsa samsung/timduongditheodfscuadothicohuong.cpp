#include<bits/stdc++.h>
using namespace std;
int n,m, u, v;
vector<int>ke[1005];
int vs[1005];
int e[1005];
void DFS(int u){
    // cout<<u<<" ";
    vs[u]=1;
    for(auto v: ke[u]){
        if(vs[v]==0 ){
            DFS(v);
            e[v]=u;
        }
    }
}
void path(int u, int v){
    DFS(u);
    if(vs[v]==1){
        int t=v;
        vector<int>d;
        while(t>0){
            d.push_back(t);
            t=e[t];
        }
        for(int j= d.size()-1;j>=0;j--) cout<<d[j]<<" ";
    }else{
        cout<<-1;
    }
}
int main()
{
    int t;cin>>t;
    while(t--)
    {
        cin>>n>>m>>u>>v;
        for(int i=1;i<=n;i++){
            vs[i]=0;
            ke[i].clear();
            e[i]=0;
        }
        for(int i=0;i<m;i++){
            int u, v;
            cin>>u>>v;
            // ke[v].push_back(u);
            ke[u].push_back(v);
        }
        path(u, v);
        cout<<endl;
    }
}