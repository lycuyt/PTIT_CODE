#include<bits/stdc++.h>
#include<queue>
using namespace std;
const long limit = 2e5+5;
int frime[limit];
int vs[limit];
int dem[limit];
vector<int> a;// luu cac so nguyen to
queue<int> q; 
vector<vector<int> > ke(limit);
void sang()
{
    for(int i=0;i<=9999;i++){
        frime[i]=1;
    }
    for(int i=2;i<=9999;i++){
        if(frime[i]==1){
            for(int j=i*i;j<=9999;j=j+i){
                frime[j]=0;
            }
        }
    }
    for(int i=1000;i<=9999;i++){
        if(frime[i]==1){
            a.push_back(i);
        }
    }
}
int check(int a, int b){
    // check 2 so do co khac nhau 1 chu so hay khong
    string k= to_string (a);
    string h= to_string (b);
    int dem=0;
    for(int i=0;i<k.size();i++)
    {
        if(h[i]!=k[i]) dem++;
    }
    if(dem==1 ) return 1;
    else return 0;
}
void khoitao()// tao 1 danh sach ke cho cac so nguyen to khac nhau 1 chu so
{
    for(int i=0;i<a.size()-1;i++)
    {
        for(int j=i+1;j<a.size();j++){
            if(check(a[i],a[j])){
                ke[a[i]].push_back(a[j]);
                ke[a[j]].push_back(a[i]);
            }
        }
    }
}
int  bfs(int nguon, int dich)
{

    q.push(nguon);
    dem[nguon]=0;
    while(q.size())
    {
        int top=q.front();
        q.pop();
        vs[top]=1;
        if(top==dich) return dem[top];
        for(int i=0;i<ke[top].size();i++){
            int v=ke[top][i];
            if(vs[v]==0){
                vs[v]=1;
                dem[v]=dem[top]+1;
                q.push(v);

            }
        }
    }

    
}
int main()
{
    sang();
    khoitao();
    int t;
    cin>>t;
    while (t--)
    {
        int s,t;
        cin>>s>>t;
        for(int i=0;i<=limit;i++){
            vs[i]=0;
            dem[i]=0;
        }
        while(q.size()) q.pop();
        cout<<bfs(s,t)<<endl;
       
    }
    
}
