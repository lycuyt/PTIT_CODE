#include<iostream>
#include<deque>
using namespace std;
int main()
{
    int t;
    cin>>t;
    deque<int> dq;
    while(t--)
    {
        string s;
        cin>>s;
        if(s=="PUSHFRONT"){
            int n;cin>>n;
            dq.push_front(n);
        }
        if(s=="PRINTFRONT"){
            if(dq.empty()) cout<<"NONE"<<endl;
            else cout<<dq.front()<<endl;
        }
        if(s=="POPFRONT"){
            if(!dq.empty())
            {
                dq.pop_front();
            }
        }
        if(s=="PUSHBACK"){
            int n;cin>>n;
            dq.push_back(n);
        }
        if(s=="PRINTBACK"){
            if(dq.empty()) cout<<"NONE"<<endl;
            else cout<<dq.back()<<endl;
        }
        if(s=="POPBACK"){
            if(!dq.empty())
            {
               dq.pop_back();
            }
        }
    }
}