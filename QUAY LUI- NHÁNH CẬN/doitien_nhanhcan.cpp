#include<iostream>
#include<math.h>
#include<string.h>
#include<vector>
#include<algorithm>
using namespace std;
int n;
long s;
int x[31];
int k;
long a[31];
int check=0;
void Try(int i){
	for(int j=x[i-1]+1;j<=n-k+i;j++){
		x[i]=j;
		if(i==k){
            long sum=0;
			for(int l=1;l<=k;l++){
                sum+=a[x[l]-1];
            }
            if(sum==s){
                check=1;
                return;
            }
		}
		else{
			Try(i+1);
		}
	}
}
int main()
{
    cin>>n>>s;
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    k=0;
    check=0;
    for(int i=1;i<=n;i++)
    {
        if(check==1) break;
        k++;
        x[0]=0;
        Try(1);
       
    }
    if(check==0) cout<<-1<<endl;
    else cout<<k<<endl;

}