#include<bits/stdc++.h>
using namespace std;
string solve(string s){
    stack<char> st;
        int len=s.size();
        for(int i=len-1;i>=1;i--){
            if(s[i]=='(' && s[i-1]=='-')
            {
                stack<char>tmp;
                while(st.top()!=')')
                {
                    char top=st.top();
                    if(top == '-') tmp.push('+');
                    else if(top=='+') tmp.push('-');
                    else tmp.push(top);
                    st.pop();

                }
                st.pop();//bo dau )
                //chen lai cac phan tu vao st
                while(!tmp.empty())
                {
                    st.push(tmp.top());
                    tmp.pop();
                }
            }else if(s[i]=='(' && s[i-1]=='+'){
                 stack<char>tmp;
                while(st.top()!=')')
                {
                    char top=st.top();
                    // if(top == '-') tmp.push('+');
                    // else if(top=='+') tmp.push('-');
                    // else tmp.push(top);
                    tmp.push(top);
                    st.pop();

                }
                st.pop();//bo dau )
                //chen lai cac phan tu vao st
                while(!tmp.empty())
                {
                    st.push(tmp.top());
                    tmp.pop();
                }
            }else{
                st.push(s[i]);
            }
        }
        st.push(s[0]);
        // bo het ngoac con du o dau va cuoi
        string ans="";
        while(!st.empty())
        {
            if(st.top() != ')' && st.top() != '(')  ans+=st.top();
            
            st.pop();
        }
        return ans;
}
int main()
{
    ios_base::sync_with_stdio(0);cin.tie(0);
    int t;
    cin>>t;
    cin.ignore();
    while(t--)
    {
        string s,p;
        cin>>s>>p;
       if(solve(s)==solve(p)){
        cout<<"YES";
       }else cout<<"NO";
        cout<<endl;
    }
}