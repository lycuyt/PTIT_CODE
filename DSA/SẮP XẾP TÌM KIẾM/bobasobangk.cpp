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
                if(binary_search(a+j+1,a+n,k-a[i]-a[j])){
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