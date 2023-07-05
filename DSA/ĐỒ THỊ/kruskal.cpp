#include<bits/stdc++.h>
using namespace std;
int n, m;
struct edge
{
    int u,v;
    int w;
};
int parent[105];
int sz[105];
vector<edge> canh;
void make_set()
{
    for(int i=1;i<=n;i++){
        parent[i]=i;
        sz[i]=1;
    }
}
int find(int v)
{
    if(v==parent[v] ) return v;
    return parent[v]=find(parent[v]);
}
bool Union(int a, int b)
{
    a=find(a);
    b=find(b);
    if(a==b) return false;
    if(sz[a]<sz[b]) swap(a,b);
    parent[b]=a;
    sz[a]+=sz[b];
    return true;
}
void in()
{
    cin>>n>>m;
    canh.clear();
    for(int i=1;i<=m;i++)
    {
        int x, y,w;
        cin>>x>>y>>w;
        edge e;
        e.u=x;
        e.v=y;
        e.w=w;
        canh.push_back(e);
    }
}
bool cmp(edge a, edge b){
    return a.w<b.w;
}
void kruskal()
{
    vector<edge> mst;
    int d=0;
    sort(canh.begin(), canh.end(),cmp);
    for(int i=0;i<m;i++)
    {
        if(mst.size()==n-1) break;
        edge e=canh[i];
        if(Union(e.u,e.v)){
            mst.push_back(e);// ko ton tai chu trinh thi moi cho vao vector
            d+=e.w;
        }
    }
    cout<<d<<endl;
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        in();
        make_set();
        kruskal();
    }

}