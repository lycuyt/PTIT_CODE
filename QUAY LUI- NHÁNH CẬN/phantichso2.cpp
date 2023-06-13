#include <bits/stdc++.h>
using namespace std;
int cnt=0;
vector<string > u;
void Try(int n, int m, vector<int> a)
{
      if(m==0)
      {
            cnt++;
            string s="(";
            // cout<<"(";
            for(int i=0;i<a.size()-1;i++){
                  // cout<<a[i]<<" ";
                  s+=to_string(a[i]);
                  s+=" ";
            }
            // cout<<a[a.size()-1]<<") ";
            s+=to_string(a[a.size()-1]);
            s+=")";
            u.push_back(s);
      }
      for(int i=n;i>=1;i--)
      {
            if(m>=i)
            {
                  a.push_back(i);
                  Try(i,m-i,a);
                  a.pop_back();
            }
      }
}
int main()
{
      int t;cin>>t;
      while(t--)
      {
            int n;
            cin>>n;
            vector<int>a;
            cnt=0;
            u.clear();
            Try(n,n,a);
            cout<<cnt<<endl;
            for(int i=0;i<u.size();i++) cout<<u[i]<<" ";
            cout<<endl;
      }
}