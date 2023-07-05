#include<bits/stdc++.h>
using namespace std;
int main()
{
   int n;
   cin>>n;
   int a[n];
   for(int i=0;i<n;i++) cin>>a[i];
   long long sum=0;
   for(int i=0;i<n;i++)
   {
        if(a[i]>0){
            sum+=a[i];
        }
   }
   cout<<2*sum<<endl;
}