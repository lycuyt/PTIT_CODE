#include<bits/stdc++.h>
using namespace std;
int n, m;
int x, y, u, v;
char a[505][505];
int b[505][505];

int slove()
{
    queue<pair<int,int>> q;
    q.push({x, y});
    while(!q.empty())
    {
        pair<int, int> top= q.front();
        q.pop();
        int fi= top.first;
        int se= top.second;
        int nn=fi;
        int mm= se;
        // cung hang
        // di chuyen ve ben trai
        while(se>=1 && !b[fi][se-1]){
            if(a[fi][se-1]=='*') break;
            if(fi == u && se-1==v) return b[fi][mm]+1;
            b[fi][se-1]=b[fi][mm]+1;
            q.push({fi, se -1});
            se--;
        }
        se=mm;
        while(se<=m-2 && !b[fi][se+1]){
            if(a[fi][se+1]=='*') break;
            if(fi ==u && se+1==v) return b[fi][mm]+1;
            b[fi][se+1]=b[fi][mm]+1;
            q.push({fi, se + 1});
            se++;
        }
        se=mm;
        // cung cot
        while(fi>=1 && !b[fi-1][se]){
            if(a[fi-1][se]=='*') break;
            if(fi-1 ==u && se==v) return b[nn][se]+1;
            b[fi-1][se]=b[nn][se]+1;
            q.push({fi-1, se});
            fi--;
        }
        fi=nn;
        while(fi<=n-2 && !b[fi+1][se]){
            if(a[fi+1][se]=='*') break;
            if(fi+1 ==u && se==v) return b[nn][se]+1;
            b[fi+1][se]=b[nn][se]+1;
            q.push({fi+1, se});
            fi++;
        }
        

    }
    return 0;
}

int main()
{
    int t;cin>>t;
    while(t--)
    {
        memset(b, 0, sizeof(b));
        cin>>n>>m;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                cin>>a[i][j];
                if(a[i][j]=='S'){
                    x=i;
                    y=j;
                }
                if(a[i][j]=='T'){
                    u=i;
                    v=j;
                }
                b[i][j]=0;
            }
        }
        // cout<<x<<y<<u<<v;
        // cin>>x>>y>>u>>v;
        int k= slove();
        // cout<<k<<endl;
        if(k<=3 && k>=1) cout<<"YES"<<endl;
        else cout<<"NO"<<endl;
        
    }
}