#include<bits/stdc++.h>
using namespace std;
void nhap(long a[], int n){
    for(int i=0;i<n;i++) cin>>a[i];
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,m,k;
        cin>>n>>m>>k;
        long a[n],b[m],c[k];
        nhap(a,n);
        nhap(b,m);
        nhap(c,k);
       int x=0;
       int y=0;
       vector<int>v;
       while(x<n && y<m){
        if(a[x]<b[y]){
            x++;
        }
         
        else if(a[x]==b[y]){
            v.push_back(a[x]);
            x++;
            y++;
        }else{
            y++;
        }
       }
       vector<int> u;
       //v la giao cua 1 vs 2
       //giao cua v vs 3
       int h=0,z=0;
       while(h<v.size()&& z<k)
       {
            if(v[h]<c[z]) h++;
            else if(v[h]==c[z]){
                u.push_back(v[h]);
                h++;
                z++;
            }else{
                z++;
            }
       }
       if(u.size()==0) cout<<"NO";
       else{
             for(int i=0;i<u.size();i++) cout<<u[i]<<" ";
       }
       
            cout<<endl;
    }
}