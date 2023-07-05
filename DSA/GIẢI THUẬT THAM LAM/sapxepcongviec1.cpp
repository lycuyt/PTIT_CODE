#include<bits/stdc++.h>
using namespace std;
bool cmp(pair<int,int> v, pair<int,int>u){
    return v.second<u.second;
}
int main(){
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int s[n];
        int f[n];
        for(int i=0;i<n;i++) cin>>s[i];//tgian bat dau
        for(int i=0;i<n;i++) cin>>f[i];//tgian ket thuc
        pair<int,int> c[n];
        for(int i=0;i<n;i++){
            c[i].first=s[i];
            c[i].second=f[i];
        }
        sort(c,c+n,cmp);
        vector <int> v;
        v.push_back(0);
        int j=1;
        int i=0;
        while(j<n){
            if(c[i].second <= c[j].first)
            {
                i=j;
                v.push_back(j);
                j++;
            }else{
                j++;
            }
        }
        
        cout<<v.size()<<endl;
    }
}