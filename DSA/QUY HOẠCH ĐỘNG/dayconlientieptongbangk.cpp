#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        long long s;
        cin>>n>>s;
        long  a[n+1];
        bool check = false;
        long long sum=0;
        int j=0;
        for(int i=0;i<n;i++) {cin>>a[i];}
        for(int i=0;i<n;i++){
            sum+=a[i];
            while(sum>s && j<i){
                sum-=a[j];
                j++;
            }
            if(sum==s){
                check=true;
                break;
            }
        }
        if(check){
            cout<<"YES"<<endl;
        }else cout<<"NO"<<endl;
        
    }
}