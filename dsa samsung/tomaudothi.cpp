#include<bits/stdc++.h>
using namespace std;
int n, m;
vector<int> ke[105];
int k;
bool ans;
int u;
int color[105];
// kiem tra cạnh kề của đỉnh u có màu c hay chưa
bool check(int u, int c){
    for(int v: ke[u]){
        if(color[v]==c) return false;
    }
    return true;
}
// dem so luong dinh toi da ma mau c co the to dc
void coloring(int u)
{
    if(u==n+1) ans=true;
    if(ans) return;
    for(int i=1;i<=k;i++){
        if(check(u,i)){
            color[u]=i;
            coloring(u+1);
        }
    }
}
int main()
{
    int t;cin>>t;
    while(t--)
    {
        cin>>n>>m>>k;
        ans=false;
        for(int i=1;i<=n;i++){
            ke[i].clear();
            color[i]=0;
        }
        for(int i=1;i<=m;i++){
            int x, y;
            cin>>x>>y;
            ke[x].push_back(y);
            ke[y].push_back(x);

        }
        coloring(1);
        cout<<(ans ? "YES":"NO")<<endl;
    }
}