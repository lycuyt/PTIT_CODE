#include<bits/stdc++.h>
using namespace std;
void solve(int s,int d)
{
    if(s>9*d) {cout<<-1<<endl; return;}
    // tong bang s va co d chu so
    int tmp=9;
    vector<int> v;
    while(d>1)
    {
        s=s-1;
        while(s<tmp) tmp--;
        if(s>=tmp){
            v.push_back(tmp);
            s=s-tmp;
        }
        s=s+1;
        d--;
    }
    v.push_back(s);
    for(int i=v.size()-1;i>=0;i--)
    {
        cout<<v[i];
    }
    cout<<endl;

    


}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int s,d;
        cin>>s>>d;
        solve(s, d);
    }
}