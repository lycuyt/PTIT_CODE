
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--)
    {
        int n;cin>>n;
        long a[n];
        long long b[n];
        int k=0;
        for(int i=0;i<n;i++) cin>>a[i];
        for(int i=0;i<n;i++){
            b[k]=a[i]*a[i];
            k++;
        }
        sort(a,a+n);
        sort(b,b+n);
        int dem=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                long long m=a[i]*a[i] + a[j]*a[j];
                if(binary_search(b+j+1,b+n,m)){
                    dem++;
                }
                if(dem==1) break;
            }
            if(dem==1) break;
        }
        if(dem==0) cout<<"NO"<<endl;
        else cout<<"YES"<<endl;
    }
}