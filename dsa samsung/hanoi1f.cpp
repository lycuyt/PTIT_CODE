#include<bits/stdc++.h>
using namespace std;
int g[5][5];
vector<pair<char, char>> res;
void tower(int n, int s, int t){
    if(n<=0) return ;
    // if(n>=1)
    // {
        if(g[s][t]==1){
            tower(n-1,s,3-s-t);
            res.push_back({s+'A',t+'A'});
            tower(n-1,3-s-t,t);
        }
         else{
            tower(n-1, s, t);
            // chuyen(s, 3-s-t);
            res.push_back({s+'A',3-s-t+'A'});
            tower(n-1, t, s);
            // chuyen(3-s-t, t);
            res.push_back({3-s-t+'A',t+'A'});
            tower(n-1, s, t);
        }
    
    // }
    
    
}
int main()
{
    int n;
    cin>>n;
    for(int i=0;i<=2;i++){
        for(int j=0;j<=2;j++)
        {
            cin>>g[i][j];
        }
    }
    tower(n,0,2);
    cout<<res.size()<<"\n";
    for( auto x : res){
        cout<<x.first<<x.second<<"\n";
    }
}
