#include <bits/stdc++.h>
using namespace std;
int main(){   
    int n, x, y, z;
    cin>>n>>x>>y>>z;
    pair<int, int> p[n+5];
    int a[2*n+5];
    int res=0;
    for(int i=0;i<n*2;i=i+2){
        cin>>a[i]>>a[i+1];
        p[res]={a[i], a[i+1]};
        res++;
    }
    // cout<<res<<endl;
    
    int ans=0;
    for(int i=0;i<2*n;i++)
    {
        int tmp=0;
        for(int j=0;j<n;j++){
            if(a[i]<p[j].first) tmp+=x;
            else if(a[i]>p[j].second) tmp+=z;
            else tmp+=y;
         }
        
         ans=max(ans, tmp);
    }
    cout<<ans<<endl;
    

}