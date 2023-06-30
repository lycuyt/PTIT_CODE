#include<bits/stdc++.h>
using namespace std;
int n,m,u;
int check=1;
vector<pair<int, int >> res;
int vs[100005];
vector<int> ke[100005];
void BFS(int u){
    queue <int> q;
    q.push(u);
    while(q.size()>0)
    {
        int top=q.front();
        // cout<<top<<endl;
        q.pop();
        vs[top]=1;
        for(int i=0;i<ke[top].size();i++)
        {
            if(vs[ke[top][i]]==0){
                vs[ke[top][i]]=1;
                q.push(ke[top][i]);
                res.push_back({top,ke[top][i]});
            }
        }
    }
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        cin>>n>>m>>u;
        res.clear();
        for(int i=0;i<n;i++){
            ke[i].clear();
        }
        for(int i=0;i<m;i++)
        {
            int x ,y;
            cin>>x>>y;
            ke[x].push_back(y);
            ke[y].push_back(x);
        }
        memset(vs, 0, sizeof(vs));
        BFS(u);
        if(res.size()==n-1){
            for(auto it : res){
            cout<<it.first<<" "<<it.second<<endl;
            }
        }else cout<<-1<<endl;
        
    }
}