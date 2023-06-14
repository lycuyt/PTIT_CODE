#include<bits/stdc++.h>
using namespace std;
long long ugly(int n){
    long long dp[n+1];
    dp[1]=1;
    int i2=1,i3=1,i5=1;
    for(int i=2;i<=n;i++){
        dp[i]=min(dp[i2]*2, min(dp[i3]*3,dp[i5]*5));
        if(dp[i]==dp[i2]*2){
            i2++;
        }
        if(dp[i]==dp[i3]*3){
            i3++;
        }
        if(dp[i]==dp[i5]*5){
            i5++;
        }
    }
    return dp[n];
}
int main()
{
    
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        cout<<ugly(n)<<endl;
    }
}