#include<bits/stdc++.h>
using namespace std;
int n,m, u, v;
vector<int>ke[1005];
int vs[1005];
int e[1005];
void BFS(int u){
    queue<int> q;
    q.push(u);
    
    while(q.size()>0){
        int v= q.front();
        q.pop();
        // cout<<v<<" ";
        vs[v]=1;
        for(int i=0;i<ke[v].size();i++){
            if(vs[ke[v][i]]==0){
                q.push(ke[v][i]);
                e[ke[v][i]]=v;
                vs[ke[v][i]]=1;
            }
        }
    }
}
void path(int u, int v){
    BFS(u);
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