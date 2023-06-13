// sinh to hop lap chap k cua n
//pp sinh]
// xet tu cuoi day lai gap chu so nao chua bang n thi
// + tang chu so do len 1
// + gan tat ca cac so dang sau bang 1
#include<bits/stdc++.h>
using namespace std;
string m="0ABCDEFGHIJ";
char x;
int k;

void Try(int i, string s="", char c='A'){
    if(i==k){
        cout<<s<<endl;
        return;
    }
    for(char j=c;j<=x;j++) Try(i+1,s+j,j);
}
//sinh xong fai loai bo cac hoan vi cua nhau
int main()
{
    cin>>x;
    cin>>k;
    Try(0);
    // cout<<n;
    
  
  
}