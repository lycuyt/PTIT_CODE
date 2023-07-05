#include<bits/stdc++.h>
using namespace std;
int main()
{
    string s;
    stack <long long> st;
    while(cin>>s){
        long long n;
        if(s=="push"){
            cin>>n;
            cin.ignore();
            st.push(n);

        }else if(s=="pop"){
            if(!st.empty()){
                st.pop();
            }
            else{
                cout<<"empty"<<endl;
                break;
            }

        }else{
            if(st.empty()){
                cout<<"empty"<<endl;
                break;
            }else{
                vector<long long> v;
                while(!st.empty()){
                    v.push_back(st.top());
                    st.pop();
                }
                for(int i=v.size()-1;i>=0;i--){
                    st.push(v[i]);
                    cout<<v[i]<<" ";
                }
                cout<<endl;
            }
        }
    }

}