#include<bits/stdc++.h>
using namespace std;
vector<char> res;
int a[25];
char s[25];

void chuyen( int a, int b){
    // cout<<char(a+'A')<<char(b+'A')<<endl;
    res.push_back(char(a+'A'));
    res.push_back(char(b+'A'));
}
void hanoi(int n, int dest){
    if(n<=0) return;
    if(a[n]!=dest){
        hanoi(n-1, 3-a[n]-dest);
        chuyen( a[n], dest);
        a[n]=dest;
    }
    hanoi(n-1, dest);
}
int main(){
    int n;cin>>n;
    for(int i=1;i<=n;i++){
        cin>>s[i];
        a[i]=s[i]-'A';
    }
    // for(int x: a) cout<<x;
    hanoi(n,2);
    cout<<res.size()/2<<endl;
    for (long long i=0;i<res.size();i+=2) cout<<res[i]<<res[i+1]<<endl;
}