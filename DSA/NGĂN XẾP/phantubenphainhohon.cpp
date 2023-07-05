#include<bits/stdc++.h>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(0);cin.tie(0);
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int a[n];
        int d[n];
        int vt[n];
        for(int i=0;i<n;i++) {cin>>a[i];vt[i]=-1;}
        stack<int> st;
        for(int i=0;i<n;i++)
        {
            if(st.empty())
            {
                st.push(i);
            }
            else{
                while(!st.empty() && a[i]>a[st.top()])
                {
                    
                    //st.top() la vi tri bat dau xet phan tu be hon
                    int v=st.top();
                    for(int j=i+1;j<n;j++)
                    {
                         if(a[j]<a[i])
                          {
                             vt[v]=a[j];
                              break;
                          }
                     }
                    
                    st.pop();

                }
                st.push(i);
            }
        }
        while(!st.empty())
        {
           
            vt[st.top()]=-1;
            st.pop();
        }
        //mang d gom nhung phan tu lon hon dau tien ben phai
        for(int x: vt) cout<<x<<" ";
        
        cout<<endl;

    }
}