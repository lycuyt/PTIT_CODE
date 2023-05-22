#include<bits/stdc++.h>
using namespace std;
int n;
vector<string > res;
void Try(int n, int limit, vector<int> a){
      if(limit==0)
      {
            cout<<"(";
            for(int i=0;i<a.size()-1;i++){
                  cout<<a[i]<<' ';
            }
            cout<<a[a.size()-1]<<")";
            cout<<" ";
      }
      for(int i=n;i>=1;i--)
      {
            if(limit>=i)
            {
                  a.push_back(i);
                  Try(i, limit-i, a);
                  a.pop_back();
            }
      }
}
int main()
{
      int t;cin>>t;
      while (t--)
      {
            cin>>n;
            res.clear();
            vector<int> a;
            Try(n,n,a);
           
            cout<<endl;
      }
      
}