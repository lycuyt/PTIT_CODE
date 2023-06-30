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
        for(int i=0;i<s.size();i++)
        {
            if(s[i]=='+' || s[i]=='-'|| s[i]=='*' || s[i]=='/' ||s[i] =='%'|| s[i]=='^'){
                int fi=st.top();st.pop();
                int se=st.top();st.pop();
                int tmp;
                if(s[i]=='*') tmp=fi*se;
                if(s[i]=='/') tmp=se/fi;
                if(s[i]=='+') tmp=fi+se;
                if(s[i]=='-') tmp=se-fi;
                if(s[i]=='%') tmp=se%fi;
                if(s[i]=='^') tmp=pow(se,fi);
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