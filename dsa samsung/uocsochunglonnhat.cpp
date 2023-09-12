#include<bits/stdc++.h>
using namespace std;
int bcnn(int a, int b){
    return a*b/__gcd(a,b);
}
int main()
{
    int t;cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int a[n];
        for(int i=0;i<n;i++) cin>>a[i];
        int b[n+1];
        b[0]=a[0];
        for(int i=1;i<n;i++){
            b[i]=bcnn(a[i-1], a[i]);
            
        }
        b[n]=a[n-1];
        for (int x : b) cout<<x<<" ";
        cout<<endl;
    }
}