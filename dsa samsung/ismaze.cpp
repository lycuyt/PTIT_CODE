#include<bits/stdc++.h>
using namespace std;
#define s second 
#define f first
int n;
int a[3005][3005];
// int vs[3005][3005];
int m[3005][3005];  
// tim duong di tu 1 o den 1 o
pair<int, int> path[]={{-1,0},{0,-1},{1,0},{0,1}};
// x,y no la 1 cai cap dinh bat ki ma  bang 0, 0
void slove(int x, int y)
{
    memset(m,0,sizeof(m));
    queue<pair<int,int >> q;
    pair<int,int> p;
    q.push({x,y});
    while(q.size())
    {
        p=q.front();
        q.pop();
        for(int i=0;i<4;i++)
        {
            if( p.f+path[i].f >=1 && p.f +path[i].f <=n && p.s+path[i].s >=1 && p.s+path[i].s<=n && a[p.f+path[i].f][p.s+path[i].s]==0 )
            {
                m[p.f+path[i].f][p.s+path[i].s]+=1;
                q.push({p.f+path[i].f,p.s + path[i].s});
            }
        }
    }
    // for(int i=1;i<=n;i++)
    // {
    //     for(int j=1;j<=n;j++)
    //     {
    //         cout<<m[i][j]<<" ";
    //     }
    //     cout<<endl;
    // }
}
int main()
{
    cin>>n;
    // int x, y;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            cin>>a[i][j];
        }
    }
    // for(int i=1;i<=n;i++)
    // {
    //     int kt=0;
    //     for(int j=1;j<=n;j++)
    //     {
    //         if(a[i][j]==0) {
    //             x=i;
    //             y=j;
    //             kt=1;
    //            break;
    //         }
    //         if(kt==1) break;
    //     }
    // }
    slove(1, 1);
  

}