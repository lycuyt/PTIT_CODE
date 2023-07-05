#include<bits/stdc++.h>
#include<vector>
using namespace std;
int main()
{
    //chuyen danh sach canh thanh ma tran trong so
    int n,m;
    cin>>n>>m;
    int a[n+5][n+5];
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            a[i][j]=1000;
        }
        a[i][i]=0;
        
    }
    for(int i=1;i<=m;i++)
    {
        int x,y,w;
        cin>>x>>y>>w;
        a[x][y]=w;
        a[y][x]=w;
    }
    for(int k=1;k<=n;k++)
    {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
            {
                if (a[i][j] > a[i][k] + a[k][j]) {
                    a[i][j] = a[i][k] + a[k][j]; }
            }
        } 
    }
    int q;
    cin>>q;
    while(q--)
    {
        int x,y;
        cin>>x>>y;
        cout<<a[x][y];
        cout<<endl;
    }
}