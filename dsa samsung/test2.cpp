#include<bits/stdc++.h>
using namespace std;
const long  mod= 111539786;
int n;
int a[6];
int f[31][31][31][31][31];
int id[31];
int ia[6];
int getid(int x)
{
    if(id[x]>-1) return id[x];
    if(x%2==1) return id[x]=getid(x-1)+1;
    else return id[x]=getid(x/2)+1;
}
int cal1()
{
    

    if(f[ia[0]][ia[1]][ia[2]][ia[3]][ia[4]]>-1) return f[ia[0]][ia[1]][ia[2]][ia[3]][ia[4]];
    long res=0;
    for(int i=0;i<=n-1;i++)
    {
        int j=(i+1)%n;
        if(ia[i]%2==1 && ia[j]%2==1){
            ia[i]--;ia[j]--;
            res=(res+cal1())%mod;
            ia[i]++;ia[j]++;
        }
        
    }
    for(int i=0;i<=n-1;i++)
    {
        int j=(i+1)%n;
        if( ia[i]>0 && ia[j]>0){
            int l=ia[i],r=ia[j];
            ia[i]=ia[i]/2;ia[j]=ia[j]/2;
            res=(res+cal1())%mod;
            ia[i]=l;ia[j]=r;
        }
    }
    return f[ia[0]][ia[1]][ia[2]][ia[3]][ia[4]]=res;
}


int main()
{
    cin>>n;
    memset(a, 0, sizeof(a));
    memset(id, -1, sizeof(id));
    memset(f, -1, sizeof(f));
    memset(ia,0,sizeof(ia));
    for(int i=0;i<n;i++) {
        cin>>a[i];
    }
    f[0][0][0][0][0]=1;
    id[0]=0;
    // for(int i=0;i<=n-1;i++){
    //     ia[i]=getid(a[i]);
    // }
    cout<<getid(30000)<<" ";
    // cout<<cal1(); 
}
