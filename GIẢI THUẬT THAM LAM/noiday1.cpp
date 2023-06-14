#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        long long a[n];
        priority_queue<long long, vector<long long>, greater<long long>> q;
        for(int i=0;i<n;i++)
        {
            cin>>a[i];
            q.push(a[i]);
        }
        long long opt=0;
        while(q.size()>1)
        {
            long long fi= q.top(); q.pop(); 
            // cout<<fi<<endl;
            long long se= q.top(); q.pop();
            // cout<<se<<endl;
            opt+=(fi+se);
            // cout<<opt<<endl;
            q.push(fi+se);
            
        }
        cout<<opt<<endl;

    }
}