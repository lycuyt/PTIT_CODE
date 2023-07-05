#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while (t--)
    {
        int n;
        cin>>n;
        int a[n];
        for(int i=0;i<n;i++)
        {
            cin>>a[i];
        }
        // sap xeo chon
        int ans=0;
        for(int i=0;i<n;i++){
            int min=a[i];
            int m=0;
            for(int j=i+1;j<n;j++){
                if(a[j]<min){
                    min=a[j];
                    m=j;
                }
            }
            if(a[i]>min){
                swap(a[i],a[m]);
                ans++;
            }
        }
        
        cout<<ans<<endl;
        
    }
    
}