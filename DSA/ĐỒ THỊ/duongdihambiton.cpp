#include<bits/stdc++.h>
using namespace std;
vector<vector<int> > ke(105);
int n,e;
int vs[105];
int kt=0;
void hamilton(int u, int cnt){
   if(cnt==n) kt=1;
   if(kt==1) return;
   for(int v: ke[u]){
    if(vs[v]==0)
    {
        vs[v]=1;
        hamilton(v,cnt+1);
        vs[v]=0;

    }
   }
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        kt=0;
        cin>>n>>e;
        for(int i=1;i<=n;i++) ke[i].clear();
        for(int i=1;i<=e;i++){
            int x,y;
            cin>>x>>y;
            ke[x].push_back(y);
            ke[y].push_back(x);
        }
       int vt=-1;
        for(int i=1;i<=n;i++)
        {
            memset(vs,0,sizeof(vs));
            vs[i]=1;
            hamilton(i,1);
            if(kt==1) {
                vt=i;
                break;}
        }
        cout<<vt<<endl;
        if(kt==1) cout<<1<<endl;
        else cout<<0<<endl;
    }
}