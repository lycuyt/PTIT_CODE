
#include<bits/stdc++.h>
using namespace std; 
vector<string> res;
int n;
void init()
{
    int j=0;
    queue<string> q;
    q.push("6");
    res.push_back("6");
    j++;
    q.push("8");
    res.push_back("8");
    j++;
    while(1)
    {
        //lay ra phan tu o dau hang doi
        string top=q.front();
        q.pop();
        if(top.length()>n-1) break;
        
        res.push_back(top+"6");
        j++;
        
        res.push_back(top+"8");
        j++;
        q.push(top+"6");
        q.push(top+"8");

    }
    cout<<res.size()<<endl;
    for(int i=res.size()-1;i>=0;i--)
    {
        cout<<res[i]<<" ";
    }
    
}
int main()
{
     ios_base::sync_with_stdio(0);cin.tie(0);
   
    int t;cin>>t;
    while(t--)
    {
        res.clear();
        cin>>n;
        init();
        cout<<endl;

    }
}