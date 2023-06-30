#include<iostream>
#include<queue>
#include<algorithm>
#include<iomanip>
#include<string>
using namespace std;
int main()
{
    int t;
    cin>>t;
    queue<int> q;
    while(t--)
    {
        string s;
        cin>>s;
        if(s=="PUSH")
        {
            int n;cin>>n;
            q.push(n);
        }
        if(s=="PRINTFRONT"){
            if(q.empty()){
                cout<<"NONE"<<endl;
            }else{
                cout<<q.front()<<endl;
            }
        }
        if(s=="POP"){
            if(!q.empty())
            {
                q.pop();
            }
        }
        
    }
}