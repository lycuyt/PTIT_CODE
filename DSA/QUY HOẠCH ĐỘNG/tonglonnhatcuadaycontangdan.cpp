#include<bits/stdc++.h>
using namespace std;
int dp[101][101][101];
int main()
{
    ios_base::sync_with_stdio(0);cin.tie(0);
    int t;
    cin>>t;
    while(t--)
    {
       
       int n;
       cin>>n;
       int a[n+1];
       for(int i=1;i<=n;i++){
            cin>>a[i];
       }
       int dp[n+1]={0};
       for(int i=1;i<=n;i++){
            dp[i]=a[i];
       }
       for(int i=2;i<=n;i++)
       {
        for(int j=1;j<i;j++){
            if(a[i]>a[j]){
                dp[i]=max(dp[i],dp[j]+a[i]);
            }
        }
       }
       int max=dp[1];
       for(int i=1;i<=n;i++){
            if(max<dp[i]) max=dp[i];
       }
       cout<<max<<endl;
    }
}