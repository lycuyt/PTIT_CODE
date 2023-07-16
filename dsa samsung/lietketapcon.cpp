#include<iostream>
#include<math.h>
#include<string.h>
#include<vector>
#include<algorithm>
using namespace std;
int n;
string s;
vector< vector<char> > res;
int x[20];
int k;
void xuat(){
    vector<char>v;
	for(int i=1;i<=k;i++){
		v.push_back(s[x[i]-1]);
	}
	res.push_back(v);
}
void Try(int i){
	for(int j=x[i-1]+1;j<=n-k+i;j++){
		x[i]=j;
		if(i==k){
			xuat();
		}
		else{
			Try(i+1);
		}
	}
}
void solve()
{
    cin>>n;
    cin>>s;
    k=0;
    for(int i=1;i<=n;i++)
    {
        k++;
        x[0]=0;
        Try(1);
       
    }
    sort(res.begin(),res.end());
    for(int i=0;i<res.size();i++){
        for(int j=0;j<res[i].size();j++)
        {
            cout<<res[i][j];
        }
        cout<<" ";
    }
    cout<<endl;
}
void Test()
{
    int t;
    cin>>t;
    while(t--)
    {
        res.clear();
        solve();
    }
}
int main()
{
    Test();
}

    