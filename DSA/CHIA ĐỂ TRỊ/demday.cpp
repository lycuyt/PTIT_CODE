#include<bits/stdc++.h>
using namespace std;
const long long mod=123456789;
long long pow(long long n){
    if(n==0) return 1%mod;
    if(n==1) return 2%mod;
    long long tmp=pow(n/2);
    if(n%2==0) return tmp*tmp%mod;
    else return (tmp*tmp%mod)*2%mod;
}
int main()
{
    int t;
    cin>>t;
    while (t--)
    {
        long long n;
        cin>>n;
        // tinh 2^(n-1)
        n=n-1;
        //tinh pow(2,n)
        /* code */
        cout<<pow(n)<<endl;
    }
    
}