#include<bits/stdc++.h>
using namespace std;
void sinh(int a[], int n){
	int i=n-1;
	while(a[i]==1){
		a[i]=0;
		i--;
	}
	a[i]=1;
}
int  check(int a[], int b[],int n, int k){
	int sum=0;
	for(int i=0;i<n;i++){
		if(a[i]==1){
			sum+=b[i];
		}
	}
	if(sum==k) return 1;
	else return 0;
}
void in(int a[],int b[], int n){
	for(int i=0;i<n;i++){
		if(a[i]==1){
			cout<<b[i]<<" ";
		}
		
	}
	cout<<endl;
}
int main(){
	int n;
	int dem =0; 
	cin>>n;
	int a[n];
	int k;cin>>k;
	int b[n];
	for(int i=0;i<n;i++) cin>>b[i];
	for(int i=0;i<n;i++) a[i]=0;
	for(int i=0;i<pow(2,n);i++){
		if(check(a,b,n,k)==1) {
			in(a,b,n);
			dem++;
		}
		sinh(a,n);
		
	}
	cout<<dem;
} 
