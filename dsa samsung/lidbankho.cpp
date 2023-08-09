
#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n;
	cin>>n;
	vector<int> a(n), b;
	for( int &x : a) cin>>x;
	for(int i=0;i<n;i++)
	{
		// tim phan tu dau tien trong mang lon hon hoac bang a[i]
		auto it = lower_bound(b.begin(), b.end(), a[i]);
		// neu khong tim thay phan tu do thi push vao mang b
		if(it == b.end()) b.push_back(a[i]);
		else *it= a[i];// neu thay thi thay phan tu do bang a[i]
	}
	cout<<b.size();
}