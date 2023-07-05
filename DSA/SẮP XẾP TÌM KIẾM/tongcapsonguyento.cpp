#include<bits/stdc++.h>
using namespace std;
int prime[1000005];
void sang()
{
    for(int i=0;i<1000000;i++){
        prime[i]=1;
    }
    prime[0]=0;
    prime[1]=0;
    for(int i=2;i<=sqrt(1000000);i++){
        if(prime[i]){
            for(int j=i*i;j<1000000;j=j+i){
                prime[j]=0;
            }
        }
    }
}
int main()
{
    sang();
    int t ;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int dem=0;
        for(int i=2;i<n;i++){
            if(prime[i] && prime[n-i]) {
                cout<<i<<" "<<n-i<<endl;
                dem++;
                break;
            }
        }
        if(dem==0) cout<<-1<<endl;
       

    }
}