#include<bits/stdc++.h>
using namespace std;
int kt=0;
int sum=0;
void Try(int i,int s,int a[], int n)
{
    if(i==n || kt==1 || s==sum/2){
        if(s==sum/2) kt=1;
        return;
    }
   if(a[i]+s<=sum/2){
    Try(i+1,s+a[i],a,n);
   }
   Try(i+1,s,a,n);
}
   
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        kt=0;
        sum=0;
        int a[n+5];
        for(int i=1;i<=n;i++)
        {
            cin>>a[i];
            sum+=a[i];
        }
        if(sum%2!=0){
            cout<<"NO"<<endl;
        }else{
            Try(1,0,a,n);
            if(kt==0) cout<<"NO"<<endl;
            else cout<<"YES"<<endl;
        }
    }
}