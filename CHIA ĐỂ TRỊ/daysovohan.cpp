#include<bits/stdc++.h>
using namespace std;
const long long mod = 1e9+7;
void mul(long long f[2][2], long long m[2][2]){
    long long x=(f[0][0]*m[0][0]%mod +f[0][1]*m[1][0]%mod)%mod;
    long long y=(f[0][0]*m[0][1]%mod +f[0][1]*m[1][1]%mod)%mod;
    long long z=(f[1][0]*m[0][0]%mod +f[1][1]*m[1][0]%mod)%mod;
    long long t=(f[1][0]*m[0][1]%mod +f[1][1]*m[1][1]%mod)%mod;
    f[0][0]=x;
    f[0][1]=y;
    f[1][0]=z;
    f[1][1]=t;
}
long long f[2][2],m[2][2];
void pow(long long f[2][2], long n){
    if(n<=1) return ;
    pow(f,n/2);
    mul(f,f);
    if(n%2==1) mul(f,m);
}
 int main()
 {
    int t;
    cin>>t;
    while(t--)
    {
        
        long n;
        cin>>n;
       
        f[0][0]=m[0][0]=1;
        f[0][1]=m[0][1]=1;
        f[1][0]=m[1][0]=1;
        f[1][1]=m[1][1]=0;
        pow(f,n);
        cout<<f[0][1]<<endl;
    }
 }