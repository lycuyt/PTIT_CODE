#include <iostream>
#include <algorithm>
using namespace std;
const long long mod=1e9+7;
int a[1005][1005];
 int n,k;
void sang()
{
    a[1][0]=1;
    a[1][1]=1;
    for(int i=2;i<=n;i++){
        for(int j=0;j<=i;j++)
        {
            if(j==0 || j==i) a[i][j]=1;
            else a[i][j]=a[i-1][j-1]%mod+a[i-1][j]%mod;
        }
    }
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        
       
        cin>>n>>k;
        sang();
        cout<<a[n][k]%mod<<endl;
        
    }
}