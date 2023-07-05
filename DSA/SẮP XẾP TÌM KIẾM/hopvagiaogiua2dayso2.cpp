#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,m;
        cin>>n>>m;
        int a[n];
        int b[m];
        //hop
        set<int> se;
        for(int i=0;i<n;i++) {
            cin>>a[i]; 
            se.insert(a[i]);
            }
        for(int i=0;i<m;i++) {
            cin>>b[i]; se.insert(b[i]);}

        for(auto it:se){
            cout<<it<<" ";
        }
        cout<<endl;
       //giao
        set<int> k;
        for(int i=0;i<n;i++){
            k.insert(a[i]);
        }
        for(int i=0;i<m;i++){
            if(k.find(b[i]) != k.end()) cout<<b[i]<<" ";
        }
        cout<<endl;

    }
}