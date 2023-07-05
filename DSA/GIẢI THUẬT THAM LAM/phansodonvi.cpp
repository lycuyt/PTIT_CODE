#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        long long p,q;
        cin>>p>>q;
        long long x=0;
        // qui ve 1/(q/p)
        while(1){
            if(q%p==0){
                cout<<"1/"<<q/p<<endl;
                break;
            }
            x=q/p+1;
            cout<<"1/"<<x<<" + ";
            p=x*p-q;// cap nhat tu moi
            q=q*x;// cap nhat mau moi
        }
    }
}