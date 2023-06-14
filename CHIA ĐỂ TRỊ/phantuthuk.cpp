#include<bits/stdc++.h>
using namespace std;
void merge(int c[],int a[], int b[], int n, int m){
    //tron 2 mang a,b thanh c
    int i=0,j=0,l=0;
    while(i<n && j<m){
        if(a[i]<=b[j]){
            c[l]=a[i];
            l++;
            i++;
        }else{
            c[l]=b[j];
            l++;
            j++;
        }
    }
    while(i<n){
        c[l]=a[i];
        l++;
        i++;
    }
    while(j<m){
        c[l]=b[j];
        l++;
        j++;
    }
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int m;
        cin>>m;
        int k;cin>>k;
        int a[n], b[m], c[n+m];
        for(int i=0;i<n;i++) cin>>a[i];
        for(int i=0;i<m;i++) cin>>b[i];
        // tron 2 mang da sap xep -> 1 mang sap xep
        merge(c,a,b,n,m);
        // for(int i=0;i<n+m;i++) cout<<c[i]<<" ";
        cout<<c[k-1]<<endl;
        

    }
}