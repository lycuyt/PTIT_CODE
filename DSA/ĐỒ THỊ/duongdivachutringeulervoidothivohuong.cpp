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

int slove()
{
    // dd eler
    //chu trinh euler
    // ko co
    //kiem tra tinh lien thong
    dfs(1);
    for(int i=1;i<=dinh;i++)
    {
        if(lt[i] == 0) return 0;
    }
    int dem=0;
   for(int i=1;i<=dinh;i++)
   {
        if(ke[i].size()%2 != 0)
        {
            dem++;
        }
   }
   if(dem > 2){
    return 0;
   }else if(dem==0){
    return 2;
   }else return 1;

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
       
	   for(int i=1;i<=canh;i++){
	   	int u,v;
	   	cin>>u>>v;
        
	   	ke[u].push_back(v);
	   	ke[v].push_back(u);
	   }
       cout<<slove()<<endl;
    }
}