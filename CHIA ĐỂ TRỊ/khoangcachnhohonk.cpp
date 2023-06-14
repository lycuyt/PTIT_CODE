#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
       int n,k;
       cin>>n>>k;
       int a[n];
       for(int i=0;i<n;i++) cin>>a[i];
       sort(a,a+n);
       long long dem=0;
       for(int i=0;i<n;i++){
            int ans= lower_bound(a+i+1,a+n, a[i]+k)-a;
            dem+=ans-i-1;
       }
       cout<<dem<<endl;
        
    }
}