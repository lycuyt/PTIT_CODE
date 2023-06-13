#include<iostream>
#include<math.h>
using namespace std;

int X[11];
int n;
bool unused[11];
string s;

void xuat(int A[], int n) {
    for (int i = 1; i <= n; i++)
        cout <<s[A[i]-1];
    cout << " ";
}

void Try_i(int i){
   for (int j=1; j<=n; j++){ // cac gia tri co the xay ra
        if (unused[j] == true) { // kiem tra dk co duoc chap nhan hay khong ( da duoc su dung cho phan tu khac chua)
            X[i] = j;
            unused[j] = false;  //gia tri nay da duoc gan roi
            if (i ==n){
                xuat(X, n); // neu da xet het tat ca phan tu thi dua ra day hoan vi
            }
            else{
                Try_i(i+1); // neu chua xet het xet den phan tu i+1
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
		cin>>s;
		
		n=s.size();
		for(int i=1; i<=n; i++){
	        unused[i] = true; // khoi tao mang logic , cac vi tri deu bang True vi chua dc sd
	    }
	
	    Try_i(1);
	    cout<<endl;
	}
    
    return 0;
}
