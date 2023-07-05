#include<bits/stdc++.h>
using namespace std;
const long long mod = 1e9+7;
 int main()
 {
    int t;
    cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        int n=s.size();
        if(s[0]=='0'){
            cout<<0<<endl;
            continue;
        }
        // xet rieng cac truong hop khong the giai ma
        // so khong dung sau hoac dung dau so 1 so lon hon 2

        long long dp[n+5]={0};
        dp[0]=dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=0;
            if(s[i-1]>'0'){
                dp[i]=dp[i-1];
            }
            if(s[i-2]=='1' ||(s[i-2]=='2' && s[i-1]<'7'))
            {
                dp[i]+=dp[i-2];
            }

            
        }
        // for(int i=0;i<=n;i++){
        //     cout<<dp[i]<<" ";
        // }
        cout<<dp[n]<<endl;
       
        
    }
 }