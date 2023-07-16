#include<bits/stdc++.h>
using namespace std;
long long f[100];
void fi(){
    int n;
    cin>>n;
    long long i;
    cin>>i;
    while (n>2)
    {
        if(i<=f[n-2]) n-=2;
        else{
            i-=f[n-2];
            n--;
        }
        /* code */
    }
    if(n==1) cout<<'A'<<endl;
    else cout<<'B'<<endl;
    
}
int main()
{
    f[1]=f[2]=1;
    for(int i=3;i<=92;i++)
    {
        f[i]=f[i-1]+f[i-2];
    }

    int t;cin>>t;
    while(t--)
    {
        fi();
        
    }
}