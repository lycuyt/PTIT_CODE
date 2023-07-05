#include<bits/stdc++.h>
using namespace std;
vector<int> v;
struct node
{
    int data;
    node* left;
    node* right;
    /* data */
};
typedef node* Tree;
Tree makeNode(int x)
{
    Tree p= new node;
    p->data= x;
    p->left= NULL;
    p-> right=NULL;
    return p;
}
Tree search( Tree T, int x)
{
    Tree p=new node;
    if(T==NULL ) return T;
    if(T->data== x) return T;
    p=search(T->left, x);
    if(p== NULL) p=search(T->right, x);
    return p;
}
void addleft(Tree T, int x, int y)
{
    Tree p= new node;
    p=search(T, x);
    if(p==NULL) return;
    else if(p->left != NULL) return;
    else p->left= makeNode(y);
}
void addright(Tree T, int x, int y)
{
    Tree p=new node;
    p=search(T, x);
    if(p==NULL) return;
    else if(p->right!= NULL) return;
    else p->right = makeNode(y);
}
void LNR(Tree T){
    if(T!=NULL)
    {
        LNR(T->left);
        v.push_back(T->data);
        LNR(T->right);
    }
}

int main()
{
    int t;
    cin>>t;
    while (t--)
    {
        int n, x, y;
        cin>>n;
        string s;
        Tree T;
        v.clear();
        for(int i=0;i<n;i++)
        {
            cin>>x>>y>>s;
            if(i==0) T=makeNode(x);
            if(s=="L") addleft(T,x,y);
            if(s=="R") addright(T, x, y);
        }
        LNR(T);
        sort(v.begin(),v.end());
        for(int i=0;i<v.size();i++){
            cout<<v[i]<<" ";
        }
        cout<<endl;
        /* code */
    }
    
}