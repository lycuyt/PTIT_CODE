#include<bits/stdc++.h>
using namespace std;
void sinh(int a[], int n)
{
	int i=n-2;
	while(a[i]>a[i+1] && i>=0) i--;
	int k=n-1;
	while(a[k]<a[i]) k--;
	swap(a[k], a[i]);
	int l=i+1;
	int r=n-1;
	while(l<r)
	{
		swap(a[l], a[r]);
		l++;
		r--;
	}
}
void in(int a[], int n)
{
	for(int i=0;i<n;i++) cout<<a[i];
	cout<<' ';
}
int gt(int n)
{
	if(n==0 || n==1) return 1;
	else return n*gt(n-1);
}
int main()
{
	int t;
	cin>>t;
	while (t--)
	{
		int n;
		cin>>n;
		int a[n];
		for(int i=0;i<n;i++) a[i]=i+1;
		for(int i=0;i<gt(n);i++)
		{
			in(a, n);
			sinh(a, n);
		}
		cout<<endl;
		/* code */
	}
	
}