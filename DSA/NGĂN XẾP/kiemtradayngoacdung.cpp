#include<bits/stdc++.h>
using namespace std;
string solve(string s){
    stack<int>st;
        for(int i=0;i<s.size();i++)
        {
            if(s[i]=='(' ||s[i]=='{'||s[i]=='[' ) st.push(s[i]);
            else{
                if(s[i]==')'){
                    if(st.size() && st.top()=='(') st.pop();
                    else return "NO";
                }

                if(s[i]==']'){
                    if(st.size() && st.top()=='[') st.pop();
                    else return "NO";
                }

                if(s[i]=='}'){
                    if(st.size() && st.top()=='{') st.pop();
                    else return "NO";
                }
                
            }
        }
        if(st.size()) return "NO";
        else return "YES";
        
}
int main()
{
    int t;cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        cout<<solve(s)<<endl;
        
        
        
        
    }
}