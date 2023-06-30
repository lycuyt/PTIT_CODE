#include<bits/stdc++.h>
using namespace std;
int check=1;
struct node
{
    int infor;
    node *left;
    node *right;
};
typedef node* Tree;
Tree makeNode( int x){
    Tree p = new node;
    p->infor=x;
    p->left=NULL;
    p->right=NULL;
    return p;
}
Tree search(Tree T, int x)
{
    Tree p = new node;
    if(T==NULL) return T;
    if(T->infor==x) return T;
    p = search(T->left,x);
    if(p==NULL) p = search(T->right,x);
    return p;
}
void addLeft(Tree T, int x, int y)
{
    Tree p;
    p=search(T, x);
    if(p==NULL) return;
    else if(p->left != NULL) return;
    else p->left= makeNode(y);
}
void addRight(Tree T, int x, int y)
{
    Tree p= new node;
    p=search(T, x);
    if(p==NULL) return;
    else if(p->right != NULL) return;
    else p-> right = makeNode(y);
}
int NLR(Tree T){
    if(T!=NULL){
        if((T->left==NULL&&T->right!=NULL)||(T->left!=NULL&&T->right==NULL)) { return 0;} 
        NLR(T->left);
        NLR(T->right);
    }
    return 1;
}
int countleaf( Tree T)
{
    if(T==NULL) return 0;
    if(T->left == NULL && T-> right== NULL) return 1;
    else return countleaf(T->left)+ countleaf(T->right);
}
int main()
{
    int t;
    cin >> t;
    while(t--){
        int n,x,y;
        cin >> n;
        string s;
        check=1;
        Tree T;
        for(int i=0;i<n;i++){
            cin >> x >> y >> s;
            if(i==0) T = makeNode(x);
            if(s=="L") addLeft(T,x,y);
            if(s=="R") addRight(T,x,y);
        }
        if(countleaf(T->left)==countleaf(T->right) && NLR(T)) cout<<"Yes"<<endl;
        else cout<<"No"<<endl;
    }
}