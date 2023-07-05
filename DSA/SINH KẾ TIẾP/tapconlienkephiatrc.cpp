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
		if(a[i]!= i+1) return 0;
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
		int a[1005];
	
		for(int i=0;i<k;i++) {
			cin>>a[i];
		}
		if(checkcuoi(a,n,k)==1){
			for(int i=k;i<=n;i++) cout<<i<<" ";
		}else{
			int i = k-1;
            while (i >= 0 && a[i] == a[i - 1] + 1) i--;
            if (i != -1) a[i]--;
            for (int j = i + 1; j <= k; ++j) {
                a[j] = n - k + j+1;
            }
            for (int j = 0; j < k; ++j) {
                cout << a[j] << " ";
            }
                    
		}
		cout<<endl;
		
	}
}
