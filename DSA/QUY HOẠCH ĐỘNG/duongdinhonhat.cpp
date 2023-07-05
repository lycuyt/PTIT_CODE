#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,m;
        cin>>n>>m;
        int a[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                cin>>a[i][j];
            }
        }
        int dp[n+1][m+1];
        memset(dp,0,sizeof(dp));
        dp[0][0]=a[0][0];
        // cout<<dp[0][0]<<endl;
        // xet rieng hang 1
        for(int i=1;i<m;i++){
            dp[0][i]=dp[0][i-1]+a[0][i];
            // cout<<dp[0][i]<<' ';

        }
        //xet cot 1
        for(int i=1;i<n;i++){
            dp[i][0]=dp[i-1][0]+a[i][0];
            // cout<<dp[i][0]<<" ";
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++)
            {
                dp[i][j]=min(dp[i-1][j-1], min(dp[i][j-1], dp[i-1][j]))+a[i][j];
                // cout<<dp[i][j]<<" ";
            }
        }
        cout<<dp[n-1][m-1]<<endl;
    }
}