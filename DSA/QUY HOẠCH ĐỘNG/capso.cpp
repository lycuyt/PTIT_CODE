#include<bits/stdc++.h>
using namespace std;
struct cap{
     int x,y;
};
bool cmp(cap a, cap b){
    return a.x<b.x;
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        struct cap a[n];
        int dp[n+1];
        for(int i=0;i<n;i++){
            cin>>a[i].x>>a[i].y;
            dp[i]=1;
        }
        sort(a,a+n,cmp);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[j].y<a[i].x){
                    dp[i]=max(dp[i],dp[j]+1);
                }
            }
        }
        cout<<dp[n-1]<<endl;
    }
}