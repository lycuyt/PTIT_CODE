#include<bits/stdc++.h>
using namespace std;
int thuannghich(string s){
    for(int i=0;i<s.size()/2;i++){
        if(s[i] != s[s.size()-i-1]) return 0;
    }
    return 1;
}
int songuyento(string s){
    for(int i=0;i<s.size();i++){
        if(s[i]!='2'&& s[i]!='3' && s[i] != '5' && s[i]!='7') return 0;
    }
    return 1;
}
int main(){
    int t;cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        if(thuannghich(s) && songuyento(s)) cout<<"YES"<<endl;
        else cout<<"NO"<<endl;
    }
}