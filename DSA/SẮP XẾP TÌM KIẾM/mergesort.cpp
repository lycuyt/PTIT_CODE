#include<bits/stdc++.h>
using namespace std;
//tron 2 day : day 1[l,m] day2 [m+1,r]
void merge(int a[], int l, int m, int r){
    //copy ve trai ra 1 mang, ve phai ra 1 mang
    vector<int> x(a+l,a+m+1);
    vector<int> y(a+m+1,a+r+1);
    //tron 2 vector 
    int i=0,j=0;
    while (i<x.size()&& j<y.size())
    {
        if(x[i]<=y[j]){
            a[l]=x[i];
            ++l;
            ++i;
        }else{
            a[l]=y[j];
            ++l;
            ++j;
        }
        /* code */
    }
    while(i<x.size()){
        a[l]=x[i];
        ++l;++i;
    }
    while (j<y.size())
    {
        a[l]=y[j];
        ++l;++j;
        /* code */
    }  
}
void mergesort(int a[], int l,int r){
    if(l>=r) return;
    int m=(l+r)/2;
    mergesort(a,l,m);
    mergesort(a,m+1,r);
    merge(a,l,m,r);
}
int main()
{
    int t;
    cin>>t;
    while (t--)
    {
        int n;
        cin>>n;
        int a[n];
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        mergesort(a,0,n-1);
        for(int i=0;i<n;i++) cout<<a[i]<<" ";
        cout<<endl;
        /* code */
    }
    
}