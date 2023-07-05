#include<bits/stdc++.h>
using namespace std;
int n=0;
bool check (int a[]){
	for (int i=1;i<n;i++){
		if (abs(a[i-1] - a[i])==1){
			return false;
		}
	}
	return true;
}
void in (int a[]){
	for (int i=0;i<n;i++){
		cout<<a[i];
	}
}
void sinh (int a[], int i,int u[]){
	for (int j=1;j<=n;j++){
		if (!u[j]){
			a[i]=j;
			u[j]=1;
			if (i==n-1){
				if (check(a)){
					in (a);
					cout<<endl;
				}
			}else sinh (a,i+1,u);
			u[j]=0;
		}
	}
}
int main(){
	int t;cin>>t;
	while (t--){
		cin>>n;
		int a[n];
		for (int i=0;i<n;i++)a[i]=0;
		int u[n+1]={0};
		sinh(a,0,u);
	}
}