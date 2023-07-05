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
       long a[n];
       for(int i=0;i<n;i++) cin>>a[i];
       stack<long> st;
        long long res=0;
      int i=0;
      while(i<n){
            if(st.empty() || a[i]>=a[st.top()]){
                st.push(i);
                i++;
            }else{
                long idx=st.top();//chi so cua cot o dinh stack
                st.pop();
                // tinh toan dien tich
                if(st.empty()){
                    long long ans =(long long) a[idx]*i;
                    res=max(res,ans);
                }else{
                    long long ans =(long long) a[idx]*(i-st.top()-1);
                    res=max(res,ans);
                }
            }
       }
       while(!st.empty()){
            long idx=st.top();
            st.pop();
           if(st.empty()){
                    long long ans =(long long) a[idx]*i;
                    res=max(res,ans);
                }else{
                    long long ans =(long long) a[idx]*(i-st.top()-1);
                    res=max(res,ans);
                }
       }
       cout<<res<<endl;
        
    }
}