#include<bits/stdc++.h>
#include<queue>
using namespace std;
// dinh ly : tat ca chu trinh tren do thi se co chieu dai la chan
// nhung chung ta se sd to mau do thi, neu co 2 mau thi la do thi 2 phia
int n, m;
const int maxn=1005;
vector<int> ke[maxn];
int color[maxn];
void nhap()
{
    cin>>n>>m;
    for(int i=1;i<=n;i++){
        ke[i].clear();
    }
    for(int i=0;i<m;i++){
        int u,v;
        cin>>u>>v;
        ke[u].push_back(v);
        ke[v].push_back(u);
    }
    memset(color, -1, sizeof(color));
}

//hai dinh ke nhau co mau khac nhau
bool slove(int u)
{
    // 0 : red, 1 : blue
    queue<int> q;
    q.push(u);
    color[u]=0;
    while(!q.empty())
    {
        int v=q.front();q.pop();
        for(int x: ke[v]){
            if(color[x]==-1)//chua xet
            {
                color[x]=1-color[v];
                q.push(x);
            }else if(color[x]== color[v]){
                return false;
            }
        }
    }
    return true;
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        nhap();
        bool check=true;
        for(int i=1;i<=n;i++)
        {
            if(color[i]==-1){
                if(!slove(i)){
                    check=false;
                    break;
                }
            }
        }
        if(check) cout<<"YES"<<endl;
        else cout<<"NO"<<endl;
    }
}