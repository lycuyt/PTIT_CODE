#include<bits/stdc++.h>
using namespace std;
#define faster() ios_base::sync_with_stdio(0); cin.tie(NULL); cout.tie(NULL);
vector<vector<int> > ke(100005);
int vs[100005];
int e[10005];
void DFS(int u)
{
//	cout<<u<<" ";
	vs[u]=1;
	for(int i=0;i<ke[u].size();i++)
	{
		if(vs[ke[u][i]] == 0){
			e[ke[u][i]]=u;
			DFS(ke[u][i]);
		}
	}
}
vector<int> dd;
void DuongdiDFS(int u,int v){
	DFS(u);
	vector<int> d;
	if(vs[v]==1 ){
		int t=v;
		while(t>0)
		{
			d.push_back(t);
			t=e[t];
		}
		for(int j=d.size()-1;j>=0;j--) cout<<d[j]<<" ";
	}else cout<<"-1";
			
}

int main()
 {
 	faster();
    int t;
    cin>>t;
    while(t--)
    {
    
    	int a,b, nguon,dich;
	   cin>>a>>b>>nguon>>dich;
       for(int i=1;i<=a;i++)
       {
       	ke[i].clear();
       	vs[i]=0;
       	e[i]=0;
	   }
	   
	  
	   for(int i=1;i<=b;i++){
	   	int u,v;
	   	cin>>u>>v;
	   	ke[u].push_back(v);
	   
	   }
        DuongdiDFS(nguon,dich);
       
//		DFS(nguon);
        cout<<endl;
    }
    return 0;
 }
