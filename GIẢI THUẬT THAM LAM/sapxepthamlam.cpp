#include<bits/stdc++.h>
using namespace std;
int check(int a[], int b[], int n)
{
    // a la mag thuong, b la mang da sap xep
    for(int i=0;i<n;i++)
    {
        if(a[i] != b[i] && a[i] != b[n-i-1])
        {
            return 0;
        }

    }
    return 1;
}
int main()
{
    int t;cin>>t;
    while (t--)
    {
        int n;cin>>n;
        int a[n];
        int b[n];
        for(int i=0;i<n;i++){
            cin>>a[i];
            b[i]=a[i];
        }
        sort(b, b+n);
        if(check(a,b,n)) cout<<"Yes"<<endl;
        else cout<<"No"<<endl;
        /* code */
    }
    

}