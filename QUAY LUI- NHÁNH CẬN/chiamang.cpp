#include<iostream>
#include<algorithm>
#include<math.h>
#include<string>
#include<vector>
using namespace std;
int cnt=0;
int sum;
vector<int> tmp;
// k tap con co tong bang k
void Try(int i, int s, int a[], int n,int k)
{
    for(int j=i;j<=n;j++)
    {
        tmp.push_back(a[j]);
        s+=a[j];
        if(s == sum/k){
            cnt++;
            // for(int l=0;l<tmp.size();l++){
            //     cout<<tmp[l]<<" ";
            // }
            // cout<<endl;
        }else if(s<sum/k)
        {
            Try(j+1, s, a, n,k);
        }
        tmp.pop_back();
        s-=a[j];
        
    }
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,k;
        cin>>n>>k;
        int a[25];
        sum=0;
        cnt=0;
        tmp.clear();
        for(int i=1;i<=n;i++)
        {
            cin>>a[i];
            sum+=a[i];
        }
        if(sum%k!=0)
        {
            cout<<0<<endl;
        }else
        {
            Try(1,0,a,n,k);
            
            if(cnt>=k) cout<<1<<endl;
            else cout<<0<<endl;
        }


    }
}