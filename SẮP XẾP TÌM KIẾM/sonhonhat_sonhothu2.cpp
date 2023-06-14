#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    while (t--)
    {
        int n;
        cin>>n;
        int a[n];
       set<int>se;

        for(int i=0;i<n;i++){
            cin>>a[i];
            se.insert(a[i]);
           
        }
        int len=se.size();
        if(se.size()==1) cout<<-1<<endl;
        else {
            int b[len];
            int k=0;
            for(set<int>::iterator it =se.begin();it != se.end();it++ ){
                b[k]=*it;
                k++;
            }
            cout<<b[0]<<" "<<b[1]<<endl;
        }
        
    }
    
}