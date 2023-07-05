#include <bits/stdc++.h>
using namespace std;
struct node{
    int infor;
    node *left;
    node *right;
};
typedef node* Tree;
Tree makeNode(int x){
    Tree p = new node;
    p->infor=x;
    p->left=NULL;
    p->right=NULL;
    return p;
}
Tree search(Tree T,int x){
    Tree p = new node;
    if(T==NULL) return T;
    if(T->infor==x) return T;
    p = search(T->left,x);
    if(p==NULL) p = search(T->right,x);
    return p;
}
void addLeft(Tree T, int x, int y){
    Tree p;
    p = search(T,x);
    if(p==NULL) return;
    else if(p->left!=NULL) return;
        else p->left = makeNode(y);
}
void addRight(Tree T, int x, int y){
    Tree p = new node;
    p = search(T,x);
    if(p==NULL) return;
    else if(p->right!=NULL) return;
        else p->right = makeNode(y);
}
void duyet(Tree T)
{
    queue <Tree> q;
    Tree top;
    q.push(T);
    while(q.size())
    {
        top=q.front();
        q.pop();
        cout<<top->infor<<" ";
        if(top->left != NULL) q.push(top->left);
        if(top->right !=NULL) q.push(top->right);
    }
}
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,x,y;
        cin >> n;
        string s;
        Tree T;
        for(int i=0;i<n;i++){
            cin >> x >> y >> s;
            if(i==0) T = makeNode(x);
            if(s=="L") addLeft(T,x,y);
            if(s=="R") addRight(T,x,y);
        }
        duyet(T);
        cout<<endl;
    }
}