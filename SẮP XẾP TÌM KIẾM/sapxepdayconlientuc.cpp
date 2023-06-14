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
       int b[n];
        //hop
       
        for(int i=0;i<n;i++) {
            cin>>a[i]; 
            b[i]=a[i];
        }
        sort(a,a+n);
        int dau,cuoi;
        for(int i=0;i<n;i++){
            if(b[i] != a[i]) {
                dau=i+1;
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(b[i]!= a[i]) {
                cuoi=i+1;
                break;
            }
        }
        cout<<dau<<" "<<cuoi;
        
        cout<<endl;

    }
}