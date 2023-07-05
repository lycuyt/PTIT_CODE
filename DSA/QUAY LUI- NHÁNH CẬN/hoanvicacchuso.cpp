#include<bits/stdc++.h>
using namespace std;
int x[10];
int vs[10];
string a[10];
int n,k;
long check(){
    
    long b[10];
    for(int i=0;i<n;i++){
        //sinh ra cac hoan vi cua tung so
        string s=a[i];
        string res="";
        for(int l=1;l<=k;l++){
            res=res+string(1,s[x[l]-1]);
        }
        long tmp=stoll(res);
        b[i]=tmp;
        // cout<<res<<" ";
    }
    // cout<<endl;
    long min=b[0];
    long max=b[0];
    for(int i=0;i<n;i++){
       if(b[i]<min) min=b[i];
       if(b[i]>max) max=b[i];
    }
    return max-min;
}
long ans=100000000;
void Try(int i){
    for(int j=1;j<=k;j++){
        if(vs[j]==0){
            x[i]=j;
            vs[j]=1;
            if(i==k){
                long me=check();
                ans=min(ans,me);
                
            }else{
                Try(i+1);
            }
            vs[j]=0;
        }
    }
}
int main(){
   
    cin>>n>>k;
    
    for(int i=0;i<n;i++) cin>>a[i];
    memset(vs,0,sizeof(vs));
    Try(1);
    cout<<ans<<endl;

}