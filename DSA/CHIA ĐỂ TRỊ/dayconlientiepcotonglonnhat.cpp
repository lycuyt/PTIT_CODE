#include<bits/stdc++.h>
using namespace std;
//thuat toan kadane
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;cin>>n;
        int a[n];
        for(int i=0;i<n;i++) cin>>a[i];
        int res=0;
        int ans=-100;
        for(int i=0;i<n;i++)
        {
           
           res+=a[i];
           ans=max(res,ans);
           if(res<0) res=0;
            
        }
        cout<<ans<<endl;
    }
}