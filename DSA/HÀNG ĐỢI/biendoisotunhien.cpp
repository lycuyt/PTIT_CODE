#include<bits/stdc++.h>
#include<queue>
#include<string>
using namespace std;
#define faster() ios_base::sync_with_stdio(0); cin.tie(NULL);cout.tie(NULL);
int n;
int slove()
{
    if(n<=1) return 0;
    queue<int> q;
    map<int,int> d;
    q.push(n);
    while(q.size())
    {
        int top=q.front();
        q.pop();
        for(int i=2;i<=sqrt(top);i++)
        {
            if(top%i==0 && !d[top/i]){
                if(top/i==1) return d[top]+1;
                d[top/i]=d[top]+1;
                q.push(top/i);
            }
        }
        if(top-1==1) return d[top]+1;
        if(top-1>1 && !d[top-1]){
            d[top-1]=d[top]+1;
            q.push(top-1);
        }
    }
}
int main()
{
    faster();
    int t;
    cin>>t;
    while (t--)
    {
        cin>>n;
        // cout<<phantich(n)<<endl;
        cout<<slove()<<endl;
    }
    
}