#include <bits/stdc++.h>
using namespace std;
int check;
struct Tree{
    int infor;
    Tree *left;
    Tree *right;
};
Tree* makeNode(int x){
    Tree* p = new Tree;
    p->infor=x;
    p->left=NULL;
    p->right=NULL;
    return p;
}
Tree* search(Tree* T,int x){
    Tree* p = new Tree;
    if(T==NULL) return T;
    if(T->infor==x) return T;
    p = search(T->left,x);
    if(p==NULL) p = search(T->right,x);
    return p;
}
void addLeft(Tree *T, int x, int y){
    Tree *p, *q;
    p = search(T,x);
    if(p==NULL) return;
    else if(p->left!=NULL) return;
        else p->left = makeNode(y);
}
void addRight(Tree *T, int x, int y){
    Tree *p = new Tree;
    p = search(T,x);
    if(p==NULL) return;
    else if(p->right!=NULL) return;
        else p->right = makeNode(y);
}
void NLR(Tree *T){
    if(T!=NULL){
        if((T->left==NULL&&T->right!=NULL)||(T->left!=NULL&&T->right==NULL)) {check = 0 ; return;} 
        NLR(T->left);
        NLR(T->right);
    }
}
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,x,y;
        cin >> n;
        string s;
        Tree *T;
        check = 1;
        for(int i=0;i<n;i++){
            cin >> x >> y >> s;
            if(i==0) T = makeNode(x);
            if(s=="L") addLeft(T,x,y);
            if(s=="R") addRight(T,x,y);
        }
        NLR(T);
        cout << check << endl;
    }
}
