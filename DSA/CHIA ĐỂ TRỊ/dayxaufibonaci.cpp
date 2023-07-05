#include<bits/stdc++.h>
using namespace std;
#define ll long long
ll f[100];
void fi()
{
    int n;
    cin>>n;
    ll i; cin>>i;
     //g(n)=g(n-2)+g(n-1)
    
    while(n>2){
        if(i<=f[n-2]) n-=2;// i nam trong g(n-2)
        else{//i nam trong g(n-1)
            i-=f[n-2];
            n--;
        }

    }
    if(n==1) cout<<"A"<<endl;
    else cout<<"B"<<endl;
}
int main()
{
    //mang luu do dai cac xau
    f[1]=f[2]=1;
    for(int i=3;i<=92;i++)
    {
        f[i]=f[i-1]+f[i-2];
    }
    int t;
    cin>>t;
    while(t--)
    {
       fi();
       
    }
}