

#include<bits/stdc++.h>
using namespace std;
 int l[1005];
 int a[1005];
int main()
{
    ios::sync_with_stdio(false);
    int n;
    cin>>n;
    
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    //day con tang dai nhat
   int ln=0;
    for(int i=0;i<n;i++) l[i]=1;
    for(int i=1;i<n;i++)
    {
        for(int j=0;j<i;j++)
        {
            if(a[i]>a[j]) l[i]=max(l[i],l[j]+1);
            if(ln<l[i]) ln=l[i];
        }
    }
    
   cout<<ln;

}