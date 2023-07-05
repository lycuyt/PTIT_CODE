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
        long long n=s.size();
        s="0"+s;
        long long dp[n+1][n+1];
        memset(dp,0,sizeof(dp));
        long long sum=0;
        for(long long i=1;i<=n;i++){
            dp[i][i]=int(s[i]-48);
            // cout<<dp[i][i]<<" ";
            sum+=dp[i][i];
            
        }
        // cout<<sum<<endl;
        //xet cac xau co do dai tu 2 den n
        for(long long len=2;len<=n;len++)
        {
            for(long long i=1;i<=n-len+1;i++){
                long long j=len +i-1;
                //xet tu i den j
                long long tmp=0;
                for(long long k=i;k<=j;k++){
                    int b=int(s[k]-48);
                    tmp=tmp*10+b;
                }
                dp[i][j]=tmp;
                sum+=dp[i][j];

            }
        }
        cout<<sum<<endl;
    }
}