#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int k;cin>>k;
        int a[n];
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        sort(a,a+n);
        int sum1=0;
        int sum2=0;
        k=min(k,n-k);
        for(int i=0;i<n;i++){
            if(i<k) sum1+=a[i];
            else sum2+=a[i];
        }
        cout<<abs(sum1-sum2)<<endl;
        
        

    }
}