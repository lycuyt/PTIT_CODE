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
        int a[n];
        for(int i=0;i<n;i++) cin>>a[i];

        int l[n]={0},r[n]={0};
        for(int i=0;i<n;i++)
        {
            l[i]=a[i];
            for(int j=0;j<i;j++){
                if(a[i]>a[j]){
                    l[i]=max(l[i],l[j]+a[i]);
                }
                
            }
        }
        for(int i=n-1;i>=0;i--){
            r[i]=a[i];
            for(int j=n-1;j>i;j--){
                if(a[i]>a[j]){
                    r[i]=max(r[i],r[j]+a[i]);
                }
            }
        }
        
        int res=0;
        for(int i=0;i<n;i++){
            
            res=max(res,l[i]+r[i]-a[i]);
        }
        cout<<res<<endl;
    }
}