#include<bits/stdc++.h>
using namespace std;
vector< vector<int> > ke(10005);
int lt[10005];
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

void lienthongmanh()
{
    for(int i=1;i<=dinh;i++)
    {
        for(int j=1;j<=dinh;j++){
            lt[j]=0;
        }
        DFS(i);
        //kiem tra xem no tat ca cac lt[i] co bang 0 hang ko
        for(int j=1;j<=dinh;j++){
            // cout<<lt[j]<<" ";
            if(lt[j] == 0) {
                cout<<"NO";
                return;
            }
        }
        // cout<<endl;
    }
    cout<<"YES";
  
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
           
        }
        lienthongmanh();
        cout<<endl;
    }
}