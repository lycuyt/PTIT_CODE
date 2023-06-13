#include<bits/stdc++.h>
using namespace std;

void bactrack(int b[15][15], int n){
	int m=n;
	if(n>0){
	
		for(int i=0;i<n-1;i++){
		b[n-2][i]=b[n-1][i]+b[n-1][i+1];
		}
	
		bactrack(b,n-1);
	}
	
}
void in(int b[15][15], int n){
	int m=1;
	
	for(int i=0;i<n;i++){
		cout<<'[';
		for(int j=0;j<m-1;j++){
			cout<<b[i][j]<<" ";
		}
		cout<<b[i][m-1]<<"]"<<" ";
	
		m++;
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
		int b[15][15]={0};
		
		for(int i=0;i<n;i++) {
			cin>>b[n-1][i];
		}
		bactrack(b,n);
		in(b,n);
		cout<<endl;
	}
}

