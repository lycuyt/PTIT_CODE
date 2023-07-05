// do thi vo huong
#include<bits/stdc++.h>
using namespace std;
vector<vector<int> > ke(10005);
int h;
int vs[10005];
int par[10005];
int canh, dinh;

bool dfs(int u){
    vs[u]=1;
    for(int v: ke[u])
    {
        if(vs[v]==0)
        {
            par[v]=u;
            if(dfs(v)) return true;
        }else if( v!= par[u]){
            return true;
        }
    }
    return false;
}
void check(int n)
{
    for(int u=1;u<=n;u++)
    {
        if(vs[u]==0)
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
       	vs[i]=0;
	   }
       
	   for(int i=1;i<=canh;i++){
	   	int u,v;
	   	cin>>u>>v;
        
	   	ke[u].push_back(v);
	   	ke[v].push_back(u);
	   }

    //    for(int i=1;i<=dinh;i++)
    //    {
    //     cout<<i<<":";
    //     for(int j=0;j<ke[i].size();j++)
    //     {
    //         cout<<ke[i][j]<<" ";
    //     }
    //     cout<<endl;
    //    }
    //    cout<<endl;
        

        //  if(dfs(1)) cout<<"YES";
        //  else cout<<"NO";
        //  cout<<endl;
        check(dinh);
    }
}