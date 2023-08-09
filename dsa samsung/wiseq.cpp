#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n, w;
	cin>>n>>w;
	int a[n], s[n], l[n];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
        s[i]=a[i];
        l[i]=1;
    }
    if(n<=500)
    {
        int res=-1;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(a[j]<a[i]  && s[j]+a[i]<=w)
                {
                    if(l[j]+1>l[i]){
                        l[i]=l[j]+1;
                        s[i]=s[j]+a[i];
                    }
                    res=max(res, l[i]);
                }
            }
        }
        cout<<res<<endl;
    }else{
        vector<int> b;
        for(int i=0;i<n;i++)
	    {
            // tim phan tu dau tien trong mang lon hon hoac bang a[i]
            auto it = lower_bound(b.begin(), b.end(), a[i]);
            // neu khong tim thay phan tu do thi push vao mang b
            if(it == b.end()) b.push_back(a[i]);
            else *it= a[i];// neu thay thi thay phan tu do bang a[i]
	    }
        cout<<b.size()<<endl;
    }
}