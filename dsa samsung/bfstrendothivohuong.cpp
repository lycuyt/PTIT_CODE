#include<bits/stdc++.h>
using namespace std;
int n,m, u;
vector<int>ke[1005];
int vs[1005];
void BFS(int u){
    queue<int> q;
    q.push(u);
    
    while(q.size()>0){
        int v= q.front();
        q.pop();
        cout<<v<<" ";
        vs[v]=1;
        for(int i=0;i<ke[v].size();i++){
            if(vs[ke[v][i]]==0){
                q.push(ke[v][i]);
                
                vs[ke[v][i]]=1;
            }
        }
    }
}
int main()
{
    int t;cin>>t;
    while(t--)
    {
        cin>>n>>m>>u;
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
        BFS(u);
        cout<<endl;
    }
}