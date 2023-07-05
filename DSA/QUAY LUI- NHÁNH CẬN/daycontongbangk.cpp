#include <bits/stdc++.h>
using namespace std;
vector<vector<int>>res;
vector<int>tmp;
int n, k;
int a[105];
void backtrack(int i, int sum)
{
    for(int j=i;j<n;j++){
        tmp.push_back(a[j]);
        sum+=a[j];
        if(sum==k){
            res.push_back(tmp);
        }else if(sum<k){
            backtrack(j+1,sum);
        }
         tmp.pop_back();
         sum-=a[j];
    }
}
int main() {
    int T;
    cin >> T;
    while (T--) {   
        cin>>n>>k;
        for(int i=0;i<n;i++) cin>>a[i];
        sort(a,a+n);
        res.clear();
        tmp.clear();
        backtrack(0,0);
       
        if (res.empty()) {
            cout << -1 << endl;
        } else {
            sort(res.begin(), res.end());
            for (auto& subres : res) {
                cout << "[";
                for (int i = 0; i < subres.size(); i++) {
                    cout << subres[i];
                    if (i < subres.size() - 1) {
                        cout << " ";
                    }
                }
                cout << "] ";
            }
            cout << endl;
        }
    }
    return 0;
}




