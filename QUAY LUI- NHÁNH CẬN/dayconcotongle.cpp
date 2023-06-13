#include<bits/stdc++.h>
using namespace std;
int a[20];
int n;
bool cmp(int a, int b){
    return a> b;
}
vector<int>v;
vector< vector<int> > res;// luu cac day con
void Try(int i, int s){
    for(int j=i;j<n;j++){
        v.push_back(a[j]);
        s+=a[j];
        if(s%2==1){
            res.push_back(v);
        }
        Try(j+1, s);
        v.pop_back();
        s=s-a[j];
    }
}

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        v.clear();
        res.clear();
        cin>>n;
      
        for(int i=0;i<n;i++)
        {
            cin>>a[i];
        }
        sort(a,a+n,cmp);
       Try(0,0);
        // cout<<res.size()<<endl;
        sort(res.begin(),res.end());
        for(int i=0;i<res.size();i++)
        {
            for(int j=0;j<res[i].size();j++)
            {
                cout<<res[i][j]<<" ";
            }
            cout<<endl;
        }
        
    }
}