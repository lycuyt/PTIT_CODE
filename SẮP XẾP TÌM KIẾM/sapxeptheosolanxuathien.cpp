#include<bits/stdc++.h>
using namespace std;
bool cmp(pair<int,int> a, pair<int,int> b){
    return a.second>b.second;
}
int main()
{
    int t;
    cin>>t;
    while (t--)
    {
        int n,h;
        cin>>n;
        int a[n];
        map<int,int> mp;
        for(int i=0;i<n;i++){
            cin>>a[i];
            mp[a[i]]++;
        }
        int k=mp.size();
        pair <int,int> b[k];
        int j=0;
        for(map<int,int> ::iterator it =mp.begin();it != mp.end();it++){
            b[j].first=(*it).first;
            b[j].second=(*it).second;
            j++;
        }
        stable_sort(b,b+k,cmp);
        for(int i=0;i<k;i++){
            for(int k=1;k<=b[i].second;k++){
                cout<<b[i].first<<" ";
            }
        }
        cout<<endl;

        
    }
    
}