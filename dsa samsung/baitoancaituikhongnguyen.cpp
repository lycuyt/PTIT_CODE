#include<bits/stdc++.h>
using namespace std;
struct items
{
    int profit, weight;
    /* data */
};
bool cmp(struct items a, struct items b){
    return a.profit/a.weight>b.profit/b.weight;
}

int main()
{
    int t;cin>>t;
    while(t--)
    {
        int n, w;cin>>n>>w;
        struct items a[n];
        for(int i=0;i<n;i++){
            cin>>a[i].profit>>a[i].weight;
        }
        sort(a, a+n, cmp);
        double value=0;
        for(int i=0;i<n;i++){
            if(w>=0 && a[i].weight<=w){
                w-=a[i].weight;
                value+=a[i].profit;
            }else if(w<a[i].weight){
                value+=a[i].profit*((double)w/a[i].weight);
                break;
            }
        }
        cout<<fixed<<setprecision(2)<<value<<endl;
    }
}