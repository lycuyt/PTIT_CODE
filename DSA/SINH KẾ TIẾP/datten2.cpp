#include<bits/stdc++.h>
using namespace std;

string b="0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
int a[27];
int n,k;
bool ok=true;
 void sinh()
 {
 	int i=k-1;
 	while(i>=0 && a[i]== n-k+i+1) i--;
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

void in()
{
	for(int i=0;i<k;i++){
		cout<<b[a[i]];
	}
	cout<<endl;
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		cin>>n>>k;
		for(int i=0;i<k;i++) a[i]=i+1;
		ok=true;
		while(ok)
		{
			in();
			sinh();
		}
		cout<<endl;
	}
}
