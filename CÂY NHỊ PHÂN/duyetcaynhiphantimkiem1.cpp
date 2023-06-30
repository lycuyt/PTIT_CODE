#include<bits/stdc++.h>
using namespace std;
struct node
{
    int infor;
    node* left;
    node* right;
    /* data */
};
typedef node* tree;
tree makenode(int x)
{
    tree p= new node;
    p->infor= x;
    p->left= NULL;
    p->right= NULL;
    return p;
}

void buildtree(tree &t, int x)
{
    if(t == NULL){
        t = makenode(x);
        return;
    }
    if(x < t->infor){
        buildtree(t->left, x);
    }else if(x >t->infor) {
        buildtree(t->right, x);
    }
}
void order(tree t)
{
    if(t != NULL)
    {
        order(t->left);
        order(t->right);
        cout<<t->infor<<" ";
    }
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        tree t= NULL;
        for(int i=0;i<n;i++) {
            int x;
            cin>>x;
            buildtree(t,x);
        }
        order(t);
        cout<<endl;

    }
}