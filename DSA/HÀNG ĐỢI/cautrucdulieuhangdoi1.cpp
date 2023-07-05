#include<iostream>
#include<queue>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;cin>>n;
        queue<int> q;
        while(n--)
        {
            int k;
            cin>>k;
            if(k==1)
            {
                cout<<q.size()<<endl;
            }
            if(k==2)
            {
                if(q.empty())
                {
                    cout<<"YES"<<endl;

                }else cout<<"NO"<<endl;
            }
            if(k==3)
            {
                int h;cin>>h;
                q.push(h);
            }
            if(k==4)
            {
                if(!q.empty()){
                    q.pop();
                }
            }
            if(k==5)
            {
                if(q.empty()) cout<<-1<<endl;
                else cout<<q.front()<<endl;
            }
            if(k==6)
            {
                if(q.empty()) cout<<-1<<endl;
                else cout<<q.back()<<endl;
            }
        }
        cout<<endl;
    }

}