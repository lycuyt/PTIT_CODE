#include<bits/stdc++.h>
using namespace std;
int x[20]; 
int b[5][5];
char a[5][5];
char c[5][5];
int dem=16;
int kt=-1;
int checkw(char a[5][5])
{
    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=4;j++)
        {
            if(a[i][j]=='b') return 0;
        }
    }
    return 1;
}
int checkb(char a[5][5])
{
    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=4;j++)
        {
            if(a[i][j]=='w') return 0;
        }
    }
    return 1;
}
void ex(char &a){
    if(a=='b'){
        a='w';
    }else{
        a='b';
    }
}
void xuli()
{
    // reset mang a
    for(int i=1;i<=4;i++){
        for(int j=1;j<=4;j++){
            a[i][j]=c[i][j];
            
        }
     }
     // cho xau np ứng vơi tung phan tu cua mang b
    int l=1;
    for(int i=1;i<=4;i++){
        for(int j=1;j<=4;j++){
            b[i][j]=x[l];
            l++;
        }
    }
    int ans=0;
            // mang b chua so cach lat
    for(int i=1;i<=4;i++){
        for(int j=1;j<=4;j++){
            if(b[i][j]==1){
                        // lat cac xu o mang a
                ans++;
                ex(a[i][j]);
                if(i-1>=1 && i-1<=4 && j>=1 && j<=4){
                    ex(a[i-1][j]);
                }
                if(i+1<=4 && i+1>=1 && j>=1 && j<=4){
                    ex(a[i+1][j]);
                }
                if(j-1>=1 && j-1<=4 && i>=1 && i<=4){
                    ex(a[i][j-1]);
                }
                if(j+1>=1 && j+1<=4 && i>=1 && i<=4){
                    ex(a[i][j+1]);
                }
                }
        }
    }
    if(checkw(a) || checkb(a)){
        dem=min(ans, dem);
        kt=1;
    } 
}

// sinh xau nhi phan 16 bit, 1 la lat, 0 la khong lat
void Try(int i)
{
    for(int j=0;j<=1;j++){
        x[i]=j;
        if(i==16){
            // xu li so bit 1, va so bit 0
            xuli();
            
        }else{
            Try(i+1);
        }
    }
}
int main()
{
    
    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=4;j++){
            cin>>c[i][j];
        }
    }
    // dua ve toan ngua # toan w
    Try(1);
    if(kt==-1){
        cout<<-1;
    }else{
        cout<<dem;
    }

}