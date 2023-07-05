#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++) cin>>a[i];
    vector<vector<int> > v;
    for(int  i=0;i<n-1;i++)
    {
        
        int min=i;
        for(int j=i+1;j<n;j++){
            if(a[min]>a[j]){
                min=j;
            }
        }
        swap(a[i],a[min]);
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