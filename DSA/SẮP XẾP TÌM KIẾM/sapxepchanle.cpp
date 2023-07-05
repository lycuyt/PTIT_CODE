
#include<bits/stdc++.h>
using namespace std;
bool cmp(long a, long b){
    return a>b;
}
int main()
{
    int n;
    cin>>n;
    long int a[n+5],b[n+5];
    int dem1=0,dem2=0;
    for(int i=0;i<n;i++) {
        if(i%2==0) {
            cin>>a[dem1];
            dem1++;
        }else{
            cin>>b[dem2];
            dem2++;
        }
    }
    // sap xep le tang dan, chan giam dan
    // vector<long > le;
    // vector<long> chan;
    // for(int i=0;i<n;i++){
    //     if(i%2==0){
    //         le.push_back(a[i]);
    //     }else{
    //         chan.push_back(a[i]);
    //     }

    // }
   
    // sort(le.begin(), le.end());
    // sort(chan.begin(), chan.end(), cmp);
    sort(a,a+dem1);
    sort(b,b+dem2);
    if(n%2==0){
        for(int i=0;i<le.size();i++){
            cout<<le[i]<<" "<<chan[i]<<" ";
        }
    }else{
        for(int i=0;i<chan.size();i++){
            cout<<le[i]<<" "<< chan[i]<<" ";
        }
        cout<<le[le.size()-1];
    }
    

}