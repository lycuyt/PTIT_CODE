#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,x,y,z;
        cin>>n>>x>>y>>z;
        int dp[105]={0};
        dp[1]=x;
        dp[2]=min(dp[1]+x,dp[1]+z);
        for(int i=3;i<=100;i++){
            if(i%2==0){
                dp[i]=min(dp[i-1]+x,dp[i/2]+z);
            }else{
                dp[i]=min(dp[i-1]+x,min(dp[(i-1)/2]+x+z,dp[(i+1)/2]+y+z));
            }
        }
        cout<<dp[n]<<endl;
    }
}