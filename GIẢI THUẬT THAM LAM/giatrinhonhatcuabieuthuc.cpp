#include<iostream>
#include<math.h>
#include<algorithm>
#include<vector>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        long n;
        cin>>n;
        long long a[n], b[n];
        for(int i=0;i<n;i++) cin>>a[i];
        for(int i=0;i<n;i++) cin>>b[i];
        sort(a,a+n);
        long long sum=0;
        sort(b,b+n, greater<long long> ());
        //  for(int i=0;i<n;i++) cout<<a[i]<<" ";
        //  cout<<endl;
        // for(int i=0;i<n;i++) cout<<b[i]<<" ";
        for(int i=0;i<n;i++){
            sum+=a[i]*b[i];
        }
        cout<<sum<<endl;
        
    }
}