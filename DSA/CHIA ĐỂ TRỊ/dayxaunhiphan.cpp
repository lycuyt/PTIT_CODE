#include<bits/stdc++.h>
using namespace std;
long long f[100];
void solve()
{
    int n;
    cin>>n;
    long long i; 
    cin>>i;
     //g(n)=g(n-2)+g(n-1)
    
    while(n>2){
        if(i<=f[n-2]) n-=2;// i nam trong g(n-2)
        else{//i nam trong g(n-1)
            i-=f[n-2];
            n--;
        }

    }
    if(n==1) cout<<"0"<<endl;
    else cout<<"1"<<endl;
}
int main()
{
    f[1]=f[2]=1;
    for(int i=3;i<=93;i++){
        f[i]=f[i-1]+f[i-2];
    }
    int t;
    cin>>t;
    while(t--)
    {
        solve();
    }
}