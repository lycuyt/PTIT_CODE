#include<bits/stdc++.h>
using namespace std;
bool cmp (pair<char,int> a, pair <char,int> b){
    return a.second>b.second;
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int d;cin>>d;
        string s;
        cin>>s;
        // sap xep
        map<char,int> mp;
        for(int i=0;i<s.size();i++){
            mp[s[i]]++;
        }
        pair<char,int> a[10000];
        int h=0;
        for(map<char,int>::iterator it=mp.begin();it!=mp.end();it++)
        {
            a[h].first=(*it).first;
            a[h].second=(*it).second;
            h++;
        }
        sort(a,a+h,cmp);
        // xu li
        char kq[10005];
        bool chuaxet[10005];
        for(int i=0;i<s.size();i++) chuaxet[i]=true;
        int kt=1;
        int j=0,k=h;
        int l;
        while(j<k){
            int p =a[j].second;
            l=j;
            
            while(chuaxet[l]==false) l++;
            // cout<<l<<endl;
            for(int t=0;t<p;t++)
            {
                if(l+(t*d)>s.size()){
                    kt=0;
                    break;
                    
                }
                    kq[l+(t*d)]=a[j].first;
                    // cout<<l+(t*d)<<" ";
                    chuaxet[l+(t*d)]=false;
            }
            if(kt==0){
                break;
            }
            j++;
        }
        if(kt==0) cout<<-1;
        else {
            // for(int i=0;i<s.size();i++){
            //     cout<<kq[i];
            // }
            cout<<1;
        }
        cout<<endl;

    }
}
// 1
// 3
// geeksforgeeks