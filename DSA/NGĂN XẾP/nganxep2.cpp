#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    stack <long long> st;
    while(t--)
    {
        string s;
        cin>>s;
        if(s=="PUSH"){
            long long n;
            cin>>n;
            cin.ignore();
            st.push(n);
        }else if(s=="POP"){
            if(!st.empty()){
                st.pop();
            }
        }else{
            if(st.empty()){
                cout<<"NONE"<<endl;
            }else{
                 cout<<st.top();
                cout<<endl;
            }
        }
    }
}