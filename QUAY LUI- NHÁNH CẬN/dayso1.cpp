#include<bits/stdc++.h>
using namespace std;
void bactrack(int a[], int n){
	if(n>0){
		cout<<"[";
		for(int i=0;i<n-1;i++) cout<<a[i]<<" ";
		cout<<a[n-1]<<"]";
		cout<<endl;
		for(int i=0;i<n-1;i++){
			a[i]=a[i]+a[i+1];
		}
		bactrack(a,n-1);
	}
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		int a[n];
		for(int i=0;i<n;i++) cin>>a[i];
		bactrack(a,n);
		cout<<endl;
	}
}
