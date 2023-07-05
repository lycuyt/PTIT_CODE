#include<iostream>
#include<math.h>
#include<vector>
#include<algorithm>
using namespace std;
string s="0ABCDEFGH";
int X[100];
int n;
char c;
bool unused[100];


vector <string> res;
int check(string x){
    //ktra xau ko co nguyen am nao kep giua 2 phu am
    // nguyen am la s[1]=A va s[5]=E
    for(int i=0;i<n-2;i++){
        // xet 3 so lien tiep
        if(x[i]!=s[1] && x[i]!=s[5] && x[i+2]!=s[1] && x[i+2]!=s[5]){
            if(x[i+1]==s[1]) return 0;
            if(x[i+1]==s[5]) return 0;
        }

    }
    return 1;
}
void Try_i(int i){
   for (int j=1; j<=n; j++){ 
        if (unused[j] == true) { 
            X[i] = j;
            unused[j] = false;  
            if (i ==n){
                
                string x="";
                for(int l=1;l<=n;l++){
                    x+=s[X[l]];
                }
                
                if(check(x)==1) res.push_back(x);
            }
            else{
                Try_i(i+1); 
            }
            unused[j] = true;
        }
    }
}

int main(){
    cin>>c;
    n=int(c-48)-int ('A'-48)+1;
    // cout<<n;
    for(int i=1; i<=n; i++){
        unused[i] = true;
    }

    Try_i(1);

    // cout<<res.size()<<endl;

    sort(res.begin(),res.end());
    for(int i=0;i<res.size();i++){
        cout<<res[i]<<endl;
    }
    return 0;
}