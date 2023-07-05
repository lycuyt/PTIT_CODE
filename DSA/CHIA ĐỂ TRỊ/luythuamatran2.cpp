#include<bits/stdc++.h>
using namespace std;
const long long mod = 1e9+7;
long n,k;
long long a[10][10], b[10][10];
void mul(long long a[10][10], long long b[10][10]){
    long long c[10][10];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++){
            c[i][j]=0;
            for(int k=0;k<n;k++){
                c[i][j]+=a[i][k]*b[k][j]%mod;
            }
        }
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
           a[i][j]=c[i][j]%mod;
        }
        
        
    }
}
void pow(long long a[10][10], long k){
    if(k<=1) return;
    pow(a,k/2);
    mul(a,a);
    if(k%2==1) mul(a,b);
}
 int main()
 {
    int t;
    cin>>t;
    while(t--)
    {
        
  
        cin>>n>>k;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                cin>>a[i][j];
                b[i][j]=a[i][j];
            }
        }
        //nhan 2 ma tran cap n voi nhau
        pow(a,k);
        long long sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i][n-1]%mod;
        }
        cout<<sum%mod<<endl;
        
    }
 }