#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int a[n], d[n]={0};
        int sum=0;
        for(int i=0;i<n;i++) {
            cin>>a[i];
            sum+=a[i];
        }
        sort(a,a+n);
        if(sum%3==0){
            for(int i=n-1;i>=0;i--){
                cout<<a[i];
            }
        }else if(sum%3==1){
            int cnt=0;
            for(int i=0;i<n;i++){
                if(a[i]%3==1){
                    d[i]=-1;
                    break;
                }else if(a[i]%3==2){
                    cnt++;
                }
            }
            if(cnt==2) cout<<-1;
            else{
                for(int i=n-1;i>=0;i--){
                if(d[i]!= -1) cout<<a[i];
            }
            }
           
        }else if(sum%3==2){
            int cnt=0;
            for(int i=0;i<n;i++){
                if(a[i]%3==2){
                    d[i]=-1;
                    break;
                }else if(a[i]%3==1){
                    cnt++;
                }
            }
            if(cnt==2) cout<<-1;
            else{
                for(int i=n-1;i>=0;i--){
                if(d[i]!= -1) cout<<a[i];
            }
            }
            
           
        }
        
        cout<<endl;
    }
}