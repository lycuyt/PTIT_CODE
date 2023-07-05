#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,m;
        cin>>n>>m;
        int a[n],b[m];
        int k=(n-1)+(m-1);
        int c[k+1];
        for(int i=0;i<n;i++) cin>>a[i];
        for(int i=0;i<m;i++) cin>>b[i];
        memset(c,0,sizeof(c));
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                c[i+j]=c[i+j]+b[i]*a[j];
            }
        }
        for(int i=0;i<=k;i++){
            cout<<c[i]<<" ";
        }
        cout<<endl;
    }
}