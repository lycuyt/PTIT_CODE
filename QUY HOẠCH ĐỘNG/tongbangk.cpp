#include<bits/stdc++.h>
const long long mod=1e9+7;
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,k;
        cin>>n>>k;
        int a[n+5];
        long long dp[k+5];
        memset(dp,0,sizeof(dp));
        for(int i=1;i<=n;i++ ) {cin>>a[i]; }
        dp[0]=1;
        // cout<<dp[0];
        for(int i=1;i<=k;i++){
            for(int j=1;j<=n;j++){
                if(i>=a[j]){
                    dp[i]=(dp[i]+dp[i-a[j]])%mod;
                }
            }
            // cout<<dp[i]<<endl;
        }
        cout<<dp[k]<<endl;
    }
}