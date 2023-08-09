#include<bits/stdc++.h>
using namespace std;
int n;
int x, y, u, v;
char a[105][105];
int b[105][105];

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
            if(a[fi][se-1]=='X') break;
            if(fi == u && se-1==v) return b[fi][mm]+1;
            b[fi][se-1]=b[fi][mm]+1;
            q.push({fi, se -1});
            se--;
        }
        se=mm;
        while(se<=n-2 && !b[fi][se+1]){
            if(a[fi][se+1]=='X') break;
            if(fi ==u && se+1==v) return b[fi][mm]+1;
            b[fi][se+1]=b[fi][mm]+1;
            q.push({fi, se + 1});
            se++;
        }
        se=mm;
        // cung cot
        while(fi>=1 && !b[fi-1][se]){
            if(a[fi-1][se]=='X') break;
            if(fi-1 ==u && se==v) return b[nn][se]+1;
            b[fi-1][se]=b[nn][se]+1;
            q.push({fi-1, se});
            fi--;
        }
        fi=nn;
        while(fi<=n-2 && !b[fi+1][se]){
            if(a[fi+1][se]=='X') break;
            if(fi+1 ==u && se==v) return b[nn][se]+1;
            b[fi+1][se]=b[nn][se]+1;
            q.push({fi+1, se});
            fi++;
        }
        

    }
}

int main()
{
    int t;cin>>t;
    while(t--)
    {
        memset(b, 0, sizeof(b));
        cin>>n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                cin>>a[i][j];
                b[i][j]=0;
            }
        }
        cin>>x>>y>>u>>v;
        cout<<slove()<<endl;
        
    }
}