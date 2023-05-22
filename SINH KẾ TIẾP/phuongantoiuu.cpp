#include<bits/stdc++.h>
using namespace std;
//dung vet can
//sinh nhi phan co n phan tu
int x[105];
int n,w;
int c[105],a[105];
void sinh()
{
    int i=n;
    while(x[i]==1 && i>=0){
        x[i]=0;
        i--;
    }
    x[i]=1;
}
void in(){
    for(int i=1;i<=n;i++){
        cout<<x[i];
    }
    cout<<endl;
}
int  check(){
    int sum1=0;
    
    for(int i=1;i<=n;i++){
        sum1+=x[i]*a[i];
    }
   if(sum1>w) return 0;
   else return 1;
    
}
int main()
{
    cin>>n>>w;
   
    for(int i=1;i<=n;i++)
    {
        cin>>c[i];
    }
    for(int i=1;i<=n;i++)
    {
        cin>>a[i];
    }
    for(int i=1;i<=n;i++)
    {
        x[i]=0;
    }

    int fopt=0;
    vector<vector<int> > u;
    int vt;
    for(int i=1;i<=pow(2,n);i++)
    {
        vector<int>v;
        for(int j=1;j<=n;j++){
                v.push_back(x[j]);
        }
        u.push_back(v);
        if(check()){
           
            int sum2=0;
            for(int j=1;j<=n;j++){
                sum2+=x[j]*c[j];
               
            }
           
            if(sum2>fopt){
                fopt=sum2;
                vt=i;
            }
            }
         sinh();   
            
    }
        
    
    cout<<fopt<<endl;
    // cout<<vt;
    for(int k=0;k<u[vt-1].size();k++){
        cout<<u[vt-1][k]<<' ';
    }
}