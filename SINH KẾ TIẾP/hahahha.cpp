#include<bits/stdc++.h>
using namespace std;
void sinh(char a[], int n){
	int i=n-1;
	while(a[i]=='H'&& i>0){
		a[i]='A';
		i--;
	}
	a[i]='H';
}
void in(char a[], int n){
	for(int i=0;i<n;i++) cout<<a[i];
	cout<<endl;
}
int check(char a[], int n){
	if(a[0] != 'H') return 0;
	if(a[n-1] !='A') return 0;
	for(int i=0;i<n-1;i++){
		if(a[i]==a[i+1] && a[i]=='H') return 0;
	}
	return 1;
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		char a[n];
		// h la 1 a la 0
		for(int i=0;i<n;i++) a[i]='A';
		for(int i=1;i<=pow(2,n);i++){
			if(check(a,n)==1) in(a,n);
			sinh(a,n);
		}
		cout<<endl;
	}
}
