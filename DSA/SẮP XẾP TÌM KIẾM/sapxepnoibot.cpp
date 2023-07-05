#include<bits/stdc++.h>
using namespace std;
int check(int a[], int n){
    for(int i=0;i<n-1;i++){
        if(a[i]>a[i+1]) return 0;
    }
    return 1;
}
int main()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++) cin>>a[i];
    for(int  i=0;i<n;i++)
    {
        cout<<"Buoc "<<i+1<<": ";
        for(int j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]){
                swap(a[j],a[j+1]);
            }
        }
        for(int k=0;k<n;k++) cout<<a[k]<<" ";
        //kiem tra xem nos dung mang can sx chua 
        if(check(a,n)==1){
            break;
        }
        cout<<endl;
    }
}