
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
        string a[n];
        for(int i=0;i<n;i++) cin>>a[i];
        set<char>se;
        for(int i=0;i<n;i++){
            for(int j=0;j<a[i].size();j++){
                se.insert(a[i][j]);
            }
        }
        for(auto it:se){
            cout<<it<<" ";
        }
        cout<<endl;

    }
}
