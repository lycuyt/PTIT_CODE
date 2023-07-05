#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    while (t--)
    {
        int n;
        cin>>n;
        int a[n];
        set<int >se;
        for(int i=0;i<n;i++){
            cin>>a[i];
            se.insert(a[i]);
        }
        sort(a,a+n);
        int max=a[n-1];
        int min=a[0];
        int dem=0;
        for(int i=min;i<=max;i++){
            if(se.find(i) == se.end()) dem++;
        }
        cout<<dem;
        cout<<endl;
        /* code */
    }
    
}