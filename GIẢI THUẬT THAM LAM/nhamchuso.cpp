#include<bits/stdc++.h>
using namespace std;
int main()
{
    string a, b,a1,a2,b1,b2;
    cin>>a>>b;
    
    a1=a;
    a2=a;
    b1=b;
    b2=b;
   
    //xet min
    for(int i=0;i<a.size();i++){
        if(a[i]=='6') a1[i]='5';
    }
    // cout<<a1<<" ";
    for(int i=0;i<b.length();i++){
        if(b[i]=='6') b1[i]='5';
    }
    // cout<<b1<<" ";
    long min= stoll(a1)+ stoll(b1);
    cout<<min<<" ";
    for(int i=0;i<a.length();i++){
        if(a[i]=='5') a2[i]='6';
    }
    // cout<<a2<<" ";
    for(int i=0;i<b.length();i++){
        if(b[i]=='5') b2[i]='6';
    }
//    cout<<b2<<" ";
    long max=stoll(a2)+stoll(b2);
    cout<<max;
    
}