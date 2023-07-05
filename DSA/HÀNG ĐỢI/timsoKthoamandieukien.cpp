#include<bits/stdc++.h>
#include<queue>
using namespace std;
int d[100005];
void solve()
{
    memset(d, 0,sizeof(d));
    queue<string> q;
    for(int i=1;i<=5;i++){
        q.push(to_string(i));
        d[i]=1;
    }
    while(!q.empty())
    {
        string tmp=q.front();
        if(tmp.size()==5) return;
        q.pop();
        for(int i=0;i<=5;i++)
        {
            int kt=1;
            for(int j=0;j<tmp.size();j++){
                if(i==tmp[j]-48){
                    kt=0;
                    break;
                }
            }
            if(kt==1)
            {
                string res=tmp+to_string(i);
                if(res.size()<=5)
                {
                    q.push(res);
                    d[stoll(res)]=1;
                }
            }
            
        }

    }
}

int main()
{
    solve();
    int t;
    cin>>t;
    while(t--)
    {
        int  l, r;
        cin>>l>>r;
        int dem=0;
        for(int i=l;i<=r;i++)
        {
           if(d[i]==1) dem++;
        }
        cout<<dem<<endl;
        
    }
}