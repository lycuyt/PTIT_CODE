#include<bits/stdc++.h>
 using namespace std;
 int main()
 {
 	int t;cin>>t;
 	while(t--)
 	{
 		int n;
	 	cin>>n;
	 	int a[n];
	 	for(int i=0;i<n;i++) cin>>a[i];
	 	int i,j,r,l;
	 	i=n-2;
	// 	cout<<i<<endl;
	 	while(a[i]>a[i+1] && i>=0){
	 		i--;
		 }
	//	 cout<<i<<endl;
		j=n-1;
		while(a[j]<a[i]){
			j--;
		}
		swap(a[i], a[j]);
		r=j+1;
		l=n-1;
		while(r<l){
			r++;
			l--;
			swap(a[r], a[l]);
		}
		int b[n];
		for(int i=0;i<n;i++) b[i]=i+1;
		if(i<0){
			for(int i=0;i<n;i++) cout<<b[i]<<" ";
		}else{
			for(int i=0;i<n;i++) cout<<a[i]<<" ";
		}
		cout<<endl;
		
	 }

 }
