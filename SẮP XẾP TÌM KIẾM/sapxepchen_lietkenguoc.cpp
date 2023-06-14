#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++) cin>>a[i];
    vector< vector<int> > v;
    for(int  i=0;i<n;i++)
    {
        // cout<<"Buoc "<<i<<": ";
        int key=a[i];
        int j=i-1;
        while (j>=0 && a[j]>key)
        {
            /* code */
            a[j+1]=a[j];
            j=j-1;
        }
        a[j+1]=key;
        vector<int> u;
        for(int k=0;k<i+1;k++){
           u.push_back(a[k]);
        }
        v.push_back(u);
       
    }
     int len=v.size();
    for(int i=len-1;i>=0;i--){
        cout<<"Buoc "<<i<<": ";
        for(int j=0;j<v[i].size();j++){
            cout<<v[i][j]<<" ";
        }
        cout<<endl;
    }

}