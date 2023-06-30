// do thi vo huong
#include<bits/stdc++.h>
using namespace std;

int parent[1005];
int sz[1005];
int n,m;
void make_set()
{
    for(int i=1;i<=n;i++){
        parent[i]=i;
    }
}
int find(int v)
{
    if(v==parent[v]) return v;
    return parent[v]=find(parent[v]);
}


int check(vector<pair<int, int>> &vp){
    for(pair<int,int> &i : vp){
        int a=find(i.first);
        int b=find(i.second);
        if(a==b){
            return 1;
        }
        parent[a]=b;
    }
    return 0;
}
int main()
{
    
    int t;
    cin>>t;
    while(t--)
    {
       
        cin>>n>>m;
        make_set();
        vector<pair<int,int>>vp;
        for(int i=1;i<=m;i++){
                int u,v;
                cin>>u>>v;
                vp.push_back({u,v});
        }
        if(check(vp)) cout<<"YES"<<endl;
        else cout<<"NO"<<endl;
    }
}