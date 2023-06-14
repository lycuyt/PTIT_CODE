#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++) cin>>a[i];
    for(int  i=0;i<n;i++)
    {
        cout<<"Buoc "<<i<<": ";
        int key=a[i];
        int j=i-1;
        while (j>=0 && a[j]>key)
        {
            /* code */
            a[j+1]=a[j];
            j=j-1;
        }
        a[j+1]=key;
        for(int k=0;k<i+1;k++){
            cout<<a[k]<<" ";
        }
        cout<<endl;
    }
}