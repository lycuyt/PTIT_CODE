#include<bits/stdc++.h>
using namespace std;
string a="1ABCDEFGHIJKLMNOPQRSTUVWXYZ";
char find(int n,long long k){
   
    long long m=pow(2,n-1);
    if(k==1) return a[1];
    if(k==m) return a[n];
    else if(k<m){
        return find(n-1,k);
    }else{
        return find(n-1,k-m);
    }

}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        long long k;cin>>k;
        
        cout<<find(n,k)<<endl;


    }
}