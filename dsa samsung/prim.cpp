#include<bits/stdc++.h>
using namespace std;
struct canh{
    int x, y,w;
};
int n, m;
vector<pair<int,int>> adj[105];
bool used[105];
int parent[105], d[105];
void nhap()
{
    cin>>n>>m;
    for(int i=1;i<=n;i++){
        adj[i].clear();
    }
    for(int i=0;i<m;i++){
        int x, y,w;
        cin>>x>>y>>w;
        adj[x].push_back({y,w});
        adj[y].push_back({x,w});
    }
    
}
void prim(int u){
    memset(used, false, sizeof(used));
    for(int i=1;i<=n;i++) d[i]=INT_MAX;
    priority_queue<pair<int,int>, vector<pair<int,int>>, greater<pair<int,int>>> q;
    vector<canh> mst;
    int res=0;
    q.push({0,u});
    while(!q.empty())
    {
        pair<int, int> top= q.top();q.pop();
        int dinh= top.second;
        int trongso= top.first;
        if(used[dinh]) continue;
        res+=trongso;
        used[dinh]=true;
        if(u != dinh) {
            mst.push_back({dinh, parent[dinh], trongso});
        }
        for ( auto it : adj[dinh])
        {
            int y= it.first;
            int w= it.second;
            if( !used[y] && w<d[y])
            {
                q.push({w,y});
                d[y]=w;
                parent[y]=dinh;
            }
        }

    }
    cout<< res<<endl;
    // for ( auto it : mst){
    //     cout<<it.x<<" "<<it.y<<" "<<it.w<<endl;
    // }
}
int main()
{
    int t;cin>>t;
    while(t--)
    {
        nhap();
        prim(2);
        
    }
}