#include<bits/stdc++.h>
using namespace std;
int n;
int a[100][100];
bool vs[100][100];
vector<string> res;
void Try(int i, int j, string s){
	if(a[1][1]== 0 || a[n][n]==0){
		return;
	}
	if(i==n && j==n){
		res.push_back(s);
	}
	if( a[i+1][j]&& i!=n && !vs[i+1][j]){
		vs[i][j]=true;
		Try(i+1,j,s+"D");
		vs[i][j]=false;
	}
	if( a[i][j+1] && j!=n && !vs[i][j+1]){
		vs[i][j]=true;
		Try(i,j+1,s+"R");
		vs[i][j]=false;
	}
	if( a[i][j-1] && j != 1  && !vs[i][j-1]){
		vs[i][j]=true;
		Try(i,j-1,s+"L");
		vs[i][j]=false;
	}
	
	
	if( a[i-1][j] && i!=1  && !vs[i-1][j]){
		vs[i][j]=true;
		Try(i-1,j,s+"U");
		vs[i][j]=false;
	}
	
}
int main()
 {
 	int t;cin>>t;
 	while(t--)
 	{
 		//phan tich so 1
		
		cin>>n;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				cin>>a[i][j];
			}
		}
		memset(vs,false,sizeof(vs));
		res.clear();
		Try(1,1,"");
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
