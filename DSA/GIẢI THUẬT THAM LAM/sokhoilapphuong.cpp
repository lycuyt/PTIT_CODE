#include<bits/stdc++.h>
using namespace std;
bool check(string a, string b) {
    int cnt=0;
    for(int i=0;i<b.size();i++){
        // kiem tra xau a co la con cua xau b hay khong
        if(a[cnt]==b[i]){
            cnt++;
        }
    }
    if(cnt==a.size()) return 1;
    else return 0;
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        long long x, y, z;
        cin >> x;
        int kt=0;
        y = cbrt(x);
        for (int i = y; i >= 1; --i) {
            z = i*i*i;
           
            if (check(to_string(z), to_string(x))==1) {
                cout << z<<endl;
                kt=1;
                break;
            }
             
        }

        if(kt==0) cout << -1<<endl;
    }
}