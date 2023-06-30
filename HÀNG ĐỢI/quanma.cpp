#include<bits/stdc++.h>
#include<queue>
using namespace std;
#define s second 
#define f first
 pair<int,int> path[]={{-2,-1},{-1,-2},{1,-2},{2,-1},{2,1},{1,2},{-1,2},{-2,1}};
int  slove(int x,int y, int z, int t){
    //x,y la o ban dau
    //z, t la o can di chuyen den
    int m[10][10];
    memset(m,0,sizeof(m));
    queue<pair<int,int >> q;
    pair<int,int> p;
    q.push({x,y});
    while(q.size())
    {
        p=q.front();
        q.pop();
        for(int i=0;i<8;i++)
        {
            if(!m[p.f+path[i].f][p.s+path[i].s] && p.f+path[i].f >=1 && p.f +path[i].f <=8 && p.s+path[i].s >=1 && p.s+path[i].s<=8)
            {
                if(p.f+path[i].f == z && p.s +path[i].s ==t) return m[p.f][p.s]+1;
                m[p.f+path[i].f][p.s+path[i].s]=m[p.f][p.s]+1;
                q.push({p.f+path[i].f,p.s + path[i].s});
            }
        }
    }
}
int main()
{
   
    int t;
    cin>>t;
    while(t--)
    {
        string s1,s2;
        cin>>s1>>s2;
        //chuyen s1, s2 thanh hang va cot
        string test="0abcdefgh";
        
        if(s1==s2) cout<<0<<endl;
        else{
            int x,y,z,t;
            //bien doi s1 thanh vi tri o khoi dau
            for(int i=1;i<test.size();i++){
                if(s1[0]==test[i]) y=i;
                if(s2[0]==test[i]) t=i;
            }
            x=s1[1]-48;
            z=s2[1]-48;
            cout<<slove(x,y,z,t)<<endl;
        }
        
        // cout<<x<<" "<<y<<"va"<<z<<" "<<t<<endl;
    }
}