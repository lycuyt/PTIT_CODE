#include<bits/stdc++.h>
using namespace std;
void inra(vector<pair<int, int>> v)
{
    int len= v.size();
    if (len ==1){
        if(v[0].second==0){
            cout<<v[0].first;
        }else{
            cout<<v[0].first<<"-"<<v[0].second;
        }
    }else{
        for (int i=0;i<len-1;i++)
        {
            
                if(v[i].second==0){
                    cout<<v[i].first;
                }else{
                cout<<v[i].first<<"-"<<v[i].second;
                }
            if (i!= len-2) cout<<", ";
        }
        cout<<" and ";
        if(v[len-1].second==0){
            cout<<v[len-1].first;
        }else{
            cout<<v[len-1].first<<"-"<<v[len-1].second;
        }
    }
}
int main()
{
    int n, m;
    cin>>n>>m;
    int a[m+5]={0};
    int d[n+5]={0};
    for (int i=1;i<=m;i++)
    {
        cin>>a[i];
        d[a[i]]=1;// bi loi
    }
    // cout<<d[5];
    int i=1;
    int s, e;
    // cout<<"Error: ";
    vector<int> v;
    vector<int> u;
    vector<pair<int, int>> p1;
    vector<pair<int, int>> p2;
    while(i<=n)
    {
        // cout<<i<<" ";
        if(d[i]==1){
            v.push_back(i);
        }else{
            // cout<<v.size()<<endl;
            if(v.size()>0)
            {
                if(v.size()==1)
                {
                    p1.push_back({v[0], 0});
                }else{
                    p1.push_back({v[0], v[v.size()-1]});
                }
            }
            v.clear();
        }

        if (d[i]==0)
        {
            u.push_back(i);
            // cout<<i<<endl;

        }else{
            if(u.size()>0)
            {
                if(u.size()==1)
                {
                    p2.push_back({u[0], 0});
                }else{
                    p2.push_back({u[0], u[u.size()-1]});
                }
            }
            u.clear();
        }
        i++;
    }
    if (v.size()>0){
        if(v.size()==1)
        {
            p1.push_back({v[0], 0});
        }else{
            p1.push_back({v[0], v[v.size()-1]});
        }
    }
    if (u.size()>0){
        if(u.size()==1)
        {
            p2.push_back({u[0], 0});
        }else{
            p2.push_back({u[0], u[u.size()-1]});
        }
    }
    inra(p1);
    cout<<endl;
    inra(p2);
}