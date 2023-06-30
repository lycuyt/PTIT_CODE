#include<bits/stdc++.h>
using namespace std;
char a[105][105];
int vs[105][105];
//dem so mien ma tran
// 8 vi tri
int n,m;
pair<int,int> path[]={{-1,0},{-1,-1},{0,-1},{1,-1},{1,0},{1,1},{0,1},{-1,1}};
void DFS(int i, int j)
{
    a[i][j]='*';
    for(int k=0;k<8;k++)
    {
        int in=i+path[k].first;
        int jn=j+path[k].second;
        if(in>=1 && in<=n && jn>=1 && jn<=m && a[in][jn]=='W'){
            DFS(in,jn);
        }
    }
}
int main()
{
    
        
        cin>>n>>m;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++)
            {
                cin>>a[i][j];
                vs[i][j]=0;
            }
        }
        int cnt=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(a[i][j]=='W'){
                    DFS(i,j);
                    cnt++;
                }
            }
        }
        cout<<cnt<<endl;
    
}