#include<bits/stdc++.h>
using namespace std;
int main(){
	string a[3]={"0202","2002","2202"};

	string b[8]={"2000","2002","2020","2022","2200","2202","2220","2222"};
	string k[24];
	vector<string> res;
		for(int j=0;j<3;j++){
			for(int l=0;l<8;l++){
				
				string e=a[j];
				string f=b[l];
				string k=e+f;
				res.push_back(k);
			}
		}
	sort(res.begin(), res.end());
	
	for(int i=0;i<res.size();i++){
		cout<<res[i][0]<<res[i][1]<<"/";
		cout<<res[i][2]<<res[i][3]<<"/";
		for(int j=4;j<8;j++){
			cout<<res[i][j];
		}
		cout<<endl;
	}
}
