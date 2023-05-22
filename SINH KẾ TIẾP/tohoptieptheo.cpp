#include<bits/stdc++.h>
using namespace std;
int check(int x, int a[], int k)
{
	for(int i=0;i<k;i++){
		if(x ==a[i]) return 0;
		
		
	}

	return 1;
}
int checkcuoi(int a[],int n, int k){
	for(int i=0;i<k;i++){
		if(a[i]!= n-k+1+i) return 0;
	}
	return 1;
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		int k;
		cin>>k;
		int a[45];
		int b[45];
		for(int i=0;i<k;i++) {
			cin>>a[i];
			b[i]=a[i];
		}
		if(checkcuoi(a,n,k)==1){
			cout<<k<<endl;
		}else{
			int i=k-1;
		
			while( a[i]== n-k+i+1) {
				i--;
			}
			a[i]=a[i]+1;
			for(int j=i+1;j<k;j++){
			
				a[j]=a[i]+j-i;
			
			}
			// tim tung phan tu cua trong mang a co trong b hay ko
			int dem =0;
			for(int i=0;i<k;i++){
				if(check(a[i],b,k)==1) dem++;
			}
			cout<<dem<<endl;
		}
		// sinh to hop tiep theo
		
	}
}
