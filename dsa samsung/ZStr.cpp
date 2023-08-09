
#include<bits/stdc++.h>
#define sz size()
#define pb push_back()
using namespace std;
int main()
{
    
        string a,b;
        cin>>a>>b;
        a="0"+ a;
        b="0"+ b;
        int n=a.sz-1;
        int m=b.sz-1;
        int dp[n+1][m+1];
        memset(dp,0,sizeof(dp));
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(a[i]==b[j]) dp[i][j]=dp[i-1][j-1]+1;
                else dp[i][j]=max(dp[i][j-1],dp[i-1][j]);
            }
        }
        cout<<dp[n][m]+(n-dp[n][m])+(m-dp[n][m]);
    
}