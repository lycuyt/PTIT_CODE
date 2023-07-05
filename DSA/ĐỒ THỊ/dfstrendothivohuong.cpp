#include<bits/stdc++.h>
using namespace std;
#define faster() ios_base::sync_with_stdio(0); cin.tie(NULL); cout.tie(NULL);
vector<vector<int> > ke(100005);
int vs[100005];
void DFS(int u){
	vs[u]=1;
	cout<<u<<' ';
	for(int i=0;i<ke[u].size();i++){
		if(vs[ke[u][i]] == 0) DFS(ke[u][i]);
	}
}

int main()
 {
 	faster();
    int t;
    cin>>t;
    while(t--)
    {
    	int a,b, nguon;
	   cin>>a>>b>>nguon;
       for(int i=1;i<=a;i++)
       {
       	ke[i].clear();
       	vs[i]=0;
	   }
	   
	  
	   for(int i=1;i<=b;i++){
	   	int u,v;
	   	cin>>u>>v;
	   	ke[u].push_back(v);
	   	ke[v].push_back(u);
	   }
        DFS(nguon);
        cout<<endl;
    }
    return 0;
 }
