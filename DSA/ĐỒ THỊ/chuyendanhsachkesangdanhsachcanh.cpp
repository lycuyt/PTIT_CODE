#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    cin.ignore();
    vector<vector<int> > v;
    for(int i=1;i<=n;i++)
    {
        string s;
        getline(cin,s);
        //tach so
        vector<int> u;
        stringstream ss(s);
        string tmp;
        while(ss>> tmp){
            int a=stoi(tmp);
            u.push_back(a);
        }
        v.push_back(u);
    }

    for(int i=0;i<v.size();i++){
        for(int j=0;j<v[i].size();j++){
            if(v[i][j]>i+1){
                cout<<i+1<<" "<<v[i][j]<<endl;
            }
        }
    }
    
}