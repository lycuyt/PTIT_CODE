#include<bits/stdc++.h>
using namespace std;
int n;
int a[15][15];
vector<string> res;
void Try(int i, int j,string s){
    if(a[0][0]==0 || a[n-1][n-1]==0){
        return;
    }
    if(i==n-1 && j==n-1){
        res.push_back(s);
    }
    if(i<n-1 && a[i+1][j]){
        Try(i+1,j,s+"D");
    }
    if(j<n-1 && a[i][j+1]){
        Try(i,j+1,s+"R");
    }
    if((i<n && j<n && !a[i+1][j]  && !a[i][j-1] )||i>n ||j>n){
		return;
	}
}
int main()
{
    int t;cin>>t;
    while(t--)
    {
        res.clear();
        cin>>n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                cin>>a[i][j];
            }
        }
        Try(0,0,"");
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