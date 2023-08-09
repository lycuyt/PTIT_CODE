// #include<bits/stdc++.h>
// using namespace std;
// int n;
// long a[1000005];
// long long b[1000005];

// long long cal(long l, long r)
// {
//     if(l==r) return a[l];
//     if(l>r) return -1e9;
//     long mid=(l+r)/2;
//     long long res1=cal(l,mid);
//     long long res2=cal(mid+1,r);
//     long long minb=1e18;
//     for(int i=l;i<=mid;i++)
//     {
//         minb=min(minb, b[i]);
        
//     }
//     long long maxb=-1e18;
//     for(int i=mid+1;i<=r;i++)
//     {
//         maxb=max(maxb, b[i]);
//     }
//     return max(max(res1, res2),maxb-minb);
// }
// int main()
// {
//     cin>>n;
//     for(int i=1;i<=n;i++) cin>>a[i];
//     b[1]=a[1];
//     for(int i=2;i<=n;i++)
//     {
//         b[i]=b[i-1]+a[i];
//     }
//     // for(int i=1;i<=n;i++) cout<<b[i]<<" ";
//     cout<<cal(1, n);
// }
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;cin>>n;
    long long a[n+1];
    for(int i=1;i<=n;i++) cin>>a[i];
    long long f[n+1];
    f[0]=-1e18;
    // f[i] chứa tổng dãy con liên tiếp dài nhất tình đên phần tử thưs i
    long long res=-1e18;
    for(int i=1;i<=n;i++)
    {
        f[i]=max(f[i-1]+a[i], a[i]);
        res=max(res,f[i]);
    }
    cout<<res<<endl;
}