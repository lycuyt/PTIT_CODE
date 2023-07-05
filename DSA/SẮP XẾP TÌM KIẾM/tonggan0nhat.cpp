
 #include<bits/stdc++.h>
using namespace std;

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
        int sum=a[0]+a[1];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int sum1=a[i]+a[j];
                if(abs(sum1)<abs(sum)){
                    sum=sum1;
                }
            }
        }
        cout<<sum;
        cout<<endl;

    }
}
