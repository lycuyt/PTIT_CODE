#include<bits/stdc++.h>
using namespace std;
void tower(int n, char a, char b, char c){
    if(n==1){
        cout<<"\n"<<a<<" -> "<<c;
        return;
    }
    tower(n-1,a,c,b);
    tower(1,a,b,c);
    tower(n-1,b,a,c);// cot o giua la trung gian
}
int main()
{
    int n;
    cin>>n;
    
    tower(n,'A','B','C');
}