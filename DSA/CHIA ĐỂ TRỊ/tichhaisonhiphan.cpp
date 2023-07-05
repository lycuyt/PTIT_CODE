#include<bits/stdc++.h>
using namespace std;
long long change(string s){
    //chuyen tu nhi phan sang thap phan
    long long j=s.size() - 1;
    long long sum=0;
    for(long long i=0;i<s.size();i++) {
        if((s[i] - '0') == 1) {
            sum = sum + pow(2,j);
            j--;
        }
        else j--;
    }
    return sum;
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        string a,b;
        cin>>a>>b;
        cout<<change(a)*change(b)<<endl;
    }
}