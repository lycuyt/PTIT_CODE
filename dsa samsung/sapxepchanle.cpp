#include<bits/stdc++.h>
using namespace std;
bool cmp(int a, int b){
    return a>b;
}
int main()
{
    int n;cin>>n;
    int a[n+1];
    int b[n+1];
    for(int i=1;i<=n;i++) {
        cin>>a[i];
        b[i]=a[i];
    }
    vector<int> chan;
    vector<int> le;
    for(int i=1;i<=n;i++){
        if(a[i]%2==0){
            chan.push_back(a[i]);
        }else{
            le.push_back(a[i]);
        }
    }
    sort(chan.begin(), chan.end());
    sort(le.begin(), le.end(), cmp);
    // in lai theo dung chi so
    int l=0;
    int k=0;
    for(int i=1;i<=n;i++){
        if(b[i]%2==0){
            cout<<chan[l]<<' ';
            l++;
        }else{
            cout<<le[k]<<" ";
            k++;
        }
    }
}