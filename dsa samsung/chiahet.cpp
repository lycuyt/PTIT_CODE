#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n, k;
    cin>>n>>k;
    int cnt=0;
    for(int i=2;i<=n;i*=2 ){
       cnt+=n/i;
    }
   
    if(cnt>=k) cout<<"Yes";
    else cout<<"No";
}