
#include<bits/stdc++.h>
using namespace std; 
vector<long long> res;
int n;
void init()
{
    
    int j=0;
    queue<string> q;
    q.push("1");
    res.push_back(1);
    if(res[j]%n==0) {
        cout<<res[j]<<endl;
        return;
    }
    j++;
    while(1)
    {
        //lay ra phan tu o dau hang doi
        string top=q.front();
        q.pop();
        // if(res[j]>n) break;
        res.push_back(stoll(top+"0"));
       if(res[j]%n==0) {
            cout<<res[j]<<endl;
            return;
        }
        j++;
        // cout<<j<<endl;
        res.push_back(stoll(top+"1"));
       if(res[j]%n==0) {
            cout<<res[j]<<endl;
            return;
        }
        j++;
        // cout<<j<<endl;
        q.push(top+"0");
        q.push(top+"1");

    }
   
}
// tim so BDN dau tien chia het cho n
int main()
{
    
    int t;cin>>t;
    while(t--)
    {
        
        cin>>n;
        res.clear();
        init();
        

    }
}