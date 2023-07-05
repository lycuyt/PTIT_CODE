#include<bits/stdc++.h>
#include<vector>
using namespace std;
int main()
{
    ios::sync_with_stdio(false);
	cin.tie(nullptr);
    int t;
    cin>>t;
    while(t--)
    {
        int n,m,s;
        cin>>n>>m>>s;
        vector<pair<int,int>> ke[1005];
        for(int i=0;i<m;i++)
        {
            int u,v,w;
            cin>>u>>v>>w;
            ke[u].push_back({v,w});
            ke[v].push_back({u,w});
        }
        int d[1005];
        for(int i=1;i<=n;i++)
        {
            d[i]=INT_MAX;
        }
        d[s]=0;
        priority_queue<pair<int,int>, vector<pair<int,int>>, greater<pair<int,int>>> q;
        q.push({0,s});
        while(q.size())
        {
            pair<int,int> top= q.top();q.pop();
            int u= top.second;
            int kc=top.first;
            if(kc<=d[u])
            {
                for(auto it: ke[u])
                {
                    int v=it.first;
                    int w=it.second;
                    if(d[v]>d[u]+w)
                    {
                        d[v]=d[u]+w;
                        q.push({d[v],v});
                    }
                }
            }

        }
        for(int i=1;i<=n;i++)
        {
            cout<<d[i]<<" ";
        }
        cout<<endl;

    }
}
