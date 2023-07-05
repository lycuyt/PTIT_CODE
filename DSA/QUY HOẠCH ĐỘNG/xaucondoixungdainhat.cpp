#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        int n=s.size();
        s="0"+s;
        int dp[n+1][n+1];
        memset(dp,0,sizeof(dp));
        for(int i=1;i<=n;i++){
            dp[i][i]=1;
        }
        //xet cac xau con co do dai tu 2 den n
        int ans=1;
        for(int len=2;len<=n;len++){
            for(int i=1;i<=n-len+1;i++){
                int j=i+len-1;

                if(len==2 && s[i]==s[j]) dp[i][j]=1;
                else {
                    if(dp[i+1][j-1]==1 && s[i]==s[j]){
                        dp[i][j]=1;
                    }
                }
                if(dp[i][j]==1) ans=max(ans,len);
            }
        }
        cout<<ans<<endl;
    }
}