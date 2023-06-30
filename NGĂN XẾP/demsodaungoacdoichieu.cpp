#include<bits/stdc++.h>
#include<stack>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
       string s;
       cin>>s;
       stack<char> st;
       // loai bo dau ngoac dung trong day
       for(int i=0;i<s.size();i++)
       {
            if(s[i]==')'){
                if(!st.empty() && st.top()=='('){
                    st.pop();
                }else st.push(s[i]);
            }
            else{
                st.push(s[i]);
            }
       }
       int dem=0;
       int d1=0, d2=0;
       while( !st.empty())
       {
        if(st.top()=='(') d1++;
        else d2++;
        st.pop();
       }
        if(d2%2==0 && d1%2==0) dem=d1/2 + d2/2;
        else dem=d1/2+ d2/2 +2;
        cout<<dem<<endl;


    }
}