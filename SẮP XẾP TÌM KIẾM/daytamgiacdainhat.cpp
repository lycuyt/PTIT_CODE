#include<bits/stdc++.h>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);

    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int a[100005], l[100005]={0} , r[100005]={0};
        for (int i = 1; i <= n; ++i) {
            cin >> a[i];
        }
        for (int i = 1; i <= n; ++i) {
            if (a[i] > a[i - 1])
                l[i] = l[i - 1] + 1;
            else
                l[i] = 1;
        }
        for (int i = n; i >= 1; --i) {
            if (a[i] > a[i + 1])
                r[i] = r[i + 1] + 1;
            else
                r[i] = 1;
        }
        int maxx = 0;
        for (int i = 1; i <= n; ++i) {
            maxx = max(maxx, l[i] + r[i] - 1);
        }
        cout<<maxx<<endl;
    }
}