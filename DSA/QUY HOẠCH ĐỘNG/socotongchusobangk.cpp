#include<bits/stdc++.h>
using namespace std;
const long long mod=1e9+7;
long long dp[105][50005];

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,k;
        cin>>n>>k;
        memset(dp,0,sizeof(dp));
        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=k;i++){
            dp[0][i]= 0;
        }
        for(int i=1;i<=9;i++){
            dp[1][i]=1;
            // cout<<dp[1][i]<<' ';
        }
        for(int i=1;i<=n;i++){
            for(int so=0;so<=9;so++){
                for(int j=so;j<=k;j++){
                    dp[i][j]=(dp[i][j]%mod+ dp[i-1][j-so]%mod)%mod;
                }
            }
        }
        cout<<dp[n][k]<<endl;
    }
}