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
    vector< vector<int> > v;
    for(int i=0;i<n;i++) cin>>a[i];
    for(int  i=0;i<n-1;i++)
    {
        // cout<<"Buoc "<<i+1<<": ";
        for(int j=i+1;j<n;j++){
            if(a[i]>a[j]){
                swap(a[i],a[j]);
            }
        }
        vector<int>u;
        for(int k=0;k<n;k++){
            u.push_back(a[k]);
        }
        v.push_back(u);
       
    }
    int len=v.size();
    for(int i=len-1;i>=0;i--){
        cout<<"Buoc "<<i+1<<": ";
        for(int j=0;j<v[i].size();j++){
            cout<<v[i][j]<<" ";
        }
        cout<<endl;
    }
    }
    
}