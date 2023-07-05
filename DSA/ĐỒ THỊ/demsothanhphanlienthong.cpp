#include<bits/stdc++.h>
using namespace std;
vector< vector<int> > ke(10005);
int lt[10005];
int k;
int dinh, canh;
void DFS(int u)
{
    lt[u]=1;
    for(int i=0;i<ke[u].size();i++)
    {
        if(lt[ke[u][i]]==0)
        {
            DFS(ke[u][i]);
        }
    }
}
int tplt()
{
    for(int i=1;i<=dinh;i++){
        if(lt[i]==0){
            DFS(i);
            k++;
        }
        
    }
    return k;
}
int main()
{
    int t;cin>>t;
    while(t--)
    {
        cin>>dinh>>canh;
        for(int i=1;i<=dinh;i++){
            ke[i].clear();
            lt[i]=0;
        }
        for(int i=1;i<=canh;i++){
            int u,v;
            cin>>u>>v;
            ke[v].push_back(u);
            ke[u].push_back(v);
        }
         k=0;
        cout<<tplt()<<endl;
    }
}