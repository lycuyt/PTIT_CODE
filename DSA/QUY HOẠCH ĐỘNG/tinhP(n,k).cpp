#include<bits/stdc++.h>
using namespace std;
const long long mod=1e9+7;
int main()
{
   
   int t;cin>>t;
   while(t--)
   {
    int n,k;
    cin>>n>>k;
    long long p=1;
    for(int i=n;i>=n-k+1;i--){
        p=p*i%mod;
    }
    cout<<p<<endl;
   }
}