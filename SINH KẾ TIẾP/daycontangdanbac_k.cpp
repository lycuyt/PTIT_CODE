#include<iostream>
#include<math.h>
#include<unistd.h>

using namespace std;
int a[1005],n ,k;
int b[1005];
bool ok=true;
void sinh(){
	int i=k;
	while(i>0 && a[i]==n-k+i) i--;
	if(i<=0){
		ok=false;
		return;
	}else{
		a[i]++;
		for(int j=i+1;j<=k;j++) a[j]=a[j-1]+1;
	}
}
void in(){
	for(int i=1;i<=k;i++) cout<<a[i];
	cout<<" ";
}
int check(){
    for(int i=1;i<=k-1;i++){
        if(b[a[i]] >= b[a[i+1]]) return 0;
    }
    return 1;
}
int main()
{
	
        int cnt=0;
		cin>>n>>k;
        for(int i=1;i<=n;i++) cin>>b[i];
		for(int i=1;i<=k;i++) a[i]=i;
		ok = true;
		while(ok){
			if(check()) cnt++;
			sinh();
		}
		cout<<cnt<<endl;
	
}
