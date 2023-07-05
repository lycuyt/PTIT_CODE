#include<bits/stdc++.h> 
using namespace std;
int n,a[1000],b[1000];
vector <string> v; 
//chuyen 1 so thanh string
string tostring(int m){
    string s="";
    while(m>0){
        int l=m%10;
        char r= char(l+48);
        s= r+s;
        m=m/10;
    }
    return s;

}
void in(){
	string s=""; 
	for(int i=1;i<=n;i++){
        if(a[i]==1){
            s+=tostring(b[i]);
            s+=" ";
        }
    } 
    v.push_back(s);
}
int check(){
	int k[1000]; 
	int d=0; 
	int dem=0; 
	for (int i=1;i<=n;i++){
		if (a[i]==1){
			dem++; 
			k[d++]=b[i];
		}
	}
	if (dem<=1) return 0; 
	for (int i=0;i<d-1;i++){
		if (k[i]>k[i+1]) return 0;  
	}return 1; 
}
// void in()
// {
//     for(int i=1;i<=n;i++){
//         cout<<a[i];
//     }
//     cout<<endl;
// }
void Try(int i){
	for (int j=0;j<=1;j++){
		a[i]=j;
		if (i==n){
			if (check()==1){
				in();
			}
			
		}
		else Try(i+1);
	}
}
int main(){
	cin>>n;
	for (int i=1;i<=n;i++){
		cin>>b[i];
	}
	Try(1);
	sort(v.begin(),v.end());
	for (int i=0;i<v.size();i++){
		cout<<v[i]<<endl; 
	}
}