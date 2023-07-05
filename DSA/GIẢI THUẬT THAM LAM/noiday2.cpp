#include<bits/stdc++.h>
using namespace std;
const long long mod=1e9+7;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        long n;
        cin>>n;
        long a[n];
        priority_queue<long,vector<long>,greater<long>> q;
        for(int i=0;i<n;i++){
            cin>>a[i];
            q.push(a[i]);
        }
        long long sum=0;
        //lay hai phan tu dau tien cua hang doi, cong voi nhau sau do nhet vao p
        while(q.size()>1){
            long fi=q.top();q.pop();
            long se=q.top();q.pop();
            long s=(fi+se)%mod;
            sum+=s;
            q.push(s);
        }
        
       cout<<sum%mod<<endl;
    }
}