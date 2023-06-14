#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        string s1, s2;
        cin>>s1>>s2;
        int n=s1.size();
        int m=s2.size();
        int dp[n+5][m+5];
        //dp[i][j] so cach it nhat bien doi i ki tu xau 1 thanh j ki tu xau 2
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0|| j==0)
                {
                    dp[i][j]=i+j;
                }else if(s1[i-1]== s2[j-1]){// tru 1 vi xau bat dau tu vi tri 0 den n-1, m-1
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=min(dp[i-1][j-1],min(dp[i][j-1],dp[i-1][j]))+1;
                }

            }
        }
        cout<<dp[n][m]<<endl;
    }
}