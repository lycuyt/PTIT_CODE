#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        map<char,int> mp;
        int res=0;
        for(int i=0;i<s.size();i++){
            mp[s[i]]++;
            if(mp[s[i]]>res){
                res=mp[s[i]];
            }
        }
        // res la so lan xuat hien nhieu nhat cua 1 ki tu
        if(res<=s.size()-res && s.size()%2==0) cout<<1<<endl;
        else if(res<=(s.size()/2+1) && s.size()%2==1) cout<<1<<endl;
        else cout<<-1<<endl;
    }
}