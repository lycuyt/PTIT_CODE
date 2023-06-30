#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t = 1;
    //cin >> t;
    string s;
    while(t--)
    {
        cin >> s;
        stack<char> st1, st2;
        for(char &i : s)
        {
            switch(i)
            {
                case '>':
                {
                    if(st2.size())
                    {
                        st1.push(st2.top());
                        st2.pop();
                    }
                    break;
                }
                case '<':
                {
                    if(st1.size())
                    {
                        st2.push(st1.top());
                        st1.pop();
                    }
                    break;
                }
                case '-':
                {
                    if(st1.size())
                        st1.pop();
                    break;
                }
                default:
                    st1.push(i);
            }
        }
        while(st1.size())
        {
            st2.push(st1.top());
            st1.pop();
        }
        while(st2.size())
        {
            cout << st2.top();
            st2.pop();
        }
    }
    return 0;
}