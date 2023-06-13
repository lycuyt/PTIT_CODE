#include<bits/stdc++.h>
using namespace std;
int c[100][100];
int x[100];
int FOPT=100000;
bool chuaxet[100];
int n;
int g=0;
int cmin=100;
void nhap(){
    cin>>n;
   
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            cin>>c[i][j];
            if (c[i][j]<cmin && c[i][j] > 0) {
                cmin=c[i][j];
        }
    }
    }
}
int tmp;
void Try(int k)
{
    for(int j=2;j<=n;j++)
    {
        if(chuaxet[j]){
            x[k]=j;
            chuaxet[j]=false;
            g=g+c[x[k-1]][x[k]];
            if(k==n)
            {
                if(g+c[x[n]][x[1]]<FOPT) {
                	tmp=g+c[x[n]][x[1]];
                	FOPT=min(FOPT,tmp);
                	// in();
				}
            }else if(g+(n-k+1)*cmin<FOPT)
            {
                Try(k+1);
            }
            chuaxet[j]=true;
            g=g-c[x[k-1]][x[k]];
        }
    }
}
int main()
{
    
    for(int i=0;i<100;i++){
        chuaxet[i]=true;
    }
    chuaxet[1]=false;
    x[1]=1;
    nhap();
    Try(2);
   cout<<FOPT<<endl;
}

