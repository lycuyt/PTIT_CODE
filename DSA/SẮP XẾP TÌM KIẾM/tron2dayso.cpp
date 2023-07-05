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
        long a[n];
        long b[m];
        //hop
       multiset<int>se;
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
        

    }
}