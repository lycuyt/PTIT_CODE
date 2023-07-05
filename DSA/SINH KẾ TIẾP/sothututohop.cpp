#include<bits/stdc++.h>
using namespace std;
int a[15],n,k;
bool ok=true;
void sinh(){
	int i=k-1;
	while(a[i]==n-k+i+1 && i>=0) i--;
	if(i<0){
		ok=false;
		return;
	}
	else{
		a[i]++;
		for(int j=i+1;j<k;j++){
			a[j]=a[j-1]+1;
		}
	}
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		cin>>n>>k;
		ok=true;
		
		
		int b[5000][20];
		int c=0,l=0;
	
	
		
		for(int i=0;i<n;i++) a[i]=i+1;
		
		while(ok){
			//chen vao mang
			l=0;
			for(int j=0;j<n;j++){
				b[c][l]=a[j];
				l++;
			}
			
			c++;
			sinh();
		}
		int d[k];
		int ti;
		for(int i=0;i<k;i++) cin>>d[i];
		for(int i=0;i<c;i++){
			int kt=1;
			for(int j=0;j<k;j++){
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
