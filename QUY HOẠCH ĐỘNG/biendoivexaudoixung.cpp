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
        int dp[n+5][n+5];
        memset(dp,0,sizeof(dp));
        //dp[i][j] so cac xoa it nhat de vi tri i->j la xau doi xung
        for(int i=0;i<n;i++){
            dp[i][i]=0;
        }
        for(int i=0;i<n-1;i++){
            if(s[i]!=s[i+1]) dp[i][i+1]=1;
        }
        // xet tu xau co do dai 3
        for(int len=3;len<=n;len++){
            for(int i=0;i<n-len+1;i++){
                int j=i+len-1;
                if(s[i]== s[j]) dp[i][j]=dp[i+1][j-1];
                else{
                    dp[i][j]=min(dp[i][j-1],dp[i+1][j])+1;
                }
            }
        }
        cout<<dp[0][n-1]<<endl;
    }
}