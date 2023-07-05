#include <bits/stdc++.h>
using namespace std;
int main(){
	int t;
	cin>>t;
    long long n;
	while(t--){
		int cnt=0;
		cin>>n;
		queue<string> q;
		q.push("1");
        cnt++;
		while(1){
			string s=q.front();
			q.pop();
            string a=s+"0";
            if(stoll(a)>n) break;
            cnt++;
            string b=s+"1";
            if(stoll(b)>n) break;
            cnt++;
			q.push(s+"0");
			q.push(s+"1");
		}
		cout<<cnt<<endl;
	}
}
