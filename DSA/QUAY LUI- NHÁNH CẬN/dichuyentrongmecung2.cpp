#include<bits/stdc++.h>
using namespace std;

int a[100][100], n;
bool vs[100][100];
vector<string> res;

void Try(int i, int j,string s){
	if(a[1][1]==0 || a[n][n]==0){
		
		return;
	}
	if(i==n && j==n ){
		res.push_back(s);
	}
	if(i!=n && a[i+1][j] && !vs[i+1][j]){
		vs[i+1][j]=true;
		Try(i+1,j,s+"D");
		vs[i+1][j]=false;
	}
	if(j!=n && a[i][j+1] && !vs[i][j+1]){
		vs[i][j+1]=true;
		Try(i,j+1,s+"R");
		vs[i][j+1]=false;
	}
	if(j != 1 && a[i][j-1] && !vs[i][j-1]){
		vs[i][j-1]=true;
		Try(i,j-1,s+"L");
		vs[i][j-1]=false;
	}
	
	
	if(i!=1  && a[i-1][j]&& !vs[i-1][j]){
		vs[i-1][j]=true;
		Try(i-1,j,s+"U");
		vs[i-1][j]=false;
	}
	if((i<n && j<n && !a[i+1][j] && !a[i][j+1] && !a[i-1][j] && !a[i][j-1] )||i>n ||j>n){
		return;
	}
}


int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		//nhap mang
		res.clear();
		cin>>n;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				cin>>a[i][j];
				vs[i][j]==false;
			}
		}
		
		
		
		// dequy
		Try(1,1,"");
		//kiemtra va in
		if(res.size()==0){
			cout<<-1;
		}else{
			sort(res.begin(), res.end());
			for(int i=0;i<res.size();i++){
				cout<<res[i]<<" ";
			}
		}
		cout<<endl;
		
		
	}
}
