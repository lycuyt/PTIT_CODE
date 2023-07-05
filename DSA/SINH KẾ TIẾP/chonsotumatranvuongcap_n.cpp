#include<bits/stdc++.h>
using namespace std;
void sinh(int a[], int n){
	int j,k,r,s;
	j=n-2;
	while(a[j]>a[j+1] && j>=0){
		j--;
		
	}
	k=n-1;
	while(a[k]<a[j]){
		k--;
	}
	swap(a[k], a[j]);
	r=j+1;
	s=n-1;
	while(r<s){
		swap(a[r],a[s]);
		r++;
		s--;
	}
}
int gt(int n){
	if(n==0 || n==1) return 1;
	else return n*gt(n-1);
}
int check(int b[], int a[15][15], int n ,int k)
{
    int s=0;
    int j=0;
    for(int i=0;i<n;i++)
    {
        s+=a[j][b[i]-1];
        j++;
    }
    if(s==k) {
       return 1;
    }else return 0;
}
void in(int a[], int n){
	for(int i=0;i<n;i++){
		cout<<a[i]<<" ";
	}
	cout<<endl;
}
int main()
{
    int n,k;
    cin>>n>>k;
    int a[15][15];
    int b[n];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            cin>>a[i][j];
        }
    }
    int cnt=0;
    vector<vector<int> > u;
    for(int i=0;i<n;i++) b[i]=i+1;
		for(int i=1;i<=gt(n);i++){
            vector<int> v;
			if(check(b,a,n,k)){
                cnt++;
                for(int i=0;i<n;i++){
                    v.push_back(b[i]);
                }
                u.push_back(v);
            }
			sinh(b,n);
		}
        cout<<cnt<<endl;
        for(int i=0;i<u.size();i++)
        {
            for(int j=0;j<u[i].size();j++)
            {
                cout<<u[i][j]<<" ";
            }
            cout<<endl;
        }
	
    
}