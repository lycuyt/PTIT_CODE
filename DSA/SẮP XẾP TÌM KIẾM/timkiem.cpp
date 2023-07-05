#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    while (t--)
    {
        int n,x;
        cin>>n>>x;
        int a[n];
        set<int >se;
        for(int i=0;i<n;i++){
            cin>>a[i];
           
        }
        if(binary_search(a,a+n,x) ) cout<<1;
        else cout<<-1;
        
        cout<<endl;
        /* code */
    }
    
}