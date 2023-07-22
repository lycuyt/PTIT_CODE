#include<bits/stdc++.h>
using namespace std;
void chuyen( int a, int b)
{
    // cout<<char(a+'A')<<char(b+'A')<<endl;
    cout<<char(a+'A');
    
}
void tower(int n, int s, int t){
    if (n<=0) {
        return;
    }
    if(t==(s+1)%3){
        tower(n-1,s,3-s-t);
        chuyen(s, t);
        tower(n-1,3-s-t,t);
    }
    else{
        tower(n-1, s, t);
        chuyen(s, 3-s-t);
        tower(n-1, t, s);
        chuyen(3-s-t, t);
        tower(n-1, s, t);
    }
}
int main()
{
    int n;
    cin>>n;
    tower(n,0,2);//chuyen tu cot 0 sang cot 2
}