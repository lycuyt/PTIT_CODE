#include<bits/stdc++.h>
using namespace std;

#define mp make_pair
#define fi first
#define se second
#define pb push_back
#define sz size()
#define ll long long
#define FOR(i, a, b) for(int i = a; i <= b; i++)
#define FORD(i, a, b) for(int i = a; i >= b; i--)
#define F(i, a, b) for(int i = a; i < b; ++i)
#define FD(i, a, b) for(int i = a; i > b; --i)
#define faster() ios_base::sync_with_stdio(0); cin.tie(NULL); cout.tie(NULL);
#define vi vector<int>
#define vll vector<ll>
#define all(x) (x).begin(), (x).end()
#define endl '\n'
int main()
{
    faster();
    int t;cin>>t;
    while(t--){
        int n,v;
        cin>>n>>v;
        //the tich a,gia tri la c 
        int a[n+1];
        int c[n+1];
        FOR(i,1,n) cin>>a[i];
        FOR(i,1,n) cin>>c[i];

        int dp[n+1][v+1];
        memset(dp,0,sizeof(dp));
        
        FOR(i,1,n){
            FOR(j,1,v){
                // neu k them vat thi dp[i][j]=dp[i-1][j]
                 dp[i][j]=dp[i-1][j];
                 //ne them phan tu vao mang
                 if(j>=a[i]){
                     dp[i][j]=max(dp[i][j], dp[i-1][j-a[i]] + c[i]);
                 }
            }
        }
        cout<<dp[n][v]<<endl;

    }
}