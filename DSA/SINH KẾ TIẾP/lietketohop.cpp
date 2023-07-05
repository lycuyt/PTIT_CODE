#include<iostream>
#include<math.h>
#include<set>
using namespace std;

bool ok=true;
void sinh(int a[], int n, int k){
	int i=k;
	while(i>0 && a[i]==n-k+i) i--;
	if(i<=0){
		ok=false;
		return;
	}else{
		a[i]++;
		for(int j=i+1;j<=k;j++) a[j]=a[j-1]+1;
	}
}
void in(int a[],int c[], int k){
	for(int i=1;i<=k;i++) cout<<c[a[i]]<<" ";
	cout<<endl;
}
int main()
{
	
		int n,k;
		cin>>n>>k;
		int b[n];
	
		set<int > se;
		for(int i=0;i<n;i++){
			cin>>b[i];
			se.insert(b[i]);
		}
		
		int len=se.size();
		int c[len+1];
		int h=1;
		for(set<int> :: iterator it = se.begin(); it != se.end();it++){
			c[h]=*it;
			h++;
		}
		
		int a[k]; 
		for(int i=1;i<=k;i++) a[i]=i;
//		for(int i=1;i<=k;i++) cout<<a[i];
//		cout<<endl;
//		for(int i=1;i<=len;i++) cout<<c[i];
		ok=true;
		while(ok)
		{
			in(a,c,k);
			sinh(a,len,k);
		}
}
