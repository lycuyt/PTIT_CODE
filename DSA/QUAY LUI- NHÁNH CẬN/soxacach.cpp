#include<iostream>
#include<math.h>
#include<vector>
#include<algorithm>
using namespace std;

int X[15];
int n;

bool unused[100];


vector <long long> res;
int check(){
   //ko co 2 so lien tiep nao co hieu bang 1
   for(int i=1;i<=n-1;i++){
        if(abs(X[i]-X[i+1])==1 ){
            return 0;
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
                
                if(check()==1){
                     for(int i = 1; i <= n; ++i) cout << X[i];
                    cout << endl;
                }
            }
            else{
                Try_i(i+1); 
            }
            unused[j] = true;
        }
    }
}

int main(){
    int t;
    cin>>t;
    while(t--)
    {
        cin>>n;
        if(n<4){
            cout<<endl;
            continue;
        }
        for(int i=1; i<=n; i++){
            unused[i] = true;
        }

        Try_i(1);

        // cout<<res.size()<<endl;

        // sort(res.begin(),res.end());
        // for(int i=0;i<res.size();i++){
        //     cout<<res[i]<<endl;
        // }
        cout<<endl;
        
    }
    
    
}