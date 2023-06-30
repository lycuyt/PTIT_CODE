#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    while (t--)
    {
        long long k;
        cin>>k;
        string s;
        cin>>s;
        map<char, long long> mp;
        for(int i=0;i<s.size();i++)
        {
            mp[s[i]]++;
        }
        
        priority_queue<long long> pq;
        for(auto it: mp){
            pq.push(it.second);
        }
        while(k-- && !pq.empty())
        {
            long long a= pq.top();pq.pop();
            a=a-1;
            pq.push(a);
        }
         long long tong=0;
        while(!pq.empty()){
            long long top=pq.top();pq.pop();
            tong+=top*top;
        }
        cout<<tong<<endl;

    }
    
}