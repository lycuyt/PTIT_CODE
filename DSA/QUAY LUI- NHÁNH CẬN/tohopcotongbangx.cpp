#include<bits/stdc++.h>
using namespace std;
int n,x;
int a[25];

vector<string> v;
void Try( int limit,int sum,vector<int> b)
{
    if(sum==x)
    {
       string res="";
        res+="[";
        for(int i=0;i<b.size();i++){
            res+=to_string(b[i]);
            if(i != b.size()-1) res+=" ";
        }
        res+="]";
        v.push_back(res);
    }
    for(int i=0;i<n;i++)
    {
       if(a[i]>=limit && sum+a[i]<=x){
            b.push_back(a[i]);
            Try(a[i],sum+a[i],b);
            b.pop_back();
       }

    }
}
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int t;
    cin>>t;
    while(t--)
    {
        cin>>n>>x;
        for(int i=0;i<n;i++) cin>>a[i];
        sort(a,a+n);
        vector<int>b;
        v.clear();
        Try(1,0,b);
        if(v.size()==0) cout<<-1;
        else {
            // cout<<v.size()<<" ";
            for(int i=0;i<v.size();i++){
                cout<<v[i];
            }
        }
        cout<<endl;
       
        
    }
}