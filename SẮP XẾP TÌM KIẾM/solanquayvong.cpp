#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--)
    {
        long n;cin>>n;
        long long a[n];
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        long long min=1e18;
        long long max=0;
        long vt;
        for(int i=0;i<n;i++)
        {
            if(a[i]<min) {
                min=a[i];
                vt=i;
            }
        }
        cout<<vt<<endl;
    }
}