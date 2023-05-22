#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    ios::sync_with_stdio(false); cin.tie(0);
	int t;cin>>t;
	while(t--)
	{
		int so;cin>>so;
		 string s; cin >> s;

		string res=s;
		// int count = 0;
		// do {
		//     count++;
		//     res += s;
		//     res += '\n';
		// } while(next_permutation(s.begin(), s.end()));

		// cout << count << '\n';
		// cout << res;
		// return 0;
		next_permutation(s.begin(),s.end());
		cout<<so<<" ";
		sort(res.begin(),res.end());
		if(res== s) cout<<"BIGGEST";
		else cout<<s;
		cout<<endl;
	}
   
}