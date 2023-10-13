import java.util.Scanner;

public class J02036_UocSoChungLonNhat {
    public static Scanner sc = new Scanner(System.in);
    public static int gcd(int a, int b)
    {
        while(b!=0)
        {
            int r = a%b;
            a= b;
            b= r;
        }
        return a;
    }
    public static int lcm(int a, int b){
        int res = (a*b)/gcd(a, b);
        return res;
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int [] a = new int[n];
            int [] b= new int[n+1];
            for(int i=0;i<n;i++)
            {
                a[i]= sc.nextInt();
            }
            b[0]=a[0];
            for(int i=1;i<n;i++)
            {
                b[i]=lcm(a[i-1], a[i]);
            }
            b[n]= a[n-1];
            for( int x : b){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
