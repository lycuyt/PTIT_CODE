#include<bits/stdc++.h>
using namespace std;
int main()
{
    int c, n;
    cin>>c>>n;
    int a[n+5];
    for(int i=1;i<=n;i++) cin>>a[i];
    int dp[c+5];
    for(int i=0;i<=c;i++){
        dp[i]=0;
    }
    dp[0]=1;
    for(int i=1;i<=n;i++)
    {
        for(int j=c;j>=a[i];j--){
            if(dp[j-a[i]]== 1){
                dp[j]=1;
            }
        }
    }
    int k=c;
    while(1){
        if(dp[k]==1){
            cout<<k<<endl;
            break;
        }else{
            k--;
        }
    }
    
    
    
}