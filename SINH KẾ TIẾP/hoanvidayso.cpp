#include<bits/stdc++.h>
using namespace std;


bool ok=true;
// sinh hoan vi
void sinh(int a[], int n)
{
	int i=n-2;
	while(a[i]>a[i+1]&& i>=0) i--;
	if(i<0) {
		ok=false;
		return;
	}else{
		int k=n-1;
		while(a[k]<a[i]) k--;
		swap(a[k], a[i]);
		int r=n-1;
		int l=i+1;
		while(l<r){
			swap(a[l], a[r]);
			r--;
			l++;
		}
	}
	
}


void in(int a[], int b[], int n)
{
	for(int i=0;i<n;i++){
	cout<<b[a[i]-1]<<" ";
	}
	cout<<endl;
}

int main()
{
	int n;
	cin>>n;
	int a[n];
	int b[n];
	for(int i=0;i<n;i++) a[i]=i+1;
	ok=true;
	for(int i=0;i<n;i++){
		cin>>b[i];
	}
	sort(b,b+n);

	while(ok){
		in(a,b,n);
		sinh(a,n);
	}
}
