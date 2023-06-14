#include<bits/stdc++.h>
using namespace std;
const long long mod=1e9+7;
long long pow(long long n, long long k)
{
    if(k==1) return n%mod;
    long long tmp=pow(n,k/2);
    if(k%2==0) return (tmp*tmp%mod);
    else return (tmp*tmp%mod)*n%mod;
}
int main()
{
    int t;
    cin>>t;
    while (t--)
    {
        long long n;
        cin>>n;
        long long m=n,k=0;
        //tim so dao
        while(m){
            k=10*k+m%10;
            m=m/10;
        }
        //tim n mu k
        cout<<pow(n,k)<<endl;
        /* code */
    }
    
}