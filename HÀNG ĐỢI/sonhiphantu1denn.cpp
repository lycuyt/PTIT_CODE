#include<iostream>
#include<queue>
#include<algorithm>
#include<vector>
using namespace std; 
vector<string> res;
void init()
{
    queue<string> q;
    q.push("1");
    res.push_back("1");
    while(res.size()<10000)
    {
        //lay ra phan tu o dau hang doi
        string top=q.front();
        q.pop();
        res.push_back(top+"0");
        res.push_back(top+"1");
        q.push(top+"0");
        q.push(top+"1");

    }
}
int main()
{
    init();
    int t;cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        for(int i=0;i<n;i++) cout<<res[i]<<" ";
        cout<<endl;

    }
}