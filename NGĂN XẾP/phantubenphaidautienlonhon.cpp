#include<iostream>
#include<algorithm>
#include<string>
#include<iomanip>
#include<vector>
#include<set>
#include<map>
#include<stack>
#include<queue>
#define ll long long
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        long n;
        cin>>n;
        long a[n];
        for(long i=0;i<n;i++) cin>>a[i];
        int d[n];
        stack<long> st;
        for(int i=0;i<n;i++)
        {
            if(st.size()==0) st.push(i);
            else {
               
                    while( st.size()>0 && a[i]>a[st.top()]){
                        d[st.top()]=a[i];
                        st.pop();
                    }
                    st.push(i);
                   

            }
        }
        while(!st.empty()){
            d[st.top()]=-1;
            st.pop();
        }
        for(int x: d){
            cout<<x<<" ";
        }

        cout<<endl;
    }
}