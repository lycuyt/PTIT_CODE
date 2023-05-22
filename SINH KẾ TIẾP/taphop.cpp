#include<iostream>
#include<math.h>
using namespace std;
int a[25],n ,k,s;
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
int check()
{
    int sum=0;
    for(int i=1;i<=k;i++)
    {
        sum+=a[i];
    }
    if(sum==s) return 1;
    else return 0;
}
int main()
{
	while(cin>>n){
        
        cin>>k>>s;
        if(n==0 && k==0 && s==0){
            break;
        }else{
                if(k>n) cout<<0;
                 else{
                    int cnt=0;
                    for(int i=1;i<=k;i++) a[i]=i;
                    ok = true;
                    while(ok){
                        if(check()==1){
                            cnt++;
                        }
                        sinh();
                    }
                    cout<<cnt;
            }
            
            cout<<endl<<endl;
         }
        
    }
		
	
}
