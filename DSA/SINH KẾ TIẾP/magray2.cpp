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
        // sinh ma gray
        string s;
        cin>>s;
        int n=s.size();
        string c[1030];
        
        string a[1030],b[1030];
        a[0]="0";
        a[1]="1";
        b[0]="1";
        b[1]="0";
        int cnt=0;
        vector<string> v;
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
                v.push_back(c[i]);
            }
        
        // sinh nhi phan 
        int x[1030];
        vector<string> u;
        for(int i=0;i<n;i++) x[i]=0;
        for(int i=0;i<pow(2,n);i++)
        {
            string res="";
            for(int k=0;k<n;k++){
                res+=to_string(x[k]);
            }
            //sinh
            int j=n-1;
            while(x[j]==1 && j>=0){
                x[j]=0;
                j--;
            }
            x[j]=1;
            
            u.push_back(res);

        }
        for(int i=0;i<v.size();i++){
            if(s==v[i]){
                cout<<u[i];
                break;
            }
        }
        cout<<endl;
    }
}