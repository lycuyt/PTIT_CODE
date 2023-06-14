#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--)
    {
        long n;
        cin>>n;
        long long a[n];
        long long b[n-1];
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        for(int i=0;i<n-1;i++){
            cin>>b[i];
        }
        // sort(a,a+n);//nlogn
        // sort(b,b+n-1);//nlogn
        int vt;
        for(int i=0;i<n;i++){
            if(a[i]-b[i]!=0) {
                vt=i+1;
                break;
            }
        }
        cout<<vt<<endl;
    }
}