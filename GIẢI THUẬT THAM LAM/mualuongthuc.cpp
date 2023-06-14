#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,s,m;
        cin>>n>>s>>m;
        //tinh so ngay chu nhat
        int cn=s/7;
        // cout<<cn<<endl;
        int kt=1;
        if(n<m){
            cout<<-1<<endl;
        }else if(s*m>n*(s-cn)){
            cout<<-1<<endl;
        }
        else{

            float sl;
            sl=(float) m*s/n;
            int sll=int(sl);
            if(sl==sll) cout<<sll<<endl;
            else cout<<sll+1<<endl;
            //check so thap phan
            // cout<<fixed<<setprecision(2)<<sl<<endl;

        }
        
    }
}