#include<bits/stdc++.h>
using namespace std;
vector<vector<int> > ke(1005);
int vs[1005];
int n;
void dfs(int u)
{
    vs[u]= 1;
    for(int v : ke[u]){
        if(vs[v]==0){
            dfs(v);
        }
    }
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        cin>>n;
        for(int i=1;i<=n;i++) ke[i].clear();
        memset(vs,0,sizeof(vs));
        for(int i=1;i<=n-1;i++){
            int x, y;
            cin>>x>>y;
            ke[x].push_back(y);
            ke[y].push_back(x);
        }
        dfs(1);
        int kt=1;
        for(int i=1;i<=n;i++)
        {
            if(vs[i]==0){
                cout<<"NO"<<endl;
                kt=0;
                break;
            }
        }
        if(kt==1) cout<<"YES"<<endl;

    }
}