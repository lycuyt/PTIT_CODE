// do thi vo huong
#include<bits/stdc++.h>
using namespace std;
vector<vector<int> > ke(10005);
int h;
int lt[10005];
int k;
int canh, dinh;
// tim cac thanh phan lien thong cua do thi G
//dfs
void dfs(int u){
    lt[u]=1;
    for(int i=0;i<ke[u].size();i++)
    {
        if(lt[ke[u][i]]==0 && ke[u][i]>0){
            dfs(ke[u][i]);
        }
    }
}
//tinh thanh phan lien thong
int tpltdfs()
{
    k=0;
    
    for(int u=1;u<=dinh;u++)
    {
        if(lt[u]==0){
            k++;
            dfs(u);
        }
    }
    return k;

}
//canh cau
pair<int,int> a[10005];
//pair chua cac canh
void xetcaccanh()
{
    int l;
    int k=tpltdfs();
    for(int i=1;i<=canh;i++)
    {
     
        //lay 2 canh cua pair
        int n,m;
        n=a[i].first;
        m=a[i].second;
        //xoa canh do di
        //xoa n trong ke[m]
        for(int p=0;p<ke[m].size();p++)
        {
            if(ke[m][p]== n){
                ke[m][p]=-1;
            }
        }

        //xoa m trong ke[n]
        for(int p=0;p<ke[n].size();p++)
        {
            if(ke[n][p]== m){
                ke[n][p]=-1;
            }
        }
        
        for(int j=1;j<=dinh;j++)
        {
            lt[j]=0;
	    }
        l=tpltdfs();
        // cout<<l<<endl;
        if(l>h){
            cout<<n<<" "<<m<<" ";
        }
        //them lai n trong ke[m]
        for(int p=0;p<ke[m].size();p++)
        {
            if(ke[m][p]== -1){
                ke[m][p]= n;
            }
        }

        //them lai m trong ke[n]
        for(int p=0;p<ke[n].size();p++)
        {
            if(ke[n][p]== -1){
                ke[n][p]= m;
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
        k=0;
        cin>>dinh>>canh;
        for(int i=1;i<=dinh;i++)
       {
       	ke[i].clear();
       	lt[i]=0;
	   }
        int p=1;
	   for(int i=1;i<=canh;i++){
	   	int u,v;
	   	cin>>u>>v;
        a[p].first=u;
        a[p].second=v;
        p++;
	   	ke[u].push_back(v);
	   	ke[v].push_back(u);
	   }
       //so thanh phan lien thong ban dau
        h=tpltdfs();
    //    cout<<h<<endl;
       xetcaccanh();
        cout<<endl;
    }
}