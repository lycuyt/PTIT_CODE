#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int a[n];
        for(int i=0;i<n;i++) cin>>a[i];
        int dp[n];
        int maxx=0;
        for(int i=0;i<n;i++) dp[i]=1;
        int tmp,res;
        for(int i=1;i<n;i++){
            tmp=0;
            for(int j=0;j<i;j++)
            {   
                if(a[i]>=a[j])
                {
                    dp[i]=max(dp[i],dp[j]+1);
                
                }
            }
            if(maxx<dp[i]) maxx=dp[i];
            
        }
        cout<<n-maxx<<endl;
        
    }

}