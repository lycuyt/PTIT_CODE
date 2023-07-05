
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
        map<int,int>mp;
        for(int i=0;i<n;i++) {
            cin>>a[i];
            mp[a[i]]++;
        }
        int dem=0;
        int x=0;
        for(int i=0;i<n;i++){
            if(mp[a[i]]>dem){
                dem=mp[a[i]];
                x=a[i];
            }
        }
       if(dem>n/2) cout<<x;
       else cout<<"NO";
       cout<<endl;

    }
}
