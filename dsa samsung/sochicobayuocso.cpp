#include <iostream>
#include <cmath>
using namespace std;
bool isPrime(long long n) {
    if(n<2) return 0;
    for(long long i=2;i<=sqrt(n);i++)
    {
        if(n%i==0) return 0;
    }
    return 1;
}


int main() {
    int T;
   cin >> T;

    for (int i = 0; i < T; i++) {
        long long l, r;
       cin >> l >> r;
        long long cnt=0;
        for (long long i= sqrt(l);i<= sqrt(r);i++){
            if(isPrime(i)) cnt++;
        }
        cout<<cnt<<endl;
    }

    return 0;
}
