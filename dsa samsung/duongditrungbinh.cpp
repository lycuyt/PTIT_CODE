#include<bits/stdc++.h>
#include<vector>
using namespace std;
int n, m;
int a[1005][1005];
void floyd()
{
    for(int k=1;k<=n;k++)
    {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
            {
                if (a[i][j] > a[i][k] + a[k][j]) {
                    a[i][j] = a[i][k] + a[k][j]; }
            }
        } 
    }

}
int main()
{
    //chuyen danh sach canh thanh ma tran trong so
    int t;cin>>t;
    while(t--)
    {
        cin>>n>>m;
   
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                a[i][j]=1e9;
            }
            a[i][i]=0;
            
        }
        for(int i=1;i<=m;i++)
        {
            int x, y;
            cin>>x>>y;
            a[x][y]=1;
        }
        
        floyd();
        double res=0;
        int cnt=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(a[i][j]!= 1e9 && i!=j){
                    res+=1.0*a[i][j];
                    cnt++;
                }
            }
        }
        cout<<fixed<<setprecision(2)<<res/cnt<<endl;
    }
    
}