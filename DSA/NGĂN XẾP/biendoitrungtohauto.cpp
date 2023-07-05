#include<bits/stdc++.h>
using namespace std;
int uutien(char c)
{
    if(c=='^') return 5;
    if(c=='*'|| c=='/') return 4;
    if(c=='+'|| c=='-' ) return 3;
    return 2;
}
int main()
{
     ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int t;
    cin>>t;
    cin.ignore();
    while (t--)
    {
        string s;
        cin>>s;
        string res="";
        stack< char> st;
        for(int i=0;i< s.size();i++)
        {
            if(s[i]>='A' && s[i]<='Z') res+=s[i];
            else if(s[i]>='a' && s[i]<='z') res+=s[i];
            else if(s[i]=='(') st.push(s[i]);
            else if(s[i]==')')
            {
                while(!st.empty() && st.top() != '('){
                    res+=st.top();
                    st.pop();
                }
                st.pop();
            }else if(s[i]=='+' || s[i]=='-' || s[i]=='*' || s[i]=='/' || s[i]=='^')
            {
                while(!st.empty() && uutien(st.top())>= uutien(s[i]))
                {
                    res+=st.top();
                    st.pop();
                    
                }
                st.push(s[i]);
            }
             
        }
        while (!st.empty()) {
                if (st.top() != '(') res += st.top();
                st.pop();
         }
        cout<<res<<endl;

    }
    
}