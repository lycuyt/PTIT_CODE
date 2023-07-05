#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--)
    {
        int n,k;
        cin>>n>>k;
        long a[n];
        for(int i=0;i<n;i++) {
            cin>>a[i];
        }
        vector<long>v;
        int min=0;
        for(int i=0;i<k;i++){
            if(a[i]>min) min=a[i];
        }
        v.push_back(min);
        for(int i=k;i<n;i++){
            min=0;
            for(int j=i-k+1;j<=i;j++){
                if(a[j]>min) min=a[j];
            }
            v.push_back(min);
        }
        for(int i=0;i<v.size();i++){
            cout<<v[i]<<" ";
        }
        cout<<endl;

    }
}