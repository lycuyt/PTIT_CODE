#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int n,k;
int a[16];
int b[16];
void solve() {
    for (int i = 1; i <= k; ++i) {
        cout << a[b[i]] << " ";
    }
    cout << endl;
}

void Try(int i) {
    for (int j = b[i - 1] + 1; j <= n - k + i; ++j) {
        b[i] = j;
        if (i == k) solve();
        else Try(i + 1);
    }
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
       
        cin>>n>>k;
        for(int i=1;i<=n;i++) cin>>a[i];
        sort(a+1,a+n+1);
        b[0]=0;
        Try(1);
    
    }
}