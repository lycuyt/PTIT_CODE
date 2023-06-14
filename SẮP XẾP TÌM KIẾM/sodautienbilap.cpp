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
        long a[n];
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        
        map<long,int>mp;
        for(int i=0;i<n;i++){
            mp[a[i]]++;
            
        }
        long vt=0;
        for(int i=0;i<n;i++){
            if(mp[a[i]]>1) {
                vt=a[i];
                break;
            }
        }
        if(vt==0) cout<<"NO"<<endl;
        else{
            cout<<vt<<endl;
        }
        
    }
}