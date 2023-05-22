#include<bits/stdc++.h>
using namespace std;

int n,a[100],k;
string s="";
vector<string> res;

void Try(int i)
{
    for(int j=0;j<=1;j++)
    {
        a[i]=j;
        if(i==n-k)
        {
            //0 la A, 1 la B
            for(int l=1;l<=n;l++)
            {
                if(l==1 && a[l]==1)
                {
                    string tmp= s;
                    for(int p=1;p<=n-k;p++){
                        if(a[p]) tmp+="B";
                        else tmp+="A";

                    }
                    res.push_back(tmp);
                }
                if(l==n-k && a[l]==1)
                {
                    string tmp="";
                    for(int p=1;p<=n-k;p++){
                        if(a[p]) tmp+="B";
                        else tmp+="A";

                    }
                    tmp+=s;
                    res.push_back(tmp);
                }
                if(a[l]==1 && a[l-1]==1 && l>1)
                {
                    string tmp="";
                    for(int p=1;p<=n-k;p++){
                        if(p==l) tmp+=s;
                        if(a[p]) tmp+="B";
                        else tmp+="A";

                    }
                    res.push_back(tmp);
                } 
            }
        }
        else Try(i+1);
    }
}
int main()
{
    ios_base::sync_with_stdio(0);cin.tie(0);
    cin>>n>>k;
    for(int i=0;i<k;i++)
    {
        s+="A";
    }
    Try(1);
    sort(res.begin(),res.end());
    cout<<res.size()<<endl;
    for(int i=0;i<res.size();i++)
    {
        cout<<res[i]<<endl;
    }

}