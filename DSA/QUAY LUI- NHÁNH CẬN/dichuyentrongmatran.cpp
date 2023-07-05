#include<bits/stdc++.h>
using namespace std;
int n,m;
int a[15][15];
int np[30];
void khoitao(){
	for(int i=1;i<=n;i++){
		for(int j=1;j<=m;j++){
			cin>>a[i][j];
		}
	}
}
int r;
int dem=0;
int check(){
	int cnt=0;
	 for(int i=1;i<=r;i++){
	 	if(np[i]==1) cnt++;
	 }
	 if(cnt==m-1) return 1;
	 else return 0;
}
//void xuat(){
//	for(int i=1;i<=r;i++){
//		cout<<np[i];
//	}
//	cout<<endl;
//}
//0 la di xuong duoi,1 la di sang pahi
void Try(int i)
{
	for(int j=0;j<=1;j++){
		np[i]=j;
		if(i==r){
			if(check()) {
				
				dem++;
			}
			}
		else{
			Try(i+1);
		}
	}
}

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		dem=0;
		cin>>n>>m;
		r=m+n-2;
		
		khoitao();
	
		Try(1);
		cout<<dem<<endl;
	}
}
