#include<bits/stdc++.h>
using namespace std;
#define faster() ios_base::sync_with_stdio(0); cin.tie(NULL); cout.tie(NULL);
vector<vector<int> > ke(100005);
int vs[100005];

int a,b, nguon;
void BFS(int u){
	queue<int> q;
	q.push(u);
	while(q.size()>0)
	{
		int top=q.front();
		q.pop();
		cout<<top<<' ';
		vs[top]=1;
		for(int i=0;i<ke[top].size();i++)
		{
			if(vs[ke[top][i]] == 0){
				vs[ke[top][i]]=1;
				q.push(ke[top][i]);
			}
		}
	}
}

int main()
 {
 	faster();
    int t;
    cin>>t;
    while(t--)
    {
    
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
        BFS(nguon);
        cout<<endl;
    }
    return 0;
 }
