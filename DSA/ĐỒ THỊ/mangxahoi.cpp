#include<bits/stdc++.h>
#include<queue>
using namespace std;
// dinh ly : tat ca chu trinh tren do thi se co chieu dai la chan
// nhung chung ta se sd to mau do thi, neu co 2 mau thi la do thi 2 phia
int n, m;
const int maxn=100005;
vector<int> ke[maxn];
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
}
string slove()
{
    for(int i=1;i<=n;i++){
        for(int & j : ke[i]){
            if(ke[i].size()!= ke[j].size()){
                return "NO";
            }
        }
    }return "YES";
}

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        nhap();
        cout<<slove()<<endl;
    }
}