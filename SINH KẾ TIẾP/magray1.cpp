#include<iostream>
#include<algorithm>
#include<vector>
#include<bits/stdc++.h>

using namespace std;



int main()
{
    int t;cin>>t;
    while(t--)
    {
        int n;
        string c[1030];
        cin>>n;
        string a[1030],b[1030];
        a[0]="0";
        a[1]="1";
        b[0]="1";
        b[1]="0";
        int cnt=0;
        for(int i=2;i<=n;i++){
            int k=0;
            for(int j=0;j<pow(2,i-1);j++){
                a[j]="0"+a[j];
                c[k]=a[j];
                //  cout<<c[k]<<" ";
                 k++;
            }
            for(int j=0;j<pow(2,i-1);j++){
                b[j]="1"+b[j];
                c[k]=b[j];
                // cout<<c[k]<<' ';
                k++;
            }
            int l=k-1;
            for(int j=0;j<k;j++){
                a[j]=c[j];
                b[l]=c[j];
                l--;
            }
            // for(int i=0;i<k;i++){
            //     cout<<a[i]<<" ";
            // }
            // cout<<endl;
            //  for(int i=0;i<k;i++){
            //     cout<<b[i]<<" ";
            // }
            // cout<<endl;

        }

         for(int i=0;i<pow(2,n);i++){
                cout<<c[i]<<" ";
            }
        
        
        cout<<endl;
    }
}