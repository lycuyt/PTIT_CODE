#include<bits/stdc++.h>
using namespace std;
int n,m;
vector<int>ke[1005];
int vs[1005];
void DFS(int u){
    // cout<<u<<" ";
    vs[u]=1;
    for(auto v: ke[u]){
        if(vs[v]==0 ){
            DFS(v);
        }
    }
}
void kiemtraduongdi(int u, int v){
    DFS(u);
    if(vs[v]==1) cout<<"YES"<<endl;
    else cout<<"NO"<<endl;
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
        int q;cin>>q;
        while(q--){
            int u, v;
            cin>>u>>v;
            for(int i=1;i<=n;i++){
                vs[i]=0;
            }
            kiemtraduongdi(u,v);
        }
        
        cout<<endl;
    }
}