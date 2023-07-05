#include<bits/stdc++.h>
using namespace std;
#define faster() ios_base::sync_with_stdio(0); cin.tie(NULL); cout.tie(NULL);
vector<vector<int> > ke(100005);
int vs[100005];
int e[10005];
int a,b, nguon,dich;
void BFS(int u){
	queue<int> q;
	q.push(u);
	while(q.size()>0)
	{
		int top=q.front();
		q.pop();
//		cout<<top<<' '<<e[top]<<" ";
		vs[top]=1;
		for(int i=0;i<ke[top].size();i++)
		{
			if(vs[ke[top][i]] == 0){
				e[ke[top][i]] = top;
				vs[ke[top][i]]=1;
				q.push(ke[top][i]);
			}
		}
	}
}
void DuongdiBFS(int u,int v){
	BFS(u);
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
        DuongdiBFS(nguon,dich);
        cout<<endl;
    }
    return 0;
 }
