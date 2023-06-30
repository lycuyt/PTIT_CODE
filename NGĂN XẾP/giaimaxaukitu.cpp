#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        int n= s.size();
        int i=n-1;
        stack<string> st;
        while(i>=0){
            if(s[i]=='['){
                string res="";
                while(!st.empty() && st.top() != "]")
                {
                    res+=st.top();
                    st.pop();
                }
                st.pop();
                st.push(res);
                i--;
            }else if(s[i]>='0' && s[i]<='9'){
                stack<int> so;
                while(s[i]>='0' && s[i]<='9'){
                    so.push(s[i]-48);
                    i--;
                }
                int cnt=0;
                while(!so.empty()){
                    cnt=cnt*10+so.top();
                    so.pop();
                }
                string ans="";
                for(int j=0;j<cnt;j++){
                    ans+= st.top();
                }
                st.pop();
                st.push(ans);
            }else{
                st.push(string(1,s[i]));
                i--;
            }
        }
        while(!st.empty()){
            cout<<st.top();
            st.pop();
        }
        cout<<endl;
    }
}