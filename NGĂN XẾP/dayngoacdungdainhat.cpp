#include<iostream>
#include<algorithm>
#include<string>
#include<iomanip>
#include<vector>
#include<set>
#include<map>
#include<stack>
#include<queue>
#include<bits/stdc++.h>
#define ll long long
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        int n=s.size();
        stack<int>st;
        for(int i=0;i<s.size();i++)
        {
            if((s[i]=='(') || (st.size()==0 && s[i]==')')) st.push(i);
            else {
                if(s[st.top()]=='('){
                    st.pop();
                }else st.push(i);
            }
        }
        int a[n];
        memset(a,-1,sizeof(a));
        while(!st.empty())
        {
            a[st.top()]=st.top();
            st.pop();
        }
    //    for(int i=0;i<n;i++)
    //    {
    //     cout<<a[i]<<" ";
    //    }

    //     cout<<endl;
        //dem so xau co nhieu so -1 nhat
        int j=0;
        int cnt=0;
        int dem=0;
        while(j<n)
        {
            
            if(a[j]==-1){
                dem++;
                cnt=max(cnt,dem);
                j++;
            }else{
                dem=0;
                j++;
            }
        }
        cout<<cnt<<endl;
        
    }
}