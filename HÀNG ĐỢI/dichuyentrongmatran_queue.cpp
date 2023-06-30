#include<bits/stdc++.h>
#include<queue>
#define se second
#define fi first
using namespace std;
int n,m;
int a[1005][1005];
int b[1005][1005];//xet so lan di chuyen
int solve()
{
    queue<pair<int,int> > q;
        pair<int,int> p;
        q.push({1,1});
        while(q.size())
        {
            p=q.front();
            q.pop();
            if(p.fi + a[p.fi][p.se] <=n && !b[p.fi + a[p.fi][p.se]][p.se])//xet theo hang
            {
                if(p.fi + a[p.fi][p.se]==n && p.se==m ) return b[p.fi][p.se]+1;
                b[p.fi + a[p.fi][p.se]][p.se]=b[p.fi][p.se]+1;
                q.push({p.fi + a[p.fi][p.se],p.se});

            }
            if(p.se+a[p.fi][p.se]<=m && !b[p.fi][p.se+a[p.fi][p.se]])
            {
                if(p.fi==n && p.se + a[p.fi][p.se]==m) return b[p.fi][p.se]+1;
                b[p.fi][p.se+ a[p.fi][p.se]]=b[p.fi][p.se]+1;
                q.push({p.fi,p.se + a[p.fi][p.se]});
            }
        }
        return -1;
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        
        cin>>n>>m;
       
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                cin>>a[i][j];
                b[i][j]=0;
            }
        }
        cout<<solve()<<endl;

        
    }
}