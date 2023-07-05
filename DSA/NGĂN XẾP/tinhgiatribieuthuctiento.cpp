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
        stack<int> st;
        for(int i=s.size()-1;i>=0;i--)
        {
            if(s[i]=='+' || s[i]=='-'|| s[i]=='*' || s[i]=='/' ||s[i] =='%'|| s[i]=='^'){
                int fi=st.top();st.pop();
                int se=st.top();st.pop();
                int tmp;
                if(s[i]=='*') tmp=fi*se;
                if(s[i]=='/') tmp=fi/se;
                if(s[i]=='+') tmp=fi+se;
                if(s[i]=='-') tmp=fi-se;
                if(s[i]=='%') tmp=fi%se;
                if(s[i]=='^') tmp=pow(fi,se);
                st.push(tmp);
                // cout<<tmp<<endl;

            }else{
                int k= int(s[i]-48);
    
                st.push(k);
            }
        }
        cout<<st.top()<<endl;
    }
}