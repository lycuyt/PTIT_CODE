#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n, k;
        cin>>n>>k;
        int a[k];
        for(int i=0;i<k;i++) cin>>a[i];
        // tap con ke tiep
        int i=k-1;
        while(a[i]==n-k+i+1 && i>=0) i--;
        if(i<0){
           for(int l=0;l<k;l++){
            cout<<l+1<<' ';
           }
        }
        else{
            a[i]++;
            for(int j=i+1;j<k;j++){
                a[j]=a[j-1]+1;
            }
            for(int l=0;l<k;l++){
            cout<<a[l]<<' ';
           }
        }
        
        cout<<endl;
    }
}