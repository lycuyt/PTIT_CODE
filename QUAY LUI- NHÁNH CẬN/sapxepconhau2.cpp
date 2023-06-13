#include<bits/stdc++.h>
using namespace std;
int n;
int x[105];
int b[105][105];
bool c[105],h[105];
bool xuoi[105];
bool nguoc[105];
void xuat(int a[], int n){
	for(int i=1;i<=n;i++){
		cout<<a[i]<<" ";
	}
	cout<<endl;
}
int maxx=0;
void Try(int i){
	for(int j=1;j<=n;j++){
		if(h[j] && c[j] && xuoi[i-j+n]&& nguoc[i+j-1]){
			x[i]=j;
            h[j]=false;
			c[j]=false;
			xuoi[i-j+n]=false;
			nguoc[i+j-1]=false;
			if(i==n){
				//check roi in ra tong
                int s=0;
                for(int l=1;l<=n;l++){
                    s+=b[l][x[l]];
                }
                maxx=max(maxx,s);
			}else{
				Try(i+1);
			}
            h[j]=true;
			c[j]=true;
			xuoi[i-j+n]=true;
			nguoc[i+j-1] =true;
		}
	}
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
        maxx=0;
		n=8;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                cin>>b[i][j];
            }
        }
		for(int i=0;i<105;i++){
            h[i]=true;
			c[i]=true;
			xuoi[i]=true;
			nguoc[i]=true;
		}
		Try(1);
		cout<<maxx;
		cout<<endl;
	}
}
