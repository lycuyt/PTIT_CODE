#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int n, k;
ll a[50000];

void solve1()
{
	ll res = INT_MIN;
	ll l[n], r[n];
	
	l[1] = a[1];
	for(int i = 2; i<= n; i++)
	{
		l[i] = max(l[i-1], a[i-1]);
	}
	
	r[n] = a[n];
	for(int i = n-1; i>= 0; i--)
	{
		r[i] = max(r[i+1], a[i+1]);
	}
	
	for(int i = 2; i< n; i++)
	{
//		cout << l[i] << " " << a[i] << " " << r[i] << endl;
		res = max(l[i] - a[i] + r[i], res);
	}
	
	cout << res;
}

void solve2()
{
	ll dp[1000][n+1]; //kết quả của i phần tử tính đến vị trí j
	for(int i = 0; i<= n; i++)
		dp[0][i] = 0;
		
	for(int i = 1; i<= 3*k; i++)
	{
		int x = a[i];
		if(i % 3 == 2)
		{
			x *= -1;		
		}
			
		dp[i][i] = dp[i-1][i-1] + x;
	
		for(int j = i+1; j<= n; j++)
		{
			int x = a[j];
			if(i%3 == 2)
			{
				x*= -1;
			}
			dp[i][j] = max(dp[i-1][j-1] + x, dp[i][j-1]);
		}
	}
	
	cout << dp[3*k][n];
	
}

int main()
{
	cin >> n >> k;
	for(int i = 1; i<= n; i++)
		cin >> a[i];
	
	if(k == 1)	solve1();
	else solve2();

}