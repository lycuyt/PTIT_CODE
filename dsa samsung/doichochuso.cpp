#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--)
    {
        int k;
        cin>>k;
        string s;
        cin>>s;
        for(int i=0;i<s.size();i++){
            if(k==0) break;
            int max=i;
            for(int j=i+1;j<s.size();j++){
                if(s[j]>=s[max]){
                    max=j;
                }
            }
            if(s[max]>s[i]){
                swap(s[max], s[i]);
                k--;
            }
        }
        cout<<s<<endl;
    }
}