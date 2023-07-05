#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        long n;
        cin>>n;
        long long x;
        cin>>x;
        long long a[n];
        for(long i=0;i<n;i++) cin>>a[i];
        //ptu lon nhat cua mang a ma nho hon hoac bang x
        int vt=upper_bound(a,a+n,x)-a;
        if(vt==0) cout<<-1<<endl;
        else cout<<vt<<endl;
        
    }
}