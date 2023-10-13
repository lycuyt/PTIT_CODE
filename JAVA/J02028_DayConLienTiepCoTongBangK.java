import java.util.HashSet;
import java.util.Scanner;

public class J02028_DayConLienTiepCoTongBangK {
    public static void slove(int n, long k, long[] a)
    {
        long [] d = new long[n];
        HashSet<Long> b = new HashSet<>(n);
            
            
        for(int i=0;i<n;i++)
        {
            if(a[i] == k){
                System.out.println("YES");
                return;
            }
            if(i==0)
            {
                d[0] = a[0];
            }else{
                d[i] = d[i-1] + a[i];
            }
            if(d[i]==k){
                System.out.println("YES");
                return;
            }
            
            long tmp = d[i] - k;
            if(b.contains(tmp)==true)
            {
                System.out.println("YES");
                return;
            }
            b.add(d[i]);
        }
        System.out.println("NO");

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n= sc.nextInt();
            long k = sc.nextLong();
            long [] a = new long [n];
            
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextLong();
            }
            slove(n, k, a);
        }
    }
}
