#include<bits/stdc++.h>
using namespace std;
int n;
int m;
int a[15][15];
int b[30];
void khoitao(){
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			cin>>a[i][j];
		}
	}
}

void xuat(){
	for(int i=1;i<=m;i++){
		if(b[i]==1) cout<<'R';
		else cout<<'D';
	
//		cout<<b[i];
	}
	cout<<" ";	
}
int check1(){
    int cnt=0;
    for(int i=1; i<=m; i++) if(b[i]==0) cnt++;
    if(cnt==n-1) return 1;
    return 0;
}
int check(){
	if(a[1][1]==0) {
	
		return 0;
	}
	int h=1,k=1;
	for(int i=1;i<=m;i++){
		//1 laf dowm,0 la right
		if(b[i]==1){
			k=k+1;
			if(a[h][k]!=1) return 0;
		}
		if(b[i]==0){
		
			h=h+1;
			if(a[h][k]!=1) return 0;
		}
	}

	return 1;
}
int dem=0;

void Try(int i){
	for(int j=0;j<=1;j++){
		b[i]=j;
		if(i==m){
			if(check()&&check1()) {
				xuat();
				dem++;
			}
		}else{
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
		cin>>n;
		m=2*(n-1);
//		cout<<m<<endl;
		khoitao();
		
		Try(1);
		if(dem==0) cout<<-1;
		
		cout<<endl;
	}
}
