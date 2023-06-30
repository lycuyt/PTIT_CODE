#include<bits/stdc++.h>
using namespace std;
int n;
string a[1005];
struct node
{
    string s;
    node* left;
    node* right;
    /* data */
};
typedef node* tree;
tree makenode(string x)
{
    tree T= new node;
    T->s= x;
    T->left= NULL;
    T->right=NULL;
    return T;
}
tree taocay(tree t, int i)
{
    if(i<n)
    {
        t= makenode(a[i]);
        t->left =taocay(t->left,2*i+1);
        t->right =taocay(t->right,2*i+2);
    }
    return t;
}
long long  slove(tree t){
    if(t->s != "+" && t->s !="-" && t->s != "*" && t->s!="/"){
        return stoll(t->s);
    }
    if(t->s=="+"){
        return slove(t->left)+slove(t->right);
    }
    if(t->s=="-"){
        return slove(t->left)-slove(t->right);
    }
    if(t->s=="*"){
        return slove(t->left)*slove(t->right);
    }
    if(t->s=="/"){
        return slove(t->left)/slove(t->right);
    }
}
int main()
{
    int t;
    cin>>t;
    while (t--)
    {
        /* cod]e */
        cin>>n;
        for(int i=0;i<n;i++)
        {
            cin>>a[i];
        }
        tree t=NULL;
        t=taocay(t,0);
        cout<<slove(t)<<endl;

    }

    
}
