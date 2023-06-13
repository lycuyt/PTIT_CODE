#include<bits/stdc++.h>
using namespace std;
int n,k;
int a[35];
string b[35];
string c[35];
void xuat(){
	for(int i=1;i<=k;i++){
		cout<<c[a[i]]<< " ";
	}
	cout<<endl;
}
void Try(int i){
	for(int j=a[i-1]+1;j<=n-k+i;j++){
		a[i]=j;
		if(i==k){
			xuat();
		}
		else{
			Try(i+1);
		}
	}
}
int main()
{
	
 	a[0]=0;
	cin>>n>>k;
	set<string>se;
	
	for(int i=0;i<n;i++) {
		cin>>b[i];
		se.insert(b[i]);
	}
	int len=se.size();
	int h=1;
	for(set<string> :: iterator it=se.begin();it!=se.end();it++)
	{
		c[h]=*it;
		h++;
	}
	n=len;
	Try(1);
	
}
