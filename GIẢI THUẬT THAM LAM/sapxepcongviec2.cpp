
#include<bits/stdc++.h>
using namespace std;
bool cmp(pair<int,int> a, pair <int,int> b){
    if(a.second==b.second){
        return a.first>b.first;
    }
    return a.second>b.second;
}
int main ()
{
    int t;
    cin>>t;
    while(t--)
    {
       int n;
       cin>>n;
       int maxx=0;
       pair<int,int> a[n];
       for(int i=0;i<n;i++)
       {
        int x;
        cin>>x;
        cin>>a[i].first>> a[i].second;
        maxx=max(maxx,a[i].first);
       }
       sort(a,a+n,cmp);
        int vs[maxx+1]={0};
        
        int ans=0,ln=0;
        for (int i = 0; i < n; ++i) {
            for (int j = a[i].first; j >= 1; j--) {
                if (!vs[j]) {
                    vs[j] = 1;
                    ans++;
                    ln += a[i].second;
                    break;
                }
            }
        }
        cout << ans<<" "<<ln<<endl;

    }
}