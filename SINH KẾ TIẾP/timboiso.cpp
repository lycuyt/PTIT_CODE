#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        string s= to_string (n);
        int m=s.size();
       
        // sinh xau nhi phan co do dai lon hon hoac bang m
        int a[100];
        int kt=0;
        while(1)
        {
            for(int i=0;i<m;i++) a[i]=0;
            
            for(int k=0;k<pow(2,m);k++)
            {
                long long sum=0;
                for(int i=0;i<m;i++){
                    sum=sum*10+a[i];

                }
                // cout<<sum<<" ";
                if(sum% n ==0 && sum != 0){
                    kt=1;
                    cout<<sum<<endl;;
                    break;
                }
                //sinh
                int i=m-1;
                while(a[i]== 9 && i>=0)
                {
                    a[i]=0;
                    i--;
                }
                a[i]=9;

                

            }
            if(kt==1) break;
            else m++;
            
        }

    }
}