#include<bits/stdc++.h>
using namespace std;
int n;
int x[105];
int a[105];
bool xuoi[105];
bool nguoc[105];
void xuat(int a[], int n){
	for(int i=1;i<=n;i++){
		cout<<a[i]<<" ";
	}
	cout<<endl;
}
int dem=0;
void Try(int i){
	for(int j=1;j<=n;j++){
		if(a[j] && xuoi[i-j+n]&& nguoc[i+j-1]){
			x[i]=j;
			a[j]=false;
			xuoi[i-j+n]=false;
			nguoc[i+j-1]=false;
			if(i==n){
				dem++;
			}else{
				Try(i+1);
			}
			a[j]=true;
			xuoi[i-j+n]=true;
			nguoc[i+j-1] =true;
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
		for(int i=0;i<105;i++){
			a[i]=true;
			xuoi[i]=true;
			nguoc[i]=true;
		}
		Try(1);
		cout<<dem;
		cout<<endl;
	}
}
