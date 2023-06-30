#include<bits/stdc++.h>
#include<queue>
using namespace std;
int r,c;
int a[505][505];
pair <int,int> path[]={{-1,0},{0,-1},{1,0},{0,1}};
int d[505][505];
void khoitao()
{
    cin>>r>>c;
    for(int i=1;i<=r;i++)
    {
        for(int j=1;j<=c;j++)
        {
            cin>>a[i][j];
            d[i][j]=0;
        }
    }

}
void slove()
{
    queue<pair<int,int> > q;
    pair<int,int> p;
    for(int i=1;i<=r;i++)
    {
        for(int j=1;j<=c;j++)
        {
            if(a[i][j]==2) {
                q.push({i,j});
            }
           
        }
    }
    while(!q.empty())
    {
        int kt=0;
        p=q.front();
        q.pop();
        int fi=p.first;
        int se=p.second;
        for(int i=0;i<4;i++){
            int m= path[i].first;
            int n=path[i].second;
            if(fi+ m >=1 && fi+m<= r && se+ n >=1 && se+n<=c && a[fi+m][se+n]==1){
                a[fi+m][se+n]=2;
                q.push({fi+m,se+n});
                d[fi+m][se+n]=d[fi][se]+1;
            }
        }

    }

}
int check(){
    for(int i=1;i<=r;i++)
    {
        for(int j=1;j<=c;j++)
        {
            if(a[i][j]==1) return 0;
        }
    }
    return 1;
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        khoitao();
        slove();
        // for(int i=1;i<=r;i++)
        // {
        //     for(int j=1;j<=c;j++)
        //     {
        //         cout<<a[i][j]<<" ";
        //     }
        //     cout<<endl;
        // }
    
        if(check()==0 ) cout<<-1<<endl;
        else{
            int maxx=0;
            for(int i=1;i<=r;i++)
            {
                for(int j=1;j<=c;j++)
                {
                     maxx=max(d[i][j],maxx);
                }
            }
            cout<<maxx<<endl;
        }
        

    }

}