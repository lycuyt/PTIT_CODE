#include<bits/stdc++.h>
using namespace std;
void sinh(int a[], int n){
	int j,k,r,s;
	j=n-2;
	while(a[j]>a[j+1] && j>=0){
		j--;
		
	}
	k=n-1;
	while(a[k]<a[j]){
		k--;
	}
	swap(a[k], a[j]);
	r=j+1;
	s=n-1;
	while(r<s){
		swap(a[r],a[s]);
		r++;
		s--;
	}
}

int gt(int n){
	if(n==0 || n==1) return 1;
	else return n*gt(n-1);
}

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;cin>>n;
		int k=gt(n);
		
		int b[k][n];
		int c=0,l=0;
	
		int a[n];
		
		for(int i=0;i<n;i++) a[i]=i+1;
		for(int i=0;i<gt(n);i++){
			//chen vao mang
			l=0;
			for(int j=0;j<n;j++){
				b[c][l]=a[j];
				l++;
			}
			
			c++;
			sinh(a,n);
		}
		int d[n];
		int ti;
		for(int i=0;i<n;i++) cin>>d[i];
		for(int i=0;i<k;i++){
			int kt=1;
			for(int j=0;j<n;j++){
				if(b[i][j] != d[j]){
					kt=0;
					break;
				}
			}
			if(kt==1) {
				ti=i+1;
				break;
			}
		}
		cout<<ti<<endl;
		cout<<endl;
		
	}
}
