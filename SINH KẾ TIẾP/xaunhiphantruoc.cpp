#include<bits/stdc++.h>
using namespace std;
int check(string s){
	for(int i=0;i<s.size();i++){
		if(s[i]!='0') return 0;
	}
	return 1;
}
int main(){
	int t;cin>>t;
	while(t--){
		string s;
		cin>>s;
		int len=s.size();
		
		if(check(s)==1){
			for(int j=0;j<len;j++){
				cout<<1;
			}
		}else{
			if(s[len-1]=='1') {
				for(int i=0;i<len-1;i++) cout<<s[i];
				cout<<0;
			}else{
				int i=len -1;
				while(s[i] == '0' && i>=0){
					s[i]='1';
					i--;
				}
				s[i]='0';
				for(int i=0;i<len;i++) cout<<s[i];
				
			}
		}

		cout<<endl;
	}
}
