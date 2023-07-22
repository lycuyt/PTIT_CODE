#include<bits/stdc++.h>
using namespace std;
struct canh{
    int x, y;
    double w;
};
int n, m;
vector<pair<int,double>> adj[105];
bool used[105];
int parent[105];
double d[105];

void prim(int u){
    memset(used, false, sizeof(used));
    for(int i=1;i<=n;i++) d[i]=99999.00;
    priority_queue<pair<double, int>, vector<pair<double, int>>, greater<pair<double, int>>> q;
    vector<canh> mst;
    double res=0;
    q.push({0,u});
    while(!q.empty())
    {
        pair<double, int> top= q.top();q.pop();
        int dinh= top.second;
        double trongso= (double)top.first;
        if(used[dinh]) continue;
        res=(double)res+ (double)trongso;
        //  cout<< fixed<<setprecision(6)<<res<<endl;
        used[dinh]=true;
        if(u != dinh) {
            mst.push_back({dinh, parent[dinh], trongso});
        }
        for ( auto it : adj[dinh])
        {
            int y= it.first;
            double w= it.second;
            if( !used[y] && w<d[y])
            {
                q.push({w,y});
                d[y]=w;
                parent[y]=dinh;
            }
        }

    }
    cout<< fixed<<setprecision(6)<<res<<endl;
    // for ( auto it : mst){
    //     cout<<it.x<<" "<<it.y<<" "<<fixed<<setprecision(6)<<it.w<<endl;
    // }
}
struct diem{
    double x, y;
};
double kc ( struct diem k, struct diem h){
    double a= k.x-h.x;
    double b= k.y-h.y;
    double l= sqrt(pow(a,2)+pow(b,2));
    return l;
}
int main()
{
    int t;cin>>t;
    while(t--)
    {
        cin>>n;
        m=0;
        // cin>>n>>m;
        for(int i=1;i<=n;i++){
            adj[i].clear();
        }
        struct diem b[n+1];
        for(int i=1;i<=n;i++)
        {
            cin>>b[i].x>>b[i].y;
        }
        int ans=1;
        for(int i=1;i<=n-1;i++){
            for(int j=i+1;j<=n;j++){
                m++;
                adj[i].push_back({j,(double)kc(b[i], b[j])});
                adj[j].push_back({i,(double)kc(b[i], b[j])});
                // cout<<i<<" "<<j<<" ";
                // cout<<fixed<<setprecision(6)<<kc(b[i], b[j])<<endl;
            }
        }
        // cout<<m<<endl;
        prim(1);
        
    }
}