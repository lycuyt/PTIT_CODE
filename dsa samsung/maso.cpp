#include<bits/stdc++.h>
using namespace std;
int n;
string s="0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
// sinh cac hoan vi tu 1 den n
int x[10];
int vs[10];
vector<string>fi;
// sinh hoan vi
void Try(int i){
    for(int j=1;j<=n;j++){
        if(vs[j]==0){
            x[i]=j;
            vs[j]=1;
            if(i==n){
                string res="";
                for(int l=1;l<=n;l++){
                    res=res+string(1,s[x[l]]);
                }
                fi.push_back(res);
            }else{
                Try(i+1);
            }
            vs[j]=0;
        }
    }
}
vector<string> se;
void backtrack(int i, string s=""){
    if(i==n){
        se.push_back(s);
        return;
        
    }
    for(int j=1;j<=n;j++){
        backtrack(i+1, s+to_string(j));
    }
    
}
int main()
{
    cin>>n;
    memset(vs,0,sizeof(vs));
    Try(1);
    backtrack(0);
    for(int i=0;i<fi.size();i++){
        for(int j=0;j<se.size();j++){
            cout<<fi[i]<<se[j]<<endl;
        }
    }
}