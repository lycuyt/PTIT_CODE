#include<bits/stdc++.h>
using namespace std;
int fmod(int n){
    if(n%4==0) return 4;
    else return 0;
}
int main()
{
    int t;cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        // dấu hiệu chia hết cho 4 là hai chữ số tận cùng chia hết cho 4
        int len= s.size();
        int n= (s[len-2]-48)*10+ (s[len-1]-48);
        cout<<fmod(n)<<endl;
        
    }
}