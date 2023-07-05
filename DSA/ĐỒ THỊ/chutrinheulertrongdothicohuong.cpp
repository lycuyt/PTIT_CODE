// do thi vo huong
#include<bits/stdc++.h>
using namespace std;
vector<vector<int> > ke(10005);
vector<vector<int> > nen(10005);
int h;
int lt[10005];
int k;
int canh, dinh;
// tim cac thanh phan lien thong cua do thi G
//dfs
void dfs(int u){
    lt[u]=1;
    for(int i=0;i<nen[u].size();i++)
    {
        if(lt[nen[u][i]]==0 && nen[u][i]>0){
            dfs(nen[u][i]);
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
    //ban bac ra deg()+
    vector<int> ra;
    for(int i=1;i<=dinh;i++){
        ra.push_back(ke[i].size());
    }
    // ban bac vao deg()-
    vector<int> vao;
    for(int i=1;i<=dinh;i++)
    {
        int dem=0;
        // so lan xuat hien cua dinh i trong cac ke[v]
        for(int j=1;j<=dinh;j++)
        {
            if(j != i)
            {
                for(int p=0;p<ke[j].size();p++)
                {
                    if(ke[j][p] == i){
                        dem++;
                    }
                }
            }
           
        }
         vao.push_back(dem);
    }
    for(int i=0;i<dinh;i++)
    {
       if(ra[i] != vao[i]) return 0;
    }
    return 1;
   
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
        nen[u].push_back(v);
        nen[v].push_back(u);
	   }
       cout<<slove();
       cout<<endl;
    }
}