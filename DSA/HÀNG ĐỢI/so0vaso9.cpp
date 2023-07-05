
#include<bits/stdc++.h>
using namespace std; 
vector<long long> res;
long long a[101];
void init()
{
    queue<string> q;
    q.push("9");
    res.push_back(9);
    while(1)
    {
        //lay ra phan tu o dau hang doi
        string top=q.front();
        q.pop();
        if(top.length()==11) break;

        res.push_back(stoll(top+"0"));
        res.push_back(stoll(top+"9"));
        q.push(top+"0");
        q.push(top+"9");

    }
    for(int i=1;i<=100;i++)
    {
        for(long long x:res)
        {
            if(x%i==0)
            {
                a[i]=x;
                break;
            }
        }
    }
}
int main()
{
     ios_base::sync_with_stdio(0);cin.tie(0);
    init();
    int t;cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        cout<<a[n];
        cout<<endl;

    }
}