#include<bits/stdc++.h>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(0);cin.tie(0);
    int t;
    cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        stack<string> st;
        int len=s.size();
        for(int i=0;i<len;i++)
        {
            if(s[i]=='+' || s[i]=='-'|| s[i]=='*' || s[i]=='/' ||s[i] =='%'|| s[i]=='^'){
                string fi=st.top();st.pop();
                string se=st.top();st.pop();
                string tmp= s[i]+se+fi;
                st.push(tmp);
            }else st.push(string(1,s[i]));
        }
        cout<<st.top()<<endl;
    }
}