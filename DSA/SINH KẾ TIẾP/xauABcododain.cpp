
#include<iostream>
#include<math.h>
using namespace std;
void sinh(char a[],int n){
    int i=n-1;
    while(a[i]=='B' && i>=0){
        a[i]='A';
        i--;
    }
    a[i]='B';
}



void xuat(char a[],int n){
for(int i=0;i<n;i++) cout<<a[i];
    cout<<" ";
}
int main()
{
	int t;cin>>t;
	while(t--)
	{
		int n;cin>>n;
    
    char a[15];
    for(int i=0;i<n;i++) a[i]='A';
    for(int i=1;i<=pow(2,n);i++){
        
            xuat(a,n);
        
        sinh(a,n);
    }
    cout<<endl;
	}
    
}


