#include<bits/stdc++.h>
using namespace std;
void sinh(int a[], int n){
	int i=n-1;
	while(a[i]==1 && i>0){
		a[i]=0;
		i--;
	}
	a[i]=1;
}
void in(int a[], int n){
	for(int i=0;i<n;i++) cout<<a[i];
	cout<<endl;
}
int check(int a[], int n, int k){
	int dem=0;
	for(int i=0;i<n;i++){
		if(a[i]==1) dem++;
		
	}
	if(dem==k) return 1;
	else return 0;
}
int main(){
	int t;cin>>t;
	while(t--){
		int n;
		cin>>n;
		int k;cin>>k;
		int a[n];
		for(int i=0;i<n;i++) a[i]=0;
		for(int i=1;i<=pow(2,n);i++){
			if(check(a,n,k)==1) in(a,n);
			sinh(a,n);
		}
		cout<<endl;
	}
}
