#include <iostream>
#include <vector>
using namespace std;
const int MOD = 1000000007;

int solve(int N, int M) {
    vector<vector<int>> dp(N + 1, vector<int>(M + 1, 0));
    dp[0][0] = 1;

    for (int i = 1; i <= N; i++) {
        dp[i][0] = dp[i - 1][0];
    }

    for (int j = 1; j <= M; j++) {
        dp[0][j] = dp[0][j - 1];
    }

    for (int i = 1; i <= N; i++) {
        for (int j = 1; j <= M; j++) {
            dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % MOD;
        }
    }

    return dp[N][M];
}

int main() {
    // Test example
    int t;cin>>t;
    while(t--)
    {
        int N,M;
        cin>>N>>M;
        int result = solve(N, M);
        cout << result << endl;
    }
    

    return 0;
}
