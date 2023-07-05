#include<bits/stdc++.h>
using namespace std;
void sinh(int a[], int n)
{
	int i=n-1;
	while(a[i]==1 && i>=0)
	{
		a[i]=0;
		i--;
	}
	a[i]=1;
}
int check(int a[], int n)
{
	for(int i=0;i<n/2;i++)
	{
		if(a[i] != a[n-i-1] ) return 0;
	}
	return 1;
}
int main()
{
	int n;
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++)
	{
		a[i]=0;
	}
	for(int i=0;i<pow(2,n);i++)
	{
		if(check(a, n)){
			for(int i=0;i<n;i++) cout<<a[i]<<" ";
			cout<<endl;
		}
		sinh(a,n);
	}
}