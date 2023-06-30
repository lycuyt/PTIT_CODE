#include<bits/stdc++.h>
#include<queue>
#include<iostream>
#include<set>
using namespace std;
#define ll long long
#define fi first 
#define se second 
#define ve vector 
#define sz size()
int s,t;
int solve()
{
    int m[100000]={0};
    set<int> se;
    queue<int> q;
    se.insert(s);
    q.push(s);
    while(q.sz)
    {
        int a=q.front();q.pop();
        if(a==t) return m[t];
        if(a*2<=t+1 && se.find(a*2)==se.end()) {
            m[a*2]=m[a]+1;
            q.push(a*2);
            se.insert(a*2);
        }
        if(a-1>0 && se.find(a-1)==se.end()){
            m[a-1]=m[a]+1;
            q.push(a-1);
            se.insert(a-1);
        }


    }
}
int main()
{
    int tc;
    cin>>tc;
    while (tc--)
    {
        cin>>s>>t;
        cout<<solve()<<endl;
        /* code */
    }
    
}
