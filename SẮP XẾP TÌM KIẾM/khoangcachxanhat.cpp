#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		
		pair<int,int> a[n+5];
		for(int i=0;i<n;i++)
		{
			cin>>a[i].first;
			a[i].second=i;
		}
		
		int ans=-1;
		sort(a,a+n);
		int min=a[0].second;
		int check=a[0].first;
		for(int i=1;i<n;i++)
		{
			if(a[i].first> check){
				ans=max(ans, a[i].second-min);
			}
			if(min> a[i].second){
				min=a[i].second;
				check=a[i].first;
			}
			
		}
		cout<<ans<<endl;
	}
}
