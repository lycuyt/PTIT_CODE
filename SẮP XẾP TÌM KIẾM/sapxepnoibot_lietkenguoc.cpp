#include<bits/stdc++.h>
using namespace std;
int check(int a[], int n){
    for(int i=0;i<n-1;i++){
        if(a[i]>a[i+1]) return 0;
    }
    return 1;
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int a[n];
        for(int i=0;i<n;i++) cin>>a[i];
        vector< vector<int> > v;
        for(int  i=0;i<n;i++)
        {
          
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    swap(a[j],a[j+1]);
                }
            }
            vector<int>u;
            for(int k=0;k<n;k++) u.push_back(a[k]);
            v.push_back(u);
            //kiem tra xem nos dung mang can sx chua 
            if(check(a,n)==1){
                break;
            }
            
        }
        int len=v.size();
        for(int i=len-1;i>=0;i--){
            cout<<"Buoc "<<i+1<<": ";
            for(int j=0;j<v[i].size();j++){
                cout<<v[i][j]<<" ";
            }
            cout<<endl;
        }
    }
    
}