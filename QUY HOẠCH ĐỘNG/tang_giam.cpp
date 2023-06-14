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
        float a[n], b[n];
        for(int i=0;i<n;i++){
            cin>>a[i]>>b[i];
        }
        // 2 mang a[], b[]
        // mang a: tang dan
        //mang b : giam dan
        // dai nhat
        int dp[n];
        for(int i=0;i<n;i++) dp[i]=1;
       
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(a[i]>a[j]&& b[i]<b[j]){
                    dp[i]=max(dp[i],dp[j]+1);
                }
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(dp[i]>max){
                max=dp[i];
            }
            
        }
        cout<<max<<endl;
    }
}