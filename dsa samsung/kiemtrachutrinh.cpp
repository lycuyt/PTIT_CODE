#include<bits/stdc++.h>
using namespace std;
int n,m, u;
vector<int>ke[10005];
int vs[10005];
int par[10005];
bool DFS(int u){
    vs[u]=1;
    for(int v: ke[u]){
        if(vs[v]==0 ){
            par[v]=u;
           if(DFS(v)) return true;
        }else if( v!=par[u]){
            return true;
        }
    }
    return false;
}
void check(){
    for(int i=1;i<=n;i++){
        if(vs[i]==0){
            if(DFS(i)){
                cout<<"YES";
                return;
            }
        }
    }
    cout<<"NO";
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
        check();
        cout<<endl;
    }
}