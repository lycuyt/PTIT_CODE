#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int a[n];
         map<int,int> mp;
        for(int i=0;i<n;i++) {
            cin>>a[i];
            mp[a[i]]++;
        }
        int f[n];
        stack<int> st;
        for(int i=0;i<n;i++)
        {
            
            if(!st.empty() && mp[a[i]]> mp[a[st.top()]]){
               
                while(!st.empty() && mp[a[i]]> mp[a[st.top()]]){
                    int top=st.top();
                    // cout<<top<<" ";
                    f[top]=a[i];
                    st.pop();
                }
                st.push(i);
                
            }else {
                st.push(i);
                // cout<<i<<' ';
            }
        }
       while(!st.empty()){
            f[st.top()]=-1;
            // cout<<st.top();
            st.pop();
       }
       for(int i=0;i<n;i++) cout<<f[i]<<" ";
       cout<<endl;
    }
}