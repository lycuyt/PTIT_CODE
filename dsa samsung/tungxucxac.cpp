#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--)
    {
        long long d[121]={0};
        int n, s;cin>>n>>s;
        n--;
        d[1]=d[2]=d[3]=d[4]=d[5]=d[6]=1;
        while (n--)
        {
            long long tmp[121]={0};
            for(int i=120;i>=0;i--)
            {
                for(int j=i-1;j>=max(0,i-6);j--){
                    if(d[j]!=0) tmp[i]+=d[j];
                }
                
            }
            for(int i=0;i<121;i++)
            {
                d[i]=tmp[i];
            }
            /* code */
        }
        cout<<d[s]<<endl;
        
    }
}