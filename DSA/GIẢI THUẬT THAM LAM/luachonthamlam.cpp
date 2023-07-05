#include<bits/stdc++.h>
using namespace std;
void min(int n, int s){
    if(9*n<s || s<=0){
        cout<<-1<<" ";
        return;
    } 
    // cos n chu so va co tong bang s
    int tmp=9;
    vector<int> v;
    while(n>1)
    {
        s=s-1;
        while(s<tmp) tmp--;
        if(s>=tmp){
            v.push_back(tmp);
            s=s-tmp;
        }
        s=s+1;
        n--;
    }
    v.push_back(s);
    for(int i=v.size()-1;i>=0;i--)
    {
        cout<<v[i];
    }
    cout<<" ";

    
}
void max(int n, int s){
    if(9*n<s || s<=0) {
        cout<<-1<<" ";
        return;
    }
    // cos n chu so va co tong bang s
    vector<int> v;
    while(n>1 && s>=9){
        v.push_back(9);
        s=s-9;
        n--;
    }
    v.push_back(s);
    while(n-1>0){
        v.push_back(0);
        n--;
    }
    for(int i=0;i<v.size();i++)
    {
        cout<<v[i];
    }
    cout<<" ";
    
}
int main()
{
    int n,s;
    cin>>n>>s;
    min(n,s);
    max(n,s);
}