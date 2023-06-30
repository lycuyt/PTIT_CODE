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
void xetcacdinh()
{
    
    for(int i=1;i<=dinh;i++)
    {
        memset(lt,0,sizeof(lt));
        lt[i]=1;
        int dem=0;
        int l= tpltdfs();
        if(l> h) cout<<i<<" ";
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
       xetcacdinh();
        cout<<endl;
    }
}