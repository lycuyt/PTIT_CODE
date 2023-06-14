#include<bits/stdc++.h>
using namespace std;
const long long mod=1e9+7;
long long MUL(long long a, long long b) {
    if ( b == 0 ) return 0;
    long long tmp = MUL(a,b/2);
    if (b%2==1) return (tmp*2+a)%mod;
    return tmp*2%mod;
}


long long POW(long long n, long long k) {
    if ( k== 0 ) return 1;
    if ( k== 1 ) return n; 
    long long tmp = POW(n,k/2);
    long long a = MUL(tmp,tmp);
    if (k%2==1) return a*n%mod;
    return a%mod;
}


int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;cin>>n;
        long k;cin>>k;
        
        cout << POW(n,k) % mod;
        cout<<endl;

    }
}