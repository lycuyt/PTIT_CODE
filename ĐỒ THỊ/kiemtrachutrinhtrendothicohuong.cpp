// do thi vo huong
#include<bits/stdc++.h>
using namespace std;
vector<vector<int> > ke(10005);
int h;
int color[10005];
int par[10005];
int canh, dinh;
//1 : trang , 1:xam,2:den
bool dfs(int u){
    color[u]=1;
    for(int v: ke[u])
    {
        if(color[v]==0)
        {
            par[v]=u;
            if(dfs(v)) return true;
        }else if( color[v]==1){
            return true;
        }
    }
    color[u]=2;
    return false;
}
void check(int n)
{
    for(int u=1;u<=n;u++)
    {
        if(color[u]==0)
        {
            if(dfs(u) ) {
                cout<<"YES"<<endl;
                return ;
            }
        }
    }
    cout<<"NO"<<endl;
}

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
       
        cin>>dinh>>canh;
        for(int i=1;i<=dinh;i++)
       {
       	ke[i].clear();
       	color[i]=0;
	   }
       
	   for(int i=1;i<=canh;i++){
	   	int u,v;
	   	cin>>u>>v;
	   	ke[u].push_back(v);
	   }
        check(dinh);
    }
}