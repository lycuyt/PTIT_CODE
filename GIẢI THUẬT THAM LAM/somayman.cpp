#include<bits/stdc++.h>
#include<queue>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int check=0;
        for(int i= n/7;i>=0;i--)
        {
            int m=n-i*7;
            // cout<<m<<endl;
            if(m%4==0)
            {
                check=1;
                for(int j=1;j<=m/4;j++){
                    cout<<4;
                }
                for(int j=1;j<=i;j++){
                    cout<<7;
                }
                break;
            }
            

        }
        if(check==0) cout<<-1;
        cout<<endl;
    }
}