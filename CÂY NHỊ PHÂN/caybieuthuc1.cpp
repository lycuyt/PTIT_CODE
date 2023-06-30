#include<bits/stdc++.h>
using namespace std;\
struct node {
    char data;
    node* left;
    node* right;
};
typedef node* tree;
tree makenode(char x)
{
    tree p= new node;
    p->data= x;
    p->left= NULL;
    p->right = NULL;
    return p;
}
void LNR( tree T)
{
    if(T != NULL)
    {
        LNR(T->left);
        cout<<T->data;
        LNR(T->right);
    }
    
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        string s;
        cin>>s;// bieu thuc hau to
        stack<tree> st;
        for(int i=0;i<s.size();i++)
        {
            if(s[i]=='+'|| s[i]=='-'|| s[i]=='*'||s[i]=='/')
            {
                tree tmp=makenode(s[i]);
                tmp->right=st.top();
                st.pop();
                tmp->left=st.top();
                st.pop();
                st.push(tmp);

            }else{
                st.push(makenode(s[i]));
            }

        }
        tree kq= st.top();
        LNR(kq);
        cout<<endl;
    }
    
}