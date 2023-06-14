#include<bits/stdc++.h>
using namespace std;
int dp[101][101][101];
int main()
{
    ios_base::sync_with_stdio(0);cin.tie(0);
    int t;
    cin>>t;
    while(t--)
    {
       int n, m, k, res = 0;
        cin >> n >> m >> k;
        string x, y, z;
        cin >> x >> y >> z;

        memset(dp, 0, sizeof(dp));
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= m; ++j) {
                for (int l = 1; l <= k; ++l) {
                    if (x[i - 1] == y[j - 1]  && x[i - 1] == z[l - 1])
                       dp[i][j][l] =dp[i - 1][j - 1][l - 1] + 1;
                    else
                       dp[i][j][l] = max({dp[i - 1][j][l],dp[i][j - 1][l],dp[i][j][l - 1]});
                    res = max(res,dp[i][j][l]);
                }
            }
        }
        cout << res<<endl;
    }
}