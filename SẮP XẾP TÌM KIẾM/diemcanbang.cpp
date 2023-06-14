
 #include<bits/stdc++.h>
using namespace std;
int sovle(int a[], int n){
    int suml=0,sum=0;
    for(int i=0;i<n;i++) {
        sum+=a[i];
    }
    for(int i=0;i<n;i++){
        sum-=a[i];
        int sumr=sum;
        if(sumr==suml){
            return i+1;
        }
        suml+=a[i];
    }
    return -1;

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
       
        for(int i=0;i<n;i++) {
           cin>>a[i];
        }
        cout<<sovle(a,n)<<endl;
        
    }
}
