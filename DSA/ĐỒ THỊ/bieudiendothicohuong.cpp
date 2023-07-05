
#include<bits/stdc++.h.
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int v;//so dinh
        int e;//so canh
        cin>>v>>e;
        pair<int,int> a[e];
        for(int i=0;i<e;i++){
            cin>>a[i].first;
            cin>>a[i].second;
        }
        for(int i=1;i<=v;i++){
            cout<<i<<":"<<" ";
            for(int j=0;j<e;j++){
                if(a[j].first == i) cout<<a[j].second<<" ";
            }  
            cout<<endl;
        }
    }
}