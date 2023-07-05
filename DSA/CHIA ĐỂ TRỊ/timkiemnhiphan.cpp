#include<bits/stdc++.h>
using namespace std;
//de qui tim kiem nhi phan
int binarysearch(int a[], int l, int r, int k){
    if(r>=l){
        int mid=(l+r)/2;
        if(a[mid]== k){
            return mid+1;
        }
        if(a[mid]>k){
            return binarysearch(a,l,mid-1,k);
        }
        if(a[mid]<k){
            return binarysearch(a,mid+1,r,k);
        }
    }
    return -1;
}
int binary(int a[], int n, int x){
    int l,r,mid;
    l=0;
    r=n-1;
    mid=(l+r)/2;
    while(l<=r){
        mid=(l+r)/2;
        if(a[mid]==x) return mid+1;
        else if(a[mid]<x) l=mid+1;
        else r=mid-1;
        mid=(l+r)/2;

    }
    return -1;
}
// tim kiem  tuyen tinh
int tuyentinh(int a[], int n, int x)
{
    for(int i=0;i<n;i++)
    {
        if(a[i]==x) return i;
    }
    return -1;
}
// tim kiem noi suy
//alt ctr B
int noisuy(int a[], int n, int x)
{
    int l=0;
    int r=n-1;
    int mid;
    if(x<a[l] || x>a[r]) return -1;
    while(l<=r)
    {
        int pos=l+(((r-l) /(a[r]-a[l]))* (x-a[l]));//xac dinh vi tri
        if(a[pos]== x) return pos;
        if(a[pos]<x) l=pos+1;
        else r=pos-1;

    }
    return -1;
} 

int Interpolation_Search(int A[], int x, int n){ 
    int low = 0,high = n -1, mid;

    while ( A[low] <= x && A[high] >= x){ 
        if (A[high] - A[low] == 0) return (low + high)/2;
            mid = low + ((x - A[low]) * (high - low)) / (A[high] - A[low]);
            if (A[mid] < x) low = mid + 1;
            else if (A[mid] > x) high = mid - 1;
            else return mid;
    }
    if (A[low] == x) return low;
    
    return -1;
}
int fiSearch(int arr[], int x, int n)
{
    if (n == 0)
        return -1;
 
    if (n == 1 && arr[0] == x)
        return 0;
 
    int fibMMm2 = 0;  
    int fibMMm1 = 1;  
    int fibM = fibMMm2 + fibMMm1;  
 
    while (fibM < n) {
        fibMMm2 = fibMMm1;
        fibMMm1 = fibM;
        fibM = fibMMm2 + fibMMm1;
    }
 
    int offset = -1;
 
    while (fibM > 1) {
        int i = min(offset + fibMMm2, n - 1);
 
        if (arr[i] < x) {
            fibM = fibMMm1;
            fibMMm1 = fibMMm2;
            fibMMm2 = fibM - fibMMm1;
            offset = i;
        }
 
        else if (arr[i] > x) {
            fibM = fibMMm2;
            fibMMm1 = fibMMm1 - fibMMm2;
            fibMMm2 = fibM - fibMMm1;
        }
 
        else
            return i;
    }
 
    if (fibMMm1 && arr[offset + 1] == x)
        return offset + 1;
 
    return -1;
}
//tim kiem tam phan
int ternary(int a[], int x, int l, int r)
{
    if(l>r) return -1;
    int mid1= l+(r-l)/3;
    int mid2= l+2*(r-l)/3;
    if(a[mid1]== x) return mid1;
    if(a[mid2]== x) return mid2;
    if(x<a[mid1]) return ternary(a,x,l,mid1-1);
    if(x>a[mid2]) return ternary(a,x,mid2+1,r);
    return ternary(a,x,mid1,mid2);

}
// tim kiem jump
int jump(int a[],int n, int x)
{
    int step=(int)sqrt(n);
    int pre=0;
    int r=min(step,n)-1;
    while(a[r]<x){
        pre=step;
        step+=(int)sqrt(n);
        if(pre>=n)
        {
            return-1;
        }
        r=min(step,n)-1;
    }
    while(a[pre]<x)
    {
        pre++;
        if(pre==min(step,n)) return -1;

    }
    if(a[pre]==x)
    {
        return pre;
    }
    return -1;
}
int main()
{
    clock_t startTime = clock();
    
        int n,k;
        cin>>n>>k;
        int a[n];
        // for(int i=0;i<n;i++) cin>>a[i];
        for (int i = 0; i < n; i++) {
         a[i] = rand(); 
        }
        sort(a,a+n);
        // int vt=binarysearch(a,0,n-1,k);
        // if(vt==-1) cout<<"NO"<<endl;
        // else cout<<vt<<endl;

        // int vt=tuyentinh(a,n,k);
        
        // int vt=binarysearch(a,0,n-1,k);
        // int vt=ternary(a,k,0,n-1);
        // int vt=noisuy(a,n,k);
       int vt=fiSearch(a,k,n);

        clock_t endTime = clock();
        double time = double(endTime - startTime) / CLOCKS_PER_SEC;
        cout <<fixed<<setprecision(10)<< time ;
    
}