#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--)
    {
        long n,k;
        cin>>n>>k;
        long a[n];
        for(int i=0;i<n;i++) {
            cin>>a[i];
        }
        sort(a,a+n);
        long dem=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>k) break;
            for(int j=i+1;j<n;j++)
            {
                int index=upper_bound(a+j+1,a+n,k-a[i]-a[j]-1)-a;
               
                 dem+=index-j-1;
               
            }


        }
        cout<<dem<<endl;
    }
}